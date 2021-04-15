package com.xiaozhi.springAop;

import org.springframework.stereotype.Component;

/**
 * @Author mzj
 * @Date 2021/4/12 0012 10:48
 * @Version 1.0
 */
@Component
public class UserServiceImpl implements UserService{

	public void insertUser() {
		System.out.println("insert user");
	}

	public boolean updateUser() {
		System.out.println("update user");
		return true;
	}

}
