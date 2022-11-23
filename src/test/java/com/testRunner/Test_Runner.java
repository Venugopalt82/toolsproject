package com.testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\PROGRAMMING PRACTICE\\MAVEN\\maven-archetype-quickstart\\src\\test\\java\\com\\feature\\Adactin.feature",
	glue = "E:\\PROGRAMMING PRACTICE\\MAVEN\\maven-archetype-quickstart\\src\\test\\java\\com\\stepdefinition\\StepDefinition.java",
	plugin = {"html:Reports"})
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = BaseClass.launchBrowser("chrome");
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();;
	}
	
}
