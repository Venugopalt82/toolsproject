package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassRef {
	
	public static WebDriver driver;
	
	public static void launchBrowser (String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("E:\\PROGRAMMING PRACTICE\\SELENIUM\\Selenium_Learning" +  "\\Drivers\\chromedriver.exe"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("E:\\PROGRAMMING PRACTICE\\SELENIUM\\Selenium_Learning" +  "\\Drivers\\chromedriver.exe"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
				
	}
	
	public static void closeBrowser() {
		driver.close();
				
	}
	
	public static void quitBrowser() {
		driver.quit();
				
	}
	
	public static void forwardPage() {
		driver.navigate().forward();
				
	}
	
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
		
	}
	
	public static void clickBtn(WebElement element) {
		element.click();
		
	}
	
	public static void clearInut(WebElement element) {
		element.clear();
		
	}
	

}
