package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Pointcut("execution(public * com.ssafy.aop.*.coding())")
	public void mypt() {}
	
	@Before("mypt()")
	public void before() {
		System.out.println("컴퓨터를 부팅한다.");
	}
	
	@AfterReturning(value="mypt()", returning = "num")
	public void afterReturning(int num) {
		System.out.println("Git Push 한다. : " + num + "개의 코드를");
	}
	
	@AfterThrowing(value="mypt()", throwing = "th")
	public void afterThrowing(Throwable th) {
		System.out.println("반차를 낸다.");
		if(th instanceof OuchException) {
			((OuchException)th).handleException();
		}
	}
	
	@After("mypt()")
	public void after() {
		System.out.println("보람찬 하루를 마무리한다.");
	}
	/////////////////////////////
	// around
	
	@Around("mypt()")
	public int around(ProceedingJoinPoint pjt) {
		int num = 0;
		
		this.before();
		
		try {
			num = (int) pjt.proceed();
			this.afterReturning(num);
		} catch (Throwable e) {
			this.afterThrowing(e);
		} finally {
			this.after();
		}
		return num;
	}
	
}
