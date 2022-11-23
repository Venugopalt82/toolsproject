package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Pratice {
	
	@Test
	@Parameters({"username", "password"})
	public void credentials(String username, String password) {

		System.out.println("Username is : " + username);
		System.out.println("Password is : " + password);

	}
	
	@Test
	@Parameters({"oldPassword", "newPassword"})
	public void changePassword(String oldPassword, @Optional("Rocky143") String newPassword) {
		System.out.println("Old Password : " + oldPassword);
		System.out.println("New Password: " + newPassword);
	}

}
