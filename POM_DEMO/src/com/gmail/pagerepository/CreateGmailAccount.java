package com.gmail.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CreateGmailAccount extends GmailLoginPage{

	private WebElement fnameField;
	
	private WebElement lnameField;
	
	
	private WebElement emailField;
	
	
	private WebElement pwdField;
	
	
	private WebElement confirmpwdField;
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * locate and all webELements and Write All Actions
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public CreateGmailAccount(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
}
