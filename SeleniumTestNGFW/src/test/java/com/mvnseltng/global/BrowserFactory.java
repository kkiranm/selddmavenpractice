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

	public BrowserFactory(){
		String cwdpath = System.getProperty("user.dir");
		String browserDrivers = cwdpath+"\\browserDrivers";
		System.setProperty("webdriver.chrome.driver", browserDrivers+"\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", browserDrivers+"\\IEDriverServer.exe");
		System.setProperty("webdriver.gecko.driver", browserDrivers+"\\geckodriver.exe");
		
	}
	
	public WebDriver selectBrowser(WebDriver driver, String browser){
		
		if (driver == null){
				
		if(browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("gc")){
			driver = new ChromeDriver();	
		} else if(browser.equalsIgnoreCase("firefox")|| browser.equalsIgnoreCase("ff")){
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("ie")){
			driver = new InternetExplorerDriver();
		} else if(browser.equalsIgnoreCase("phantomjs")){
			driver = new PhantomJSDriver();
		} else if(browser.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		} else if(browser.equalsIgnoreCase("safari")|| browser.equalsIgnoreCase("sf")){
			driver = new SafariDriver();
		} else if(browser.equalsIgnoreCase("opera")){
			driver = new OperaDriver();
		}
	}			
		return driver;
	}
}
