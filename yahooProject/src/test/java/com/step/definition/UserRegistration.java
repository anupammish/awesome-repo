package com.step.definition;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.common.method.CommonMethod;
import com.recording.test.ScreenRecorderUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration extends CommonMethod  {
	
	
	@Given("start screen recording")
	public void start_screen_recording() throws Exception {
		ScreenRecorderUtil.startRecord("start_screen_recording()");
    	
	    }


	@Given("open browser")
	public void open_browser() throws Exception {
		
		CommonMethod.openBrowser();
		driver.manage().window().maximize();
	   }
	@Given("Launch Aplication")
	public void launch_aplication() throws Exception {
		
		CommonMethod.launchYahoo();
	    }
	@When("Enter firstName {string} and LastName {string}")
	public void enter_first_name_and_last_name(String fname, String lname) throws Exception {
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(fname);
	    driver.findElement(By.id("usernamereg-lastName")).sendKeys(lname);
	
	   }
	@When("Enter email {string}")
	public void enter_email_email(String email) throws Exception {
		
		driver.findElement(By.id("usernamereg-yid")).sendKeys(email);
	    }
	@When("Enter password {string}")
	public void enter_password(String passwd) throws Exception {
		
		 driver.findElement(By.id("usernamereg-password")).sendKeys(passwd);

	    }
	@When("Enter Mobile Number {string}")
	public void enter_mobile_number_mobnumber(String mobnumber) {
		Select countrycode = new Select(driver.findElement(By.name("shortCountryCode")));
		countrycode.selectByValue("IN");
		driver.findElement(By.id("usernamereg-phone")).sendKeys(mobnumber);
	   }
	@When("Enter date of birth and enter gender")
	public void enter_date_of_birth_and_enter_gender() {
		  Select month = new Select(driver.findElement(By.id("usernamereg-month")));
		    month.selectByValue("3");
		    driver.findElement(By.id("usernamereg-day")).sendKeys("12");
		    driver.findElement(By.id("usernamereg-year")).sendKeys("2000");
		    driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("Male");
		
	   }
	@When("Click continue")
	public void click_continue() {
		driver.findElement(By.id("reg-submit-button")).click();
	}
	@Then("User page should display")
	public void user_page_should_display() {
		System.out.println("Test pass");
		
	}

	@Then("stop screen recording")
	public void stop_screen_recording() throws Exception {
		ScreenRecorderUtil.stopRecord();
	    
	    }

	
	



}
