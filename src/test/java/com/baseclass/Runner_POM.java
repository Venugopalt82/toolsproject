package com.baseclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pomclass.BookHotel;
import com.pomclass.LoginPage;
import com.pomclass.SearchHotel;
import com.pomclass.SelectHotel;

public class Runner_POM extends BaseClass {
	public static void main (String args[]) throws IOException {
		
		launchBrowser("chrome");
		
		launchUrl("https://adactinhotelapp.com/");
		
		LoginPage lp = new LoginPage(driver);
		
		SearchHotel sh = new SearchHotel(driver);
		
		SelectHotel selh = new SelectHotel(driver);
		
		BookHotel bh = new BookHotel(driver);
		
		userInput(lp.getUsername(), "Bavealan");
				
		passInput(lp.getPassword(), "kavkaBALA");
						
		select(lp.getLogin());
		
		selectLocation(sh.getLocation(), "London");
		
		selectOption(sh.getHotels(), 2);
		
		selectRoom(sh.getRoom_type(), "Super Deluxe");
		
		selectOption(sh.getRoom_nos(), 2);
		
		select(sh.getDatepick_in());
		
		clearInput(sh.getDatepick_in());
		
		userInput (sh.getDatepick_in(), "15/11/2022");
		
		select(sh.getDatepick_out());
		
		clearInput(sh.getDatepick_out());
		
		userInput (sh.getDatepick_out(), "20/11/2022");
		
		selectOption(sh.getAdult_room(), 2);
		
		selectOption(sh.getChild_room(), 1);
		
		select(sh.getSubmit());
		
		select(selh.getRadiobutton());
		
		select(selh.getContinue1());
		
		userInput(bh.getFirst_name(), "Venugopal");
		
		userInput(bh.getLast_name(), "T");
		
		userInput(bh.getAddress(), "Chennai");
		
		userInput(bh.getCc_num(), "9999999999999999");
		
		selectOption(bh.getCc_type(), 1);
		
		selectOption(bh.getCc_exp_month(), 10);
		
		selectOption(bh.getCc_exp_year(), 5);
		
		userInput(bh.getCc_cvv(), "881");
		
		screenShot("E:\\PROGRAMMING PRACTICE\\MAVEN\\maven-archetype-quickstart\\ScreenShot\\pombooking.png");
		
	}

}
