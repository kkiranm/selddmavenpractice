package com.mvnseltng.global;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class DriverSettings {
	
	private Properties properties;
	private InputStream fileio;
	private String url;
	private String browser;
	
	public DriverSettings() throws IOException, FileNotFoundException{
		properties = new Properties();
		fileio = new FileInputStream("src\\resources\\config.properties");
		properties.load(fileio);
	}
	
	public WebDriver setDriver(WebDriver driver){
		driver.manage().window().setSize(new Dimension(800, 1200));
		return driver;
	}

	protected String getBaseURL(){
		url = properties.getProperty("baseURL");
		return url;
	}

	protected String getBrowser(){
		browser = properties.getProperty("browser");
		return browser.toLowerCase().trim();
	}
}