package kr.or.ddit.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.model.BoardVo;
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
		List<BoardVo> boardList =  boardService.selectAllBoard();
		BoardVo BoardVo = boardService.selectBoard(b_no);
		
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

}
