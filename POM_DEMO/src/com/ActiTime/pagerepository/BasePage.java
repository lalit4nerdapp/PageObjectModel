package com.ActiTime.pagerepository;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.utility.Waits;

public class BasePage {

	WebDriver driver;
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasksLink;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		DOMConfigurator.configure("log4j.xml");
		PageFactory.initElements(driver, this);
    }
	
	
	public void clicktask(){
		Waits.waitforvisibility(driver, tasksLink);
		tasksLink.click();
	}
}