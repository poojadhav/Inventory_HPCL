package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoomListObject 
{	
	WebDriver driver;

	@FindBy(xpath="//a[normalize-space()='Spares List']")
	public WebElement SpareList;
	
	@FindBy(xpath="//a[normalize-space()='BOOM']")
	public WebElement BoomList;
	
	@FindBy(xpath="//input[@id='sub_category']")
	public WebElement SubCategory;
	
	@FindBy(xpath="//input[@id='equipment_name']")
	public WebElement EquipmentName;
	
	@FindBy(xpath="//input[@id='part_name']")
	public WebElement PartName;
	
	@FindBy(xpath="//input[@id='part_no']")
	public WebElement PartNo;
	
	@FindBy(xpath="//input[@id='qty']")
	public WebElement Quantity;
	
	@FindBy(xpath="//input[@id='condition']")
	public WebElement Condition;
	
	@FindBy(xpath="//input[@id='per_unit_value']")
	public WebElement PerUnitValue;
	
	@FindBy(xpath="//input[@id='location_in_warehouse']")
	public WebElement LocationInWarehouse;
	
	@FindBy(xpath="//input[@id='pis_matrix']")
	public WebElement PISMatrix;
	
	@FindBy(xpath="//input[@id='pp_matrix']")
	public WebElement PPMatrix;
	
	@FindBy(xpath="//button[@name='submit']")
	public WebElement addbutton;
	
	
	@FindBy(xpath="//a[@class='btn btn-success']")
	public WebElement adddata;

	
	public BoomListObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
