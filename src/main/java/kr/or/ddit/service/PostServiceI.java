package kr.or.ddit.service;

import java.util.Map;

import kr.or.ddit.model.PageVo;
import kr.or.ddit.model.PostVo;



public interface PostServiceI {
	
	Map<String, Object> selectPagingPost(PageVo vo);
	
	int insertPost(PostVo vo);
	
	PostVo selectPost(String p_no);

}
