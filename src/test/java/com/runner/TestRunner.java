package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/test/java/com/feature", glue = "StepdefinationHpcl",plugin= {"pretty","html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, monochrome=true, tags ="@AddProduct ")
public class TestRunner 
{


}
