package kr.or.ddit.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.ddit.model.BoardVo;
import kr.or.ddit.model.UserVo;
import kr.or.ddit.service.BoardServiceI;
import kr.or.ddit.service.UserServiceI;

@Controller
@RequestMapping("login")
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Resource(name="userService")
	private UserServiceI userService;
	
	@Resource(name="boardService")
	private BoardServiceI boardService;
	
	@RequestMapping("view")
	public String LoginView() {
		return "main/login";
	}
	
	@RequestMapping("manager")
	public String manage(Model model) {
		
		List<BoardVo> boardList = boardService.selectAllBoard();
		
		model.addAttribute("boardList", boardList);
		
		return "tiles.main.management";
	}
	
	@RequestMapping(path="fix", method= {RequestMethod.POST})
	public String FixView(String board_nm, HttpServletRequest request) {
		
		String[] select = request.getParameterValues("choice");
		
		BoardVo boardVo = new BoardVo();
		String st ="";
		for(String state : select) {
			 st = state;
		}
		System.out.println(st);
		
		boardVo.setBoard_st(st);
		boardVo.setBoard_nm(board_nm);
		logger.debug("boardnm: {}", board_nm);
		
		int success = boardService.updateBoard(boardVo);
		
		if(success == 1) {
			return "redirect:/login/manager";
		}else {
			return "redirect:/login/manager";
		}
	}
	
	
	@RequestMapping("create")
	public String Create(String board_nm, String choice) {
		
		BoardVo boardVo = new BoardVo("", board_nm , choice);
		
		boardService.insertBoard(boardVo);
		
		return "redirect:/login/manager";
	}
	
	
	@RequestMapping(path="success", method= {RequestMethod.POST})
	public String LogNext(UserVo userVo, HttpSession session, Model model) {
		
		UserVo user = userService.selectUser(userVo.userid);
		
		List<BoardVo> boardList =  boardService.selectAllBoard();
		
		model.addAttribute("boardList", boardList);
		
		session.setAttribute("S_USER", user);
		
	
		return "tiles.main.main";
	}
}
