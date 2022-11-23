package com.testng;

import org.testng.annotations.Test;

public class Expected_Exception_Practice {
	
	@Test (expectedExceptions = ArithmeticException.class)
	public void exception() {
		
		int a = 99;
		System.out.println(a/9);
		System.out.println(a/0);

	}

}
