package com.xiaozhi;

import org.springframework.stereotype.Service;

/**
 * @Author mzj
 * @Date 2021/3/17 0017 11:45
 * @Version 1.0
 */
@Service("hello")
public class Hello {

	public void sayHello() {
		System.out.println("Hello world!");
	}

}
