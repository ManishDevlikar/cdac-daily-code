package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Recipe {
	@Pointcut("execution(* com.bean.*.makeTea(..))")
	private void myRecipe() {};
	
	@Before("myRecipe()")
	public void turnOnGas() {
		System.out.println("gas started");
		System.out.println("milk boiled");
		System.out.println("added tea leaves and sugar");
		System.out.println("add ginger");
		System.out.println("strain the tea");
	}
	
	@AfterReturning("myRecipe()")
	public void eatBiskoot() {
		System.out.println("biskoot khaa lo ji");
	}
	
	@AfterThrowing("myRecipe()")
	public void addSugar() {
		System.out.println("cheeni kam h ji yea lo cheeni");
	}
	
	@After("myRecipe()")
	public void glassDhule() {
		System.out.println("biwi toh hai nahi khud bartan dho!");
	}
}
