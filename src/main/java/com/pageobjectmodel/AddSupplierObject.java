package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSupplierObject 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement login;
	
	@FindBy(xpath="//a[text()=\" Suppliers\"]")
	public WebElement suppliers;
	
	@FindBy(xpath="//a[normalize-space()='Add Supplier']")
	public WebElement addsupplier;
	
	@FindBy(xpath="//input[@id='vinputid']")
	public WebElement supplierid;
	
	@FindBy(xpath="//input[@id='vinputname']")
	public WebElement suppliername;
	
	@FindBy(xpath="//input[@id='erpcode']")
	public WebElement ERPCode;
	
	@FindBy(xpath="//textarea[@id='vinputaddr']")
	public WebElement SupplierAddress;
	
	@FindBy(xpath="//input[@name=\"venemail\"]")
	public WebElement Emailaddress;
	
	@FindBy(xpath="//input[@id='cno']")
	public WebElement ContactNo;
	
	@FindBy(xpath="//select[@id=\"VT1\"]")
	public WebElement suppliertype;
	
	@FindBy(xpath="//input[@id='gstid']")
	public WebElement GstNo;
	
	@FindBy(xpath="//input[@name='file']")
	public WebElement FileUpload;
	
	@FindBy(xpath="//button[@name='submit']")
	public WebElement addbutton;
	
	
	
	public AddSupplierObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
