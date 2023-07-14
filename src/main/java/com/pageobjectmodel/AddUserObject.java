package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserObject 
{
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()=\" Settings\"]")
	public WebElement settings;
	
	@FindBy(xpath="//a[text()=\"Add Users\"]")
	public WebElement adduserlink;
	
	@FindBy(xpath="//button[text()=\" Add\"]")
	public WebElement login;
	
	@FindBy(xpath="//button[@class='btn bg-blue text-white float-right']")
	public WebElement add;
	
	@FindBy(xpath="//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[1]/input")
	public WebElement username;
	
	@FindBy(xpath="//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[2]/input")
	public WebElement email;
	
	@FindBy(xpath="//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[3]/select")
	public WebElement selectrole;
	
	@FindBy(xpath="//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[4]/input")
	public WebElement password;
	
	@FindBy(xpath="//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div[2]//button")
	public WebElement adduserbutton;
	

	
	
	public AddUserObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
