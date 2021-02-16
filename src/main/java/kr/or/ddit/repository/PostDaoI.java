package kr.or.ddit.repository;

import java.util.List;

import kr.or.ddit.model.JfileVo;
import kr.or.ddit.model.PageVo;
import kr.or.ddit.model.PostVo;

public interface PostDaoI {
	
	
	List<PostVo> selectPagingPost(PageVo vo);
	
	
	int PostCnt();
	

	int insertPost(PostVo vo);
	
	
	PostVo selectPost(String p_no);
	
	// 첨부파일 관련
	int insertJfile(JfileVo vo);
	
	int MaxPno();
	
	JfileVo selectJfile(String p_no);
	
	//게시글 삭제
	int deleteJpost(String p_no);

	// 답글 삭제
	int deleteJcomment(String p_no);
	
	//파일 삭제
	int deleteJfile(String p_no);
	
	//게시글 수정
	int updatePost(PostVo vo);
	
	int updateFile(PostVo vo);

}
