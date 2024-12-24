package com.testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {

	WebDriver dr = new ChromeDriver();

	@Test
	public void f() {

		try {
			System.out.println("doing it");
			dr.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("manish");
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@BeforeTest(enabled = true)
	public void beforeTest() {
		System.out.println("before doing 😊");
		dr.get("https://demo.automationtesting.in/Register.html");
//		throw new SkipException("throwing it");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after doing 😰");
		dr.close();

	}

}
