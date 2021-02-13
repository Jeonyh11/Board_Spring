package kr.or.ddit.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.model.UserVo;
import kr.or.ddit.repository.UserDaoI;

@Service("userService")
public class UserService implements UserServiceI {
	
	@Resource(name="userDao")
	private UserDaoI userDao;
	

	@Override
	public UserVo selectUser(String userid) {
		
		return userDao.selectUser(userid);
	}

}
