package com.baseclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageobjectmanager.PageObjectManager;
import com.pomclass.BookHotel;
import com.pomclass.LoginPage;
import com.pomclass.SearchHotel;
import com.pomclass.SelectHotel;

public class Runner_POManager extends BaseClass {
	
	public static WebDriver driver = launchBrowser("chrome");
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static void main (String args[]) throws IOException {
		
		launchUrl("https://adactinhotelapp.com/");
		
			
		userInput(pom.getInstanceLogin().getUsername() , "Bavealan");
				
		passInput(pom.getInstanceLogin().getPassword(), "kavkaBALA");
						
		select(pom.getInstanceLogin().getLogin());
		
		
		
		selectLocation(pom.getInstanceSh().getLocation(), "London");
		
		selectOption( pom.getInstanceSh().getHotels(), 2);
		
		selectRoom(pom.getInstanceSh().getRoom_type(), "Super Deluxe");
		
		selectOption(pom.getInstanceSh().getRoom_nos(), 2);
		
		select(pom.getInstanceSh().getDatepick_in());
		
		clearInput(pom.getInstanceSh().getDatepick_in());
		
		userInput (pom.getInstanceSh().getDatepick_in(), "15/11/2022");
		
		select(pom.getInstanceSh().getDatepick_out());
		
		clearInput(pom.getInstanceSh().getDatepick_out());
		
		userInput (pom.getInstanceSh().getDatepick_out(), "20/11/2022");
		
		selectOption(pom.getInstanceSh().getAdult_room(), 2);
		
		selectOption(pom.getInstanceSh().getChild_room(), 1);
		
		select(pom.getInstanceSh().getSubmit());
		
		
		
		select(pom.getInstanceSelh().getRadiobutton());
		
		select(pom.getInstanceSelh().getContinue1());
		
		
		userInput(pom.getInstanceBH().getFirst_name(), "Venugopal");
		
		userInput(pom.getInstanceBH().getLast_name(), "T");
		
		userInput(pom.getInstanceBH().getAddress(), "Chennai");
		
		userInput(pom.getInstanceBH().getCc_num(), "9999999999999999");
		
		selectOption(pom.getInstanceBH().getCc_type(), 1);
		
		selectOption(pom.getInstanceBH().getCc_exp_month(), 10);
		
		selectOption(pom.getInstanceBH().getCc_exp_year(), 5);
		
		userInput(pom.getInstanceBH().getCc_cvv(), "881");
		
		screenShot("E:\\PROGRAMMING PRACTICE\\MAVEN\\maven-archetype-quickstart\\ScreenShot\\pomanagerbooking.png");
		
	}

}
