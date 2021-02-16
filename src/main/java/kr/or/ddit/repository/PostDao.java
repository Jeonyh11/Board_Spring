package kr.or.ddit.repository;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.model.JfileVo;
import kr.or.ddit.model.PageVo;
import kr.or.ddit.model.PostVo;



@Repository("postDao")
public class PostDao implements PostDaoI{
	
	@Resource(name = "sqlSessionTemplate")
	SqlSessionTemplate template;
	

	@Override
	public List<PostVo> selectPagingPost(PageVo vo) {
				
		return template.selectList("jpost.selectPagingPost",vo);
		
	}

	@Override
	public int PostCnt() {		
		
		return template.selectOne("jpost.PostCnt");
	}

	@Override
	public int insertPost(PostVo vo) {
		
		return template.insert("jpost.insertPost", vo);
		
		
			 
		
		
	}

	
	@Override
	public PostVo selectPost(String p_no) {
	
		return template.selectOne("jpost.selectPost", p_no);
	}

	// 첨부파일 관련
	@Override
	public int insertJfile(JfileVo vo) {
				
		return template.insert("jfile.insertJfile", vo);
		
	}

	@Override
	public int MaxPno() {
		return template.selectOne("jpost.MaxPno");
		
	}

	@Override
	public JfileVo selectJfile(String p_no) {
		return template.selectOne("jfile.selectJfile", p_no);
	}

	
	//답글 삭제
	@Override
	public int deleteJcomment(String p_no) {
		return template.delete("jcomment.delete", p_no);
	}

	@Override
	public int deleteJpost(String p_no) {
		return template.delete("jpost.delete", p_no);
	}

	@Override
	public int deleteJfile(String p_no) {
		return template.delete("jfile.delete", p_no);
	}

	@Override
	public int updatePost(PostVo vo) {
		return template.update("jpost.update", vo);
	}

	@Override
	public int updateFile(PostVo vo) {
		return template.update("jfile.update", vo);
	}
	
	
	
	

}
