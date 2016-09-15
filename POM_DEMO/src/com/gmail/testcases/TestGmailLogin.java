package com.gmail.testcases;

import org.testng.annotations.Test;

import com.gmail.pagerepository.GmailLoginPage;

/*
 * Here we are using Inheritance because of code reusabilty. Now suppose we have 1000 testcases and for
 * all those testcases we have to open browser > getURL > ExecuteTestCase > Close Browser. 
 * If we have used ur approach in that way for all 1000 testcases we had to write seperate line of code for
 * all seperate testcases.
 * 
 */

public class TestGmailLogin extends SuperTestNG{


	@Test
	public void testLoginWithoutSession(){
		GmailLoginPage glp = new GmailLoginPage(driver);
		
		glp.loginWithoutSessionSaved("p220690@gmail.com", "9717010079");
	}
	
	@Test
	public void testLoginWithSession(){
		GmailLoginPage glp = new GmailLoginPage(driver);
		
		glp.loginWithSessionSaved("p220690@gmail.com", "9717010079");
	}

  
}
