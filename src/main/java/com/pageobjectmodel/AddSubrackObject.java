package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSubrackObject 
{
		WebDriver driver;
		
		@FindBy(xpath="//input[@name='username']")
		public WebElement username;
		
		@FindBy(xpath="//input[@name='password']")
		public WebElement password;
		
		@FindBy(xpath="//button[@name='login']")
		public WebElement login;
		
		@FindBy(xpath="//a[@class='dropdown-toggle'][normalize-space()='Add Sub Rack']")
		public WebElement addsubrackside;
		
		@FindBy(xpath="//a[@href='../Add_subrack/']")
		public WebElement addsubrackside2;
		
		@FindBy(xpath="//select[@id='warehouse']")
		public WebElement selectwaregouse;
		
		@FindBy(xpath="//select[@id=\"rack\"]")
		public WebElement selectrack;
		
		@FindBy(xpath="//input[@id=\"Subrack\"]")
		public WebElement subrackno;
		
		@FindBy(xpath="//input[@name=\"rack\"]")
		public WebElement no_ofrack;
		
		@FindBy(xpath="//label[text()=\"Subrack No 1\"]//input")
		public WebElement Subrack1;
		
		@FindBy(xpath="//label[text()=\"Subrack No 2\"]//input")
		public WebElement subrack2;
		
		@FindBy(xpath="//input[@name=\"update\"]")
		public WebElement addsubrackbutton;
		
		
		
		public AddSubrackObject(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
}
