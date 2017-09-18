package com.mvnseltng.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

	//protected String browser;
	
	public WebDriver selectBrowser(WebDriver driver, String browser){

		//DriverSettings driverSettings = new DriverSettings();
		//browser = driverSettings.getBrowser();
		
		if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")){
			//System.setProperty("webdriver.gecko.driver", )
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("ie")){
			driver = new InternetExplorerDriver();
		} else if(browser.equalsIgnoreCase("phantomjs")){
			driver = new PhantomJSDriver();
		} else if(browser.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		} else if(browser.equalsIgnoreCase("safari")){
			driver = new SafariDriver();
		} else if(browser.equalsIgnoreCase("opera")){
			driver = new OperaDriver();
		}
				
		return driver;
	}
}
