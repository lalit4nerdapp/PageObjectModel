package com.gmail.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SuperTestNG {

	WebDriver driver;
	
	/*
	 * In tearUp method we does all those things which we require before running our actuall testCases
	 * it can be initializing drivers or setting up driver profile or handing security Certification.
	 * 
	 */
	
	 @BeforeTest
	  public void tearUp(){ // we can name it tearUp or precondition
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalitk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 /* System.setProperty("webdriver.gecko.driver", "C:\\Users\\Priya\\workspace\\Data_Driven Testing\\JARS\\geckodriver.exe");
		  driver= new FirefoxDriver();*/
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.gmail.com");  
	 }
	 
	 /*
	  * In tearDown method we does all those things which we need to done post testCases has beeen executed
	  * it can be taking screenshots , logging bug into Bug Mangement tool or , closing browser.
	  * 
	  * 
	  */
	 
	 @AfterTest
	 public void tearDown(){ // we can name it teardown or postcondition
		 driver.quit();
		 
	 }
	 
}
