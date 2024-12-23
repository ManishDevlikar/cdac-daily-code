package com.selinium.first;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Alerts.html");
		dr.findElement(By.id("OKTab")).click();
		/*
		-> how to handle alerts
		 alert is a pop up which can not be inspect 
		 use interface (Alert) 
		 */
		
		try {
			Thread.sleep(2000);
			Alert al=dr.switchTo().alert();
			String text = al.getText();
			System.out.println(text);
			al.accept();			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			Thread.sleep(10000);
			dr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
