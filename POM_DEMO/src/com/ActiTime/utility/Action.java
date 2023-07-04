package com.ActiTime.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void moveandclick(WebDriver driver,WebElement element){
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	
	public static void switchtoAlert(WebDriver driver){
		
	}
	
	public static void switchtoPopUp(WebDriver driver){
		
	}
}
