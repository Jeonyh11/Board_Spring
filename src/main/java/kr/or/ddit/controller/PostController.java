package kr.or.ddit.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.model.BoardVo;
import kr.or.ddit.model.JfileVo;
import kr.or.ddit.model.PageVo;
import kr.or.ddit.model.PostVo;
import kr.or.ddit.service.BoardServiceI;
import kr.or.ddit.service.PostServiceI;

@Controller
@RequestMapping("postControll")
public class PostController{
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@Resource(name="boardService")
	private BoardServiceI boardService;
	
	@Resource(name="postService")
	private PostServiceI postService;
	
	@RequestMapping("pagingView")
	public String PagingView(String board_no, Model model) {
		
		int page = 1;
		int pageSize = 10;
		
		List<BoardVo> boardList = boardService.selectAllBoard();
		
		PageVo vo = new PageVo(page, pageSize, board_no);
		
		Map<String, Object> map =  postService.selectPagingPost(vo);
		
		int cnt = (int) map.get("pCnt");
		List<PostVo> postList = (List<PostVo>) map.get("postList");
		
		BoardVo BoardVo = boardService.selectBoard(board_no);
	
		logger.debug("postList : {}", postList);
		
		int pagination = (int) Math.ceil((double)cnt/pageSize);
		
		model.addAttribute("postList", postList);
		model.addAttribute("PageVo", vo);
		model.addAttribute("pagination", pagination);
		model.addAttribute("boardList", boardList);
		model.addAttribute("board_no", board_no);
		model.addAttribute("boardVo", BoardVo);
		
		return "tiles.post.postList";
	}
	
	@RequestMapping("detailView")
	public String DetailView(int pnumber, int board_no, Model model) {
		
		String p_no = Integer.toString(pnumber);
		String b_no = Integer.toString(board_no);
		
		PostVo postVo = postService.selectPost(p_no);
		JfileVo jfVo = postService.selectJfile(p_no);
		List<BoardVo> boardList =  boardService.selectAllBoard();
		BoardVo BoardVo = boardService.selectBoard(b_no);
		
		model.addAttribute("jfVo", jfVo);
		model.addAttribute("boardList", boardList);
		model.addAttribute("postVo", postVo);
		model.addAttribute("boardVo", BoardVo);
		
		return "tiles.post.postDetail";
	}
	
	@RequestMapping("regist")
	public String RegistView(String board_no, Model model) {
		
		List<BoardVo> boardList = boardService.selectAllBoard();
		BoardVo BoardVo = boardService.selectBoard(board_no);
		
		model.addAttribute("board_no", board_no);
		model.addAttribute("boardList", boardList);
		model.addAttribute("boardVo", BoardVo);
		
		return "tiles.post.postRegist";
	}
	
	
	@RequestMapping(path="registed", method = {RequestMethod.POST})
	public String Registed(PostVo postVo, MultipartFile file) {
		JfileVo JfVo = new JfileVo();
		String originalFilename = "";
		String filename="";
		JfVo.setFilename(originalFilename);
		JfVo.setRealfilename(filename);
		JfVo.setF_no("");
		
		if(file.getSize() > 0) {		
			 originalFilename = file.getOriginalFilename();
			 filename = UUID.randomUUID().toString() + "." + originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
			
			JfVo.setFilename(originalFilename);
			JfVo.setRealfilename("d:\\upload\\" + filename);
			JfVo.setF_no("");
			
		try {
			file.transferTo(new File("d:\\upload\\"+ file.getOriginalFilename()));
			} catch(IllegalStateException | IOException e){		
				e.printStackTrace();
			}
		}
		
			Date p_reg_dt = new Date();
			
			postVo.setP_reg_dt(p_reg_dt);
			postVo.setUserid(postVo.getUserid());
			postVo.setBoard_no(postVo.getBoard_no());
			
			
			int Pno = 0;
			int insertF = 0;
			int insertP = 0;
			int board_no = Integer.parseInt(postVo.getBoard_no());
			
			insertP = postService.insertPost(postVo);
			Pno = postService.MaxPno();
			logger.debug(" 등록 된 게시글 번호 : {}", Pno);	
			JfVo.setP_no(Integer.toString(Pno));
			insertF = postService.insertJfile(JfVo);
			
			if(insertP == 1 || insertF == 1) {
				logger.debug(" 게시글 등록이 되면 1 : {}", insertP);
					
				return "redirect:/postControll/detailView?pnumber="+Pno+"&board_no="+board_no;
			}else {
				return "redirect:/postControll/regist?board_no="+board_no;
			}
	}
	
	@RequestMapping(path="sujeong")
	public String SujungView(PostVo postVo, Model model) {
		
		PostVo Vo = postService.selectPost(postVo.getP_no());
		JfileVo jfVo = postService.selectJfile(postVo.getP_no());
		
		model.addAttribute("postVo", Vo);
		model.addAttribute("jfVo", jfVo);
		
		return "tiles.post.postModify";
	}
	
	@RequestMapping(path="sackjae", method = {RequestMethod.POST})
	public String SackJaeView(String p_no, String board_no) {
		
		postService.deleteJpost(p_no);
		postService.deleteJcomment(p_no);
		postService.deleteJfile(p_no);
		
		return "redirect:/postControll/pagingView?board_no="+board_no;
	}
}
