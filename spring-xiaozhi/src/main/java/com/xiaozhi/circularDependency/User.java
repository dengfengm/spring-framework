package com.xiaozhi.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author mzj
 * @Date 2021/3/17 0017 11:45
 * @Version 1.0
 */
@Service
public class User {

	User() {
		System.out.println("create user!");
	}

	@Autowired
	public Hello hello;

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}
}
