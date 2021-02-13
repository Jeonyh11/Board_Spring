package kr.or.ddit.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.model.BoardVo;
import kr.or.ddit.repository.BoardDaoI;

@Service("boardService")
public class BoardService implements BoardServiceI{

	@Resource(name = "boardDao")
	private BoardDaoI boardDao;
		
	@Override
	public List<BoardVo> selectAllBoard() {
		
		return boardDao.selectAllBoard();
	}

	@Override
	public BoardVo selectBoard(String board_no) {
		
		return boardDao.selectBoard(board_no);
	}

	@Override
	public int insertBoard(BoardVo boardVo) {
		
		return boardDao.insertBoard(boardVo);
	}

}
