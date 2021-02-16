package kr.or.ddit.service;

import java.util.Map;

import kr.or.ddit.model.JfileVo;
import kr.or.ddit.model.PageVo;
import kr.or.ddit.model.PostVo;



public interface PostServiceI {
	
	Map<String, Object> selectPagingPost(PageVo vo);
	
	int insertPost(PostVo vo);
	
	PostVo selectPost(String p_no);
	
	//÷�� ���� ����
	
	int insertJfile(JfileVo vo);
	
	int MaxPno();
	
	JfileVo selectJfile(String p_no);
	
	//�Խñ� ����
	int deleteJpost(String p_no);
	
	//���� ����
	int deleteJfile(String p_no);
	
	//��� ����
	int deleteJcomment(String p_no);
	
	//�Խñ� ����
	int updateJpost(PostVo vo);
	
	int updateJfile(PostVo vo);

}
