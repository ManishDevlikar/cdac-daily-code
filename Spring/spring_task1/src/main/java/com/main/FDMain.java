package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.beans.Film;

public class FDMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		Film bean = context.getBean(Film.class);
//		System.out.println(bean.getTitle());
		System.out.println(context.getBean(Film.class));
		
	}
}
