package com.xiaozhi.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author mzj
 * @Date 2021/3/17 0017 11:45
 * @Version 1.0
 */
@Service
public class Hello {

	Hello() {
		System.out.println("create hello!");
	}

	@Autowired
	public User user;

	public void sayHello() {
		System.out.println("Hello world!");
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
