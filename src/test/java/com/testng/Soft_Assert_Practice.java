package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Practice {
	
	@Test
	public void sap() {
		
		String act = "Rocky";
		String exp = "Rocky";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(act, exp);
		System.out.println("Verification");
		

	}

}
