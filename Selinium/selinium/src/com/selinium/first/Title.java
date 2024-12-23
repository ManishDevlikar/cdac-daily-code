package com.selinium.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) {
	// how to fetch data that enter into textbox	
		WebDriver dr2 = new ChromeDriver();
		dr2.get("https://www.gmail.com");
		System.out.println(dr2.getTitle());
		
		if(dr2.getTitle().equals("Gmail")) {
			System.out.println("Yes 🫡");
		}else {
			System.out.println("🤦‍♂️");
		}
	}
}
