package com.xiaozhi.springAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author mzj
 * @Date 2021/4/12 0012 10:50
 * @Version 1.0
 */

@Component
@Aspect
public class UserServiceAop {

	@Pointcut("execution(* com.xiaozhi.springAop.UserServiceImpl.insertUser(..))")
	public void ponitCut() {
	}

	@Before("ponitCut()")
	public void beforeAdvice() {
		System.out.println("beforeAdvice");
	}

	@After("ponitCut()")
	public void afterAdvice() {
		System.out.println("afterAdvice");
	}

	//环绕通知。注意要有ProceedingJoinPoint参数传入
	@Around("ponitCut()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around..before");
		pjp.proceed();//执行方法
		System.out.println("around..after");
	}

}
