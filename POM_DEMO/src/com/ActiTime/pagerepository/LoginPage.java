package com.ActiTime.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ActiTime.utility.Log;


public class LoginPage extends BasePage{

	@FindBy(name="username")
	private WebElement userNameField;
	
	
	@FindBy(name="pwd")
	private WebElement passwordField;
	
	@FindBy(name="remember")
	private WebElement rememberMeCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(linkText="Forgot your password?")
	private WebElement forgetPasswordLink;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
	
	   
	
	}
	
	public void loginwithsession(String userName,String password){
		 
		userNameField.sendKeys(userName);
		Log.info("User enters"+userName+"in UserName"+"[TextField]");
		passwordField.sendKeys(password);
		Log.info("User enters"+password+"in Password"+"[TextField]");
		loginButton.click();
		Log.info("User clicks Login"+"[Button]");
		
		
	}
	
    public void loginwithoutsession(String userName,String password){
    	userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		rememberMeCheckBox.click();
		loginButton.click();
	}
    
    public void forgetPassword(){
    	
    }
}
