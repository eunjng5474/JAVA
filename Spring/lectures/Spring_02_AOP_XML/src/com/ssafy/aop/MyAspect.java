package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void before() {
		System.out.println("컴퓨터를 부팅한다.");
	}
	
	public void afterReturning(int num) {
		System.out.println("Git Push 한다. : " + num + "개의 코드를");
	}

	public void afterThrowing(Throwable th) {
		System.out.println("반차를 낸다.");
		if(th instanceof OuchException) {
			((OuchException)th).handleException();
		}
	}
	
	public void after() {
		System.out.println("보람찬 하루를 마무리한다.");
	}
	/////////////////////////////
	// around
	
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
