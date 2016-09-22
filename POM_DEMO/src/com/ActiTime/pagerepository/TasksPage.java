package com.ActiTime.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.utility.Waits;

public class TasksPage extends BasePage{

	@FindBy(css="div#ext-gen39")
	private WebElement createtasks;
	
	@FindBy(css="div#gettingStartedShortcutsMenuCloseId")
	private WebElement closePopup;
	
	
	@FindBy(xpath="//div[contains(text(),'Create New Tasks')]")
	private WebElement createTaskPopUp;
	
	
	public TasksPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void addNewTask(){
		Waits.waituntilclickable(driver, createtasks);
		
	}
	
	public void closepopup(){
		closePopup.click();
	}
	
}
