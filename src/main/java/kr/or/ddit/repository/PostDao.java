package kr.or.ddit.repository;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

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
	
	

}
