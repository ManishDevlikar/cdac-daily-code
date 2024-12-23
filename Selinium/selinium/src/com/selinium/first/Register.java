package com.selinium.first;

import java.sql.Driver;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
	public static void main(String[] args) {
		
	
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Register.html");
		dr.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("manish");
		dr.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("dev");
		dr.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("dg36re723r2 d3bd");
		dr.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("manishdevlikar@gmail.com");
		dr.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("6524727211");
		dr.findElement(By.xpath("//input[@value='FeMale']")).click();
		
		// how to handle drop down list
		/*
		 -> to handle drop down list we will use class select.
		 
		 
		 ->  webElement
		 we will use web element for 3 purpose to 
		 handle or automate to 
		 perform multiple operation to 
		 fetch data that enter into the textbox
		 */
		WebElement we = dr.findElement(By.id("Skills"));
		Select sr = new Select(we);
		sr.selectByIndex(1);
		sr.selectByValue("C++");
		sr.selectByContainsVisibleText("C");
		sr.selectByValue("C++");
		

		WebElement we2 = dr.findElement(By.id("countries"));
		Select sr1 = new Select(we2);
		sr1.selectByIndex(0);
		
		// how to perform multiple operation
		// click ->enter->clear->newEnter
		
		WebElement we3= dr.findElement(By.xpath("//input[@ng-model='FirstName']"));
		
	String str[]= {"nishant","manish","shubham","pasha","sky","darshan"};
		for (String s:str) {
			try {
				we3.clear();
				we3.click();
				we3.sendKeys(s);
				Thread.sleep(1000);
				we3.clear();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
