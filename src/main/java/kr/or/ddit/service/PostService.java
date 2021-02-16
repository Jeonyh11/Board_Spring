package kr.or.ddit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.model.JfileVo;
import kr.or.ddit.model.PageVo;
import kr.or.ddit.model.PostVo;
import kr.or.ddit.repository.PostDaoI;


@Service
public class PostService implements PostServiceI{
	
	@Resource(name="postDao")
	private PostDaoI postDao;

	@Override
	public Map<String, Object> selectPagingPost(PageVo vo) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<PostVo> postList =  postDao.selectPagingPost(vo);
		int pCnt = postDao.PostCnt();
			
		map.put("postList", postList);
		map.put("pCnt", pCnt);
			
			
		return map;
	}

	@Override
	public int insertPost(PostVo vo) {
		
		return postDao.insertPost(vo);
	}

	@Override
	public PostVo selectPost(String p_no) {
		
		return postDao.selectPost(p_no);
	}

	//첨부 파일 관련
	@Override
	public int insertJfile(JfileVo vo) {
		return postDao.insertJfile(vo);
	}

	@Override
	public int MaxPno() {
		return postDao.MaxPno();
	}

	@Override
	public JfileVo selectJfile(String p_no) {
		return postDao.selectJfile(p_no);
	}

	@Override
	public int deleteJcomment(String p_no) {
		return postDao.deleteJcomment(p_no);
	}

	@Override
	public int deleteJpost(String p_no) {
		return postDao.deleteJpost(p_no);
	}

	@Override
	public int deleteJfile(String p_no) {
		return postDao.deleteJfile(p_no);
	}

	@Override
	public int updateJpost(PostVo vo) {
		return postDao.updatePost(vo);
	}

	@Override
	public int updateJfile(PostVo vo) {
		return postDao.updateFile(vo);
	}

}
