package com.testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	public void propertySetting() {
		System.out.println("Property Setting");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeClass
	public void launchUrl() {
		System.out.println("Launch Url");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}
	
	@Test (invocationCount = 2)
	public void laptop() {
		System.out.println("Laptop");
	}
	
	@Test (priority = 2)
	public void mobile() {
		System.out.println("Mobile");
	}
	
	@Test 
	public void airpods() {
		System.out.println("Airpods");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	@AfterClass
	public void screenshot() {
		System.out.println("Screenshot");
	}
	
	@AfterTest
	public void closeWindow() {
		System.out.println("Close Window");
	}
	
	@AfterSuite
	public void quitBrowser() {
		System.out.println("Quit");
	}


}
