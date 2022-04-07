package com.common.method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.recording.test.ScreenRecorderUtil;

public class CommonMethod {
	 public static WebDriver driver;
	 
		public static void openBrowser(){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver = new ChromeDriver();
			
		}
		
		public static void launchYahoo(){
			driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
}
