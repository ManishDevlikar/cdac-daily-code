package com.selinium.first;

import java.sql.Driver;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;

public class TabHandling {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		// open google
		dr.get("https://www.google.com");
		String pw = dr.getWindowHandle();
		
		 dr.switchTo().newWindow(WindowType.TAB); 
		 dr.get("https://www.gmail.com");
		 String cw1 = dr.getWindowHandle();
		 
		 
		 dr.switchTo().newWindow(WindowType.TAB);
		 dr.get("https://www.github.com");
		 dr.switchTo().window(pw);
		 String cw2 = dr.getWindowHandle();
		 
		 
		 dr.switchTo().newWindow(WindowType.TAB);
		 dr.get("https://www.github.com/manishdevlikar");
		 String cw3 = dr.getWindowHandle();
		 
		 
		 
		 
		 
		 
		 
		 try {
			 Thread.sleep(2000);
			 dr.switchTo().window(cw3);
			 dr.switchTo().window(cw1);
			 dr.switchTo().window(cw2);
			 dr.close();
		 }catch (Exception e) {
			// TODO: handle exception
		}
	}
}
