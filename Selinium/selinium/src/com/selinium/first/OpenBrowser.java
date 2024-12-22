package com.selinium.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		WebDriver dr = new FirefoxDriver(); // open browser
		dr.get("https://www.github.com/");
		dr.get("https://www.google.com/");
//		WebDriver dr1 = new ChromeDriver();
//		dr1.get("https://www.github.com/manishdevlikar");  // open web page
//		dr.manage().window().minimize();
//		 dr1.manage().window().maximize(); // how maximize the web page		 
		 try {
			 dr.navigate().back();
//			 Thread.sleep(5000);
//			 dr1.close();
		 }catch (Exception e) {
			
		}
	}

}
