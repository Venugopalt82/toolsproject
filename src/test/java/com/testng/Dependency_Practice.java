package com.testng;

import org.testng.annotations.Test;

public class Dependency_Practice {
	//@Ignore
	@Test
	public void credentials() {
		System.out.println("Credentials");

	}
	
	@Test (dependsOnMethods = "credentials")
	public void login() {
		System.out.println("Login");

	}
	

}
