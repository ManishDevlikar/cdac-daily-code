package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.GingerTea;
import com.config.TeaConfig;

public class TeaMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeaConfig.class); 
		GingerTea Obj = context.getBean(GingerTea.class);
		Obj.makeTea();
	}
}
