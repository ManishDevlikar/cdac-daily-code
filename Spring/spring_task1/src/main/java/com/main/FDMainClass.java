package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.FDConfigClass;

public class FDMainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FDConfigClass.class);
		Object movie = context.getBean("myFilm");
		System.out.println(movie);
	}
}
