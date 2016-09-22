package com.ActiTime.testcases;


import org.testng.annotations.Test;

import com.ActiTime.pagerepository.BasePage;
import com.ActiTime.pagerepository.LoginPage;
import com.ActiTime.pagerepository.TasksPage;
import com.ActiTime.utility.Log;


public class TestActiTimeLogin extends SuperTestNG {

	@Test
	public void testloginwithoutsession(){
		
		BasePage bp = new BasePage(driver);
		LoginPage lp = new LoginPage(driver);
		TasksPage tp = new TasksPage(driver);
		
		
		
		Log.startTestCase("Login With Out Session");
		
		
		
		lp.loginwithoutsession("Lalit101291", "epE8AVED");
		bp.clicktask();
		tp.addNewTask();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		Log.endTestCase("Login With Out Session");
	}
	
}
