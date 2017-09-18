package com.mvnseltng.global;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.mvnseltng.global.DriverSettings;

public class Hooks {

	protected WebDriver driver;
	private DriverSettings driverSettings;
	private final String baseURL;
	protected BrowserFactory browserFactory;
	private String browser;

	public Hooks() throws IOException{
		driver = null;
		driverSettings = new DriverSettings();
		browserFactory = new BrowserFactory();
		browser = driverSettings.getBrowser();
		driver=browserFactory.selectBrowser(driver, browser);
		driver = driverSettings.setDriver(driver);
		baseURL = driverSettings.getBaseURL();		
	}
	
	@BeforeSuite
	public void testSetup(){
			driver.navigate().to(baseURL);
	}
	
	@AfterSuite
	public void testTearDown(){
		driver.quit();
	}
		
}
