package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWarehouseObject 
{

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement login;
	
	@FindBy(xpath="//a[text()=\" Inventory Structure\"]")
	public WebElement inventory;
	
	@FindBy(xpath="//a[text()=\"Add Warehouse\"]")
	public WebElement addwarehouse;
	
	@FindBy(xpath="//input[@id=\"warehouse\"]")
	public WebElement noofwarehouse;
	
	@FindBy(xpath="//button[@id=\"addwarehouse\"]")
	public WebElement addwarebutton;
	
	@FindBy(xpath="//input[@name=\"warehouse\"]")
	public WebElement warehousename;
	
	@FindBy(xpath="//input[@name=\"rack\"]")
	public WebElement no_ofrack;
	
	@FindBy(xpath="//input[@id=\"20\"]")
	public WebElement rackname1;
	
	@FindBy(xpath="//input[@id=\"21\"]")
	public WebElement rackname2;
	
	@FindBy(xpath="//button[text()=\"Next\"]")
	public WebElement nextbutton;
	
	@FindBy(xpath="//button[text()=\"Finish\"]")
	public WebElement finishbutton;
	
	
	public AddWarehouseObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
