package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Practice {
	
	@Test
	public void hap() {

		String act = "Venu";
		String exp = "Venu";
		Assert.assertEquals(act, exp);
		System.out.println("Validation");
	}

}
