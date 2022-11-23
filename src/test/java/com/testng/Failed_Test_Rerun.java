package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Failed_Test_Rerun {
	
	@Test
	public void username() {
		String exp = "Venu";
		String act = "Venu";
		Assert.assertEquals(act,exp);
	}
	
	@Test (retryAnalyzer = Rerun.class)
	public void password() {
		String exp = "@143";
		String act = "@341";
		Assert.assertEquals(act,exp);
	}

}
