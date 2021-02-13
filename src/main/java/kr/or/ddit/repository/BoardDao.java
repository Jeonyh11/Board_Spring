package kr.or.ddit.repository;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.model.BoardVo;

@Repository("boardDao")
public class BoardDao implements BoardDaoI{

	@Resource(name="sqlSessionTemplate")
	SqlSessionTemplate template;
	
	@Override
	public List<BoardVo> selectAllBoard() {
		
		return template.selectList("jboard.selectAllBoard");
	}

	@Override
	public BoardVo selectBoard(String board_no) {
		
		return template.selectOne("jboard.selectBoard", board_no);
		 
	}

	@Override
	public int insertBoard(BoardVo boardVo) {

		return template.insert("jboard.insertBoard", boardVo);
	}

}
