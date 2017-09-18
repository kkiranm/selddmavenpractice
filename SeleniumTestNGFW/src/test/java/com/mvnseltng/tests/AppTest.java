package com.mvnseltng.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mvnseltng.global.Hooks;

public class AppTest extends Hooks
{
	public AppTest() throws IOException {
		super();
	}

	@Test
	public void smoke(){
		System.out.println(driver.getTitle());				
	}
}