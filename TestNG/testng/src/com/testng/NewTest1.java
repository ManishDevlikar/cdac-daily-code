package com.testng;

import org.testng.annotations.Test;

public class NewTest1 {

	@Test(priority = 1)
	public void register() {
		System.out.println("regiser");
	}

	@Test()
	public void login() {
		System.out.println("login");
	}

	@Test()
	public void home() {
		System.out.println("home");
	}

	@Test()
	public void logout() {
		System.out.println("logout");
	}

}
