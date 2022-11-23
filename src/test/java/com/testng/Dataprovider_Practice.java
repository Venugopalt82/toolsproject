package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Practice {
	
	@Test (dataProvider = "inputs")
	public void credentials(String username, String password) {

		System.out.println("Username is : " + username);
		System.out.println("Password is : " + password);

	}
	
	@DataProvider	
	public Object[][] inputs() {
		return new Object[][] {
			{"Venu", "venu143"}, {"Rocky", "Rocky143"}, {"James", "James143"}
			
		};

	}

}
