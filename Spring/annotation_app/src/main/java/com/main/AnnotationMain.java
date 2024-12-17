package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.Person;

public class AnnotationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Person.class);
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
