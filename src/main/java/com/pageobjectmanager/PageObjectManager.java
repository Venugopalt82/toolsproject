package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pomclass.BookHotel;
import com.pomclass.LoginPage;
import com.pomclass.SearchHotel;
import com.pomclass.SelectHotel;

public class PageObjectManager {

	public WebDriver driver;
	
	private LoginPage lp;
	
	public PageObjectManager (WebDriver driver2) {
		this.driver = driver2;
		
	}
	
	public LoginPage getInstanceLogin() {
		
		if (lp == null) {
			
			lp = new LoginPage(driver);
		}
		return lp;
	}
	
	private SearchHotel sh;
	
	public SearchHotel getInstanceSh() {
		
		if (sh == null) {
			
			sh = new SearchHotel(driver);
		}
		return sh;
	}
	
	private SelectHotel selH;
	
	public SelectHotel getInstanceSelh() {
		
		if (selH == null) {
			
			selH = new SelectHotel(driver);
		}
		return selH;
	}
	
	private BookHotel bh;
	
	public BookHotel getInstanceBH() {
		
		if (bh == null) {
			
			bh = new BookHotel(driver);
		}
		return bh;
	}
	
	
	
}
