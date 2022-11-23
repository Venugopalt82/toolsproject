package com.stepdefinition;

import com.baseclass.BaseClass;
import com.pageobjectmanager.PageObjectManager;
import com.properties.File_Reader_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Must Launch Url$")
	public void user_Must_Launch_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
	    
	}

	@When("^user Enters The Username In Username Field$")
	public void user_Enters_The_Username_In_Username_Field() throws Throwable {
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		userInput(pom.getInstanceLogin().getUsername() , "Bavealan");
	}

	@When("^user Enters The Password In Password Field$")
	public void user_Enters_The_Password_In_Password_Field() throws Throwable {
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passInput(pom.getInstanceLogin().getPassword(), "kavkaBALA");
	}

	@Then("^user Clicks The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		select(pom.getInstanceLogin().getLogin());
	}
	
	@When("^user Selects The Lacation From Location Field$")
	public void user_Selects_The_Lacation_From_Location_Field() throws Throwable {
		selectLocation(pom.getInstanceSh().getLocation(), "London");
	}

	@When("^user Selects The Hotel From Hotel Field$")
	public void user_Selects_The_Hotel_From_Hotel_Field() throws Throwable {
		selectOption( pom.getInstanceSh().getHotels(), 2);
	}

	@When("^user Selects The RoomType From RoomType Field$")
	public void user_Selects_The_RoomType_From_RoomType_Field() throws Throwable {
		selectRoom(pom.getInstanceSh().getRoom_type(), "Super Deluxe");
	}

	@When("^user Selects The Number Of Rooms From NOR Field$")
	public void user_Selects_The_Number_Of_Rooms_From_NOR_Field() throws Throwable {
		selectOption(pom.getInstanceSh().getRoom_nos(), 2);
	}

	@When("^user Enters CheckIn From CheckIn Field$")
	public void user_Enters_CheckIn_From_CheckIn_Field() throws Throwable {
		select(pom.getInstanceSh().getDatepick_in());
		clearInput(pom.getInstanceSh().getDatepick_in());
		userInput (pom.getInstanceSh().getDatepick_in(), "15/11/2022");
	}

	@When("^user Enters CheckOut From CheckOut Field$")
	public void user_Enters_CheckOut_From_CheckOut_Field() throws Throwable {
		select(pom.getInstanceSh().getDatepick_out());
		clearInput(pom.getInstanceSh().getDatepick_out());
		userInput (pom.getInstanceSh().getDatepick_out(), "20/11/2022");
	}

	@When("^user Selects NOA From NOA Field$")
	public void user_Selects_NOA_From_NOA_Field() throws Throwable {
		selectOption(pom.getInstanceSh().getAdult_room(), 2);
	}

	@When("^user Selects NOC From NOC Field$")
	public void user_Selects_NOC_From_NOC_Field() throws Throwable {
		selectOption(pom.getInstanceSh().getChild_room(), 1);
	}

	@Then("^user Clicks The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Clicks_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		select(pom.getInstanceSh().getSubmit());
	}

	@When("^user Click The Check Box In Check Box Field$")
	public void user_Click_The_Check_Box_In_Check_Box_Field() throws Throwable {
		select(pom.getInstanceSelh().getRadiobutton());
	}

	@Then("^user Clicks The Continue Button And It Navigates To The Book Hotel Page$")
	public void user_Clicks_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
		select(pom.getInstanceSelh().getContinue1());
	}

	@When("^user Enters First Name In First Name Field$")
	public void user_Enters_First_Name_In_First_Name_Field() throws Throwable {
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		userInput(pom.getInstanceBH().getFirst_name(), "Venugopal");
	}

	@When("^user Enters Last Name In Last Name Field$")
	public void user_Enters_Last_Name_In_Last_Name_Field() throws Throwable {
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		userInput(pom.getInstanceBH().getLast_name(), "T");
	}

	@When("^user Enters Billing Address In Billing Address Field$")
	public void user_Enters_Billing_Address_In_Billing_Address_Field() throws Throwable {
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();		
		userInput(pom.getInstanceBH().getAddress(), "Chennai");
	}

	@When("^user Enters CCNumber In CCNumber Field$")
	public void user_Enters_CCNumber_In_CCNumber_Field() throws Throwable {
		String ccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcnum();		
		userInput(pom.getInstanceBH().getCc_num(), "9999999999999999");
	}

	@When("^user Selects CCType From CCType Field$")
	public void user_Selects_CCType_From_CCType_Field() throws Throwable {
		selectOption(pom.getInstanceBH().getCc_type(), 1);
	}

	@When("^user Selects CCExpiry Date From Date Field$")
	public void user_Selects_CCExpiry_Date_From_Date_Field() throws Throwable {
		selectOption(pom.getInstanceBH().getCc_exp_month(), 10);
	}

	@When("^user Selects CCExpiry Year From Year Field$")
	public void user_Selects_CCExpiry_Year_From_Year_Field() throws Throwable {
		selectOption(pom.getInstanceBH().getCc_exp_year(), 5);
	}

	@When("^user Enters CCVNumber In CCVNumber Field$")
	public void user_Enters_CCVNumber_In_CCVNumber_Field() throws Throwable {
		String cccvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCccvv();		
		userInput(pom.getInstanceBH().getCc_cvv(), "881");
	}

		
}
