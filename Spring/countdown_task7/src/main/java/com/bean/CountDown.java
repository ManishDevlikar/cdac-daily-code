package com.bean;

import org.springframework.stereotype.Component;

@Component
public class CountDown {
	public void countdown() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
