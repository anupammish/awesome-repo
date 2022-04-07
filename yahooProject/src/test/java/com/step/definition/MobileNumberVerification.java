package com.step.definition;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.common.method.CommonMethod;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MobileNumberVerification extends CommonMethod {
	
	@When("Enter mobile number {string}")
	public void enter_mobile_number(String mobilenumber) {
		Select countrycode = new Select(driver.findElement(By.name("shortCountryCode")));
		countrycode.selectByValue("IN");
		driver.findElement(By.id("usernamereg-phone")).sendKeys(mobilenumber);
	}

	@Then("Error message should display")
	public void error_message_should_display() {
		String expresult ="That doesn’t look right, please re-enter your phone number.";

		String actresult = driver.findElement(By.id("reg-error-phone")).getText();
		if (expresult.contains(actresult)) {
			System.out.println("test pass");
		}
		else{
			System.out.println("test fail");
		}
	    }




}
