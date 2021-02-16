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
	
	// ÷������ ����
	int insertJfile(JfileVo vo);
	
	int MaxPno();
	
	JfileVo selectJfile(String p_no);
	
	//�Խñ� ����
	int deleteJpost(String p_no);

	// ��� ����
	int deleteJcomment(String p_no);
	
	//���� ����
	int deleteJfile(String p_no);
	
	//�Խñ� ����
	int updatePost(PostVo vo);
	
	int updateFile(PostVo vo);

}
