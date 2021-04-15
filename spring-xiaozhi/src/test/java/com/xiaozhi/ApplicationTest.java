package com.xiaozhi;

import com.xiaozhi.circularDependency.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author mzj
 * @Date 2021/3/17 0017 16:09
 * @Version 1.0
 */
public class ApplicationTest {

	@Test
	public void BeanTest() {
		AbstractXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring-context-test.xml");
		com.xiaozhi.circularDependency.Hello hello = (Hello) ac.getBean("hello");
		hello.sayHello();
	}
}
