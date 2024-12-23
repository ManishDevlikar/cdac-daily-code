package com.selinium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//user-name password login-button
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		try {
			
			driver.findElement(By.className("bm-burger-button")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("logout_sidebar_link")).click();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
