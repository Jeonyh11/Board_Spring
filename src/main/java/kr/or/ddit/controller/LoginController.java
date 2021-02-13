package kr.or.ddit.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
