package kr.or.ddit.repository;

import java.util.List;

import kr.or.ddit.model.BoardVo;



public interface BoardDaoI {

	List<BoardVo> selectAllBoard();
		
	BoardVo selectBoard(String board_no);
	
	int insertBoard(BoardVo boardVo);
}
