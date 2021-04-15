package com.xiaozhi;

import com.xiaozhi.springAop.UserService;
import com.xiaozhi.springAop.UserServiceImpl;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author mzj
 * @Date 2021/3/17 0017 16:04
 * @Version 1.0
 */
public class Application {
	public static void main(String[] args){
		AbstractXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
//		Hello hello = (Hello)ac.getBean("hello");
//		hello.getUser().getHello().sayHello();

//		XiaoZhiRole xiaozhi = (XiaoZhiRole)ac.getBean("xiaoZhiRole");
//		System.out.println(xiaozhi.toString());

//		TulingLog log = (TulingLog)ac.getBean("tuLingLog");
//		System.out.println(log.log());

		UserService userService = (UserService) ac.getBean("userServiceImpl");
		userService.insertUser();
		ac.close();
	}
}
