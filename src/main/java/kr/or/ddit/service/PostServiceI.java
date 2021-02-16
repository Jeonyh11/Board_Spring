package kr.or.ddit.service;

import java.util.Map;

import kr.or.ddit.model.JfileVo;
import kr.or.ddit.model.PageVo;
import kr.or.ddit.model.PostVo;



public interface PostServiceI {
	
	Map<String, Object> selectPagingPost(PageVo vo);
	
	int insertPost(PostVo vo);
	
	PostVo selectPost(String p_no);
	
	//첨부 파일 관련
	
	int insertJfile(JfileVo vo);
	
	int MaxPno();
	
	JfileVo selectJfile(String p_no);
	
	//게시글 삭제
	int deleteJpost(String p_no);
	
	//파일 삭제
	int deleteJfile(String p_no);
	
	//답글 삭제
	int deleteJcomment(String p_no);
	
	//게시글 수정
	int updateJpost(PostVo vo);
	
	int updateJfile(PostVo vo);

}
