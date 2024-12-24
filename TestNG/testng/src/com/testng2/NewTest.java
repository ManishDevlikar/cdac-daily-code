package com.testng2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		System.out.println("one");
	}

	@Test
	public void f1() {
		System.out.println("two");
	}
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("inside before m");
//  }

	@AfterMethod
	public void afterMethod() {
		System.out.println("inside after m");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("inside before c");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("inside after c");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("inside before t");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("inside after t");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inside before s");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("inside after s");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("inside before m");
	}

}
