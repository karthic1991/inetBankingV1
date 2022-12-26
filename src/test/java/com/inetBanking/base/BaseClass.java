package com.inetBanking.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public String siteURL = "https://demo.guru99.com/v4/";
	public String username = "mngr464386";
	public String password = "rEsYhev";
	public static Logger logger;
	
	@BeforeClass
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		logger = logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

}
