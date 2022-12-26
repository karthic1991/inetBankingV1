package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}
	
	
	@FindBy(name= "uid")
	WebElement txtUserName;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(name ="btnLogin")
	WebElement btnLogin;
	
	
	public void setUserName(String username) {
		
		txtUserName.sendKeys(username);
		
	}
	
	public void setPassword(String password) {
		
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit() {
		
		
		btnLogin.click();
	}

}
