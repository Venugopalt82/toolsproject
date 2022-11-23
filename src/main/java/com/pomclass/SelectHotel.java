package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	
public class SelectHotel {

	public WebDriver driver;
		
	public SelectHotel (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
					
		}
	
		@FindBy(id = "radiobutton_0")
		private WebElement radiobutton;

		public WebElement getRadiobutton() {
			return radiobutton;
		}
		
		@FindBy(id = "continue")
		private WebElement continue1;

		public WebElement getContinue1() {
			return continue1;
		}
		
		
}
