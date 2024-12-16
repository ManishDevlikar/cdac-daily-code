package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfigByJava;

public class MainByJava {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigByJava.class);
		Object movie = context.getBean("myFilm");
		System.out.println(movie);
	}

}
