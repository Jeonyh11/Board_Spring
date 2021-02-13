package kr.or.ddit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

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

}
