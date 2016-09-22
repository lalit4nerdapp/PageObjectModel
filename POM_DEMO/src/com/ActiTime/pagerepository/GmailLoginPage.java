package com.ActiTime.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage {

	
   /* All WebElements present on Gmail Login Page has to be identified using @FindB annotaion.
    * We are keeping WebElements as private b'coz we dont want them to be exposed in implementing 
    * class which is TestClass.
    * This below procedure is called Encapsulation : Keeping Instance variable of a class private and accessing them
    * through public getters and setters and now here our method which are using them in same class are those public getters and setters method
    * 
    */
	
	@FindBy(name = "Email")
	private WebElement usernameField;

	@FindBy(name = "signIn")
	private WebElement nextBTN;

	@FindBy(name = "Passwd")
	private WebElement pwdField;

	@FindBy(id = "signIn")
	private WebElement signInBTN;

	@FindBy(name = "PersistentCookie")
	private WebElement RememberMe;

	
	/* Intialising identified locators using page factory */
	
	public GmailLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Action which we are going to perform on Page Object i.e Gmail Login Page*/
	
	public void loginWithSessionSaved(String Username, String Password) {
		usernameField.sendKeys(Username);
		nextBTN.click();
		pwdField.sendKeys(Password);
		RememberMe.click();
		signInBTN.click();

	}

	public void loginWithoutSessionSaved(String Username, String Password) {
		usernameField.sendKeys(Username);
		nextBTN.click();
		pwdField.sendKeys(Password);
		signInBTN.click();
	}

}
