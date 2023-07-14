package com.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductObject 
{
			WebDriver driver;
			
			@FindBy(xpath="//input[@name='username']")
			public WebElement username;
			
			@FindBy(xpath="//input[@name='password']")
			public WebElement password;
			
			@FindBy(xpath="//button[@name='login']")
			public WebElement login;
			
			@FindBy(xpath="//a[text()=\" Product\"]")
			public WebElement product;
			
			@FindBy(xpath="//a[normalize-space()='Add Product']")
			public WebElement addproduct;
			
			@FindBy(xpath="//input[@id='vinputid']")
			public WebElement productid;
			
			@FindBy(xpath="//input[@id='vinputname']")
			public WebElement productname;
			
			@FindBy(xpath="//select[@id='warehouse1']")
			public WebElement Selectwarehouse;
			
			@FindBy(xpath="//select[@id='rack']")
			public WebElement selectrack;
			
			@FindBy(xpath="//select[@id='Subrack']")
			public WebElement selectsubrack;
			
			@FindBy(xpath="//input[@name='price']")
			public WebElement price;
			
			@FindBy(xpath="//input[@name='opening_stock']")
			public WebElement opeingstock;
			
			@FindBy(xpath="//select[@id='vde']")
			public WebElement selectVDE;
			
			@FindBy(xpath="//select[@id='machine_name']")
			public WebElement selectmachinename;
			
			@FindBy(xpath="//input[@placeholder='Select Supplier']")
			public WebElement supplier;
			

			@FindBy(xpath="//*[@id=\"product-form\"]/div[4]/div[3]/div/div[1]/div")
			public WebElement selectquality;
			
			@FindBy(xpath="/html/body/div/div/div[2]/div/form/div[4]/div[3]/div/div[2]/div/div[2]")
			public WebElement qualityoption;
			
			@FindBy(xpath="//button[@name='upload']")
			public WebElement addproductbutton;
			
			
			
//			@FindBy(xpath="//*[@id=\"choices--supplier_name-item-choice-1\"]")
//			public WebElement supplieroption;
			
		
			
			
			public AddProductObject(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
}
