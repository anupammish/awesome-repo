package com.test.runner;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "Applicationfeatures/userregistration.feature",
		glue={"com.step.definition"},
		plugin = { "pretty", "junit:target/Cucumber.xml",
				             "html:target/cucumber-reports.html"},
		publish = true,
		monochrome = true,dryRun= false,tags="@TC-02")
public class TestRunner {
   
}
