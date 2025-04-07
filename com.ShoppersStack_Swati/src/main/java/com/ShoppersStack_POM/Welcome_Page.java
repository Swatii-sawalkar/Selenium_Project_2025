package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {
	
	public Welcome_Page(WebDriver driver) //constructor
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginBtn") // element identified
	private WebElement loginBtn; // variable create kela

	public WebElement getLoginBtn()//getter method
	{
		return loginBtn;
	}	

}
