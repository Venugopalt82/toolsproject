package com.baseclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pomclass.LoginPage;

public class Runner_Concept extends BaseClass {
	public static void main (String args[]) throws IOException {
		
		launchBrowser("chrome");
		
		launchUrl("https://adactinhotelapp.com/");
		
		LoginPage lp = new LoginPage(driver);
		
		WebElement username = driver.findElement(By.id("username"));
		
		userInput(username, "Bavealan");
		
		WebElement password = driver.findElement(By.id("password"));
		
		passInput(password, "kavkaBALA");
		
		WebElement login = driver.findElement(By.id("login"));
		
		select(login);
		
		WebElement location = driver.findElement(By.id("location"));
		
		selectLocation(location, "London");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		
		selectOption(hotels, 2);
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		
		selectRoom(roomType, "Super Deluxe");
		
		WebElement rooms = driver.findElement(By.id("room_nos"));
		
		selectOption(rooms, 2);
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		
		select(checkIn);
		
		clearInput(checkIn);
		
		userInput (checkIn, "15/11/2022");
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		
		select(checkOut);
		
		clearInput(checkOut);
		
		userInput (checkOut, "20/11/2022");
		
		WebElement aroom = driver.findElement(By.id("adult_room"));
		
		selectOption(aroom, 2);
		
		WebElement croom = driver.findElement(By.id("child_room"));
		
		selectOption(croom, 1);
		
		WebElement submit = driver.findElement(By.id("Submit"));
		
		select(submit);
		
		WebElement clickrbtn = driver.findElement(By.id("radiobutton_0"));
		
		select(clickrbtn);
		
		WebElement conbtn = driver.findElement(By.id("continue"));
		
		select(conbtn);
		
		WebElement fName = driver.findElement(By.id("first_name"));
		
		userInput(fName, "Venugopal");
		
		WebElement lName = driver.findElement(By.id("last_name"));
		
		userInput(lName, "T");
		
		WebElement address = driver.findElement(By.id("address"));
		
		userInput(address, "Chennai");
		
		WebElement ccn = driver.findElement(By.id("cc_num"));
		
		userInput(ccn, "9999999999999999");
		
		WebElement cct = driver.findElement(By.id("cc_type"));
		
		selectOption(cct, 1);
		
		WebElement ccem = driver.findElement(By.id("cc_exp_month"));
		
		selectOption(ccem, 10);
		
		WebElement ccey = driver.findElement(By.id("cc_exp_year"));
		
		selectOption(ccey, 5);
		
		WebElement ccvn = driver.findElement(By.id("cc_cvv"));
		
		userInput(ccvn, "881");
		
		screenShot("E:\\PROGRAMMING PRACTICE\\MAVEN\\maven-archetype-quickstart\\ScreenShot\\booking.png");
		
	}

}
