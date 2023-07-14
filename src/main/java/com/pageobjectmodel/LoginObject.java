package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement login;
	
	@FindBy(xpath="//b[text()='Invalid Username Password Combination']")
	public WebElement errormsg;
	
	@FindBy(xpath="//h6[text()='admin']")
	public WebElement admin;
	
	public LoginObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
