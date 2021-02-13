package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.model.BoardVo;


public interface BoardServiceI {

	List<BoardVo> selectAllBoard();

	BoardVo selectBoard(String board_no);
	
	int insertBoard(BoardVo boardVo);
}
