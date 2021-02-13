package kr.or.ddit.repository;

import java.util.List;

import kr.or.ddit.model.PageVo;
import kr.or.ddit.model.PostVo;

public interface PostDaoI {
	
	
	List<PostVo> selectPagingPost(PageVo vo);
	
	
	int PostCnt();
	

	int insertPost(PostVo vo);
	
	
	PostVo selectPost(String p_no);

}
