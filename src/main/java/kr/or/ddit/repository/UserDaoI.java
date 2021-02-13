package kr.or.ddit.repository;

import kr.or.ddit.model.UserVo;

public interface UserDaoI {
	
	UserVo selectUser(String userid);
}
