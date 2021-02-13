package kr.or.ddit.repository;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.model.UserVo;

@Repository("userDao")
public class UserDao implements UserDaoI {

	@Resource(name="sqlSessionTemplate")
	SqlSessionTemplate template;
	
	
	@Override
	public UserVo selectUser(String userid) {
		
		return template.selectOne("users.selectUser", userid);
	
	}

}
