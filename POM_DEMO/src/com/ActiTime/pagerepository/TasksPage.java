package com.ActiTime.pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.utility.Action;
import com.ActiTime.utility.Waits;

public class TasksPage extends BasePage{

	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement createtasks;
	
	@FindBy(id="ext-gen33")
	private WebElement importtask;
	
	@FindBy(css="div#gettingStartedShortcutsMenuCloseId")
	private WebElement closePopup;
	
	
	@FindBy(xpath="//div[contains(text(),'Create New Tasks')]")
	private WebElement createTaskPopUp;
	
	@FindBy(id="createTasksPopup_customerSelector")
	//@FindBy(xpath="//tr[@class='selectCustomerRow']/td[1]/div")
	private WebElement customerDD;
	
	@FindBy(css="td.close-button>img[title='Close']")
	private WebElement closebutton;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement customerName;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	private WebElement projectName;
	
	
	@FindBy(xpath="//tbody/tr[1]/td/input[@placeholder='Enter task name']")
	private WebElement task1;
	
	@FindBy(xpath="//tbody/tr[1]/td/input[@placeholder='Enter task name']/../..//td[@class='billingTypeCell']//button")
	private WebElement billingType1;
	
	@FindBy(xpath="//div[@class='buttonIcon']/span[text()='Create Tasks']")
	private WebElement createTaskBTN;
	
	
	
	public TasksPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void addNewTask(){
		
		createtasks.click();
	}
	
	public void importTask(){
		importtask.click();
	}
	
	public void closepopup(){
		closePopup.click();
	}
	
	
	
	public void selectCustomer(String customerType) throws Exception{
		customerDD.click();
		Thread.sleep(3000);
		
		
	}
	
	public void enterCustomer(String customerName){
		this.customerName.sendKeys(customerName);
	}
	
	public void enterProject(String projectName){
		this.projectName.sendKeys(projectName);
	}
	
	public void enterFirstTask(String taskname1){
		task1.sendKeys(taskname1);
	}
	
	public void selectFirstBilling(String billingtype){
		billingType1.click();
		
		driver.findElement(By.xpath("//a[text()='"+billingtype+"']")).click();
	}
	
	public void clickCreateTask(){
		createTaskBTN.click();
	}
}
