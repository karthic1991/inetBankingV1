package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.base.BaseClass;
import com.inetBanking.pageObjects.LoginPage;

public class loginPageTest extends BaseClass {

	
	
	@Test
	public void loginTest() {
		
		driver.get(siteURL);
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
			logger.info("Testcase Passed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("TestCase Failed");
		}
	}
}
