package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	WebDriver dr = null;

	@Test
	@Parameters({ "us", "pw" })
	public void f(String us, String pw) {

		dr.get("https://practicetestautomation.com/practice-test-login/");
		dr.findElement(By.id("username")).sendKeys(us);
		dr.findElement(By.id("password")).sendKeys(pw);
		dr.findElement(By.id("submit")).click();
	}

	@BeforeTest
	public void before() {
		dr = new ChromeDriver();
	}

	@AfterTest
	public void close() {
		try {
			Thread.sleep(5000);
			dr.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
