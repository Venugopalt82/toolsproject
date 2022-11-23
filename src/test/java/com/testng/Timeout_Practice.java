package com.testng;

import org.testng.annotations.Test;

public class Timeout_Practice {
	
	@Test (timeOut = 6000)
	public void login() throws InterruptedException {
		
		//Thread.sleep(2000);
		System.out.println("Launch Browser");
		
		//Thread.sleep(2000);		
		System.out.println("Launch Url");
		
		Thread.sleep(2000);
		System.out.println("Launch Login");

	}

}
