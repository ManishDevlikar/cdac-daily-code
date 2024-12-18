package com.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.CountDown;
import com.config.CountDownConfig;

public class CountDownMain {
	public static void main(String[] args) throws BeansException, InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountDownConfig.class);

		context.getBean(CountDown.class).countdown();
	}
}
