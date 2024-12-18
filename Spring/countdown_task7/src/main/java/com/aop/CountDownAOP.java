package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CountDownAOP {
	@Pointcut("execution(* com.bean.*.countdown(..))")
	public void countDownPointCut() {
	};

	@Before("countDownPointCut()")
	public void beforeCountDown() {
		System.out.println("new Start 😎");
	}

	@AfterThrowing("countDownPointCut()")
	public void afterThrowingCountDown() {
		System.out.println("break down 😔");
	}

	@After("countDownPointCut()")
	public void afterCountDown() {
		System.out.println("its over 📉");
	}
}
