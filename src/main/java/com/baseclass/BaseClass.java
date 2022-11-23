package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser (String browsername) {
				
			System.setProperty("webdriver.chrome.driver","E:\\PROGRAMMING PRACTICE\\SELENIUM\\Selenium_Learning\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			browsername.equalsIgnoreCase("chrome");
			driver.manage().window().maximize();
			return driver;
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
	
	public static void userInput(WebElement element, String input) {
		element.sendKeys(input);
		
	}
	
	public static void numInput(WebElement element, int ninput) {
		element.sendKeys();
		
	}
	
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
		
	}
	
	public static void select(WebElement element) {
		element.click();
		
	}
	
	public static void clearInput(WebElement element) {
		element.clear();
		
	}
	
	public static void selectLocation (WebElement element, String city) {
		Select sl = new Select(element);
		sl.selectByValue(city);
		
	}
	
	public static void selectOption (WebElement element, int index) {
		Select sh = new Select(element);
		sh.selectByIndex(index);
		
	}
	
	public static void selectRoom (WebElement element, String room) {
		Select srt = new Select(element);
		srt.selectByVisibleText(room);
		
	}
	public static void screenShot (String fileLocation) throws IOException {
		TakesScreenshot booking = (TakesScreenshot) driver;
		File screen1 = booking.getScreenshotAs(OutputType.FILE);
		File destin = new File(fileLocation);
		FileHandler.copy(screen1, destin);
	}

}
