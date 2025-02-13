package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.ScreenShotUtils;

public class FirstSelenium {
	
	@Test
	public void googleSearch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		ScreenShotUtils.takeScreenShotOnCurrentScreen(driver);
	}
	
	
	@Test
	public void techcanvass() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://techedge.techcanvass.co/Login.aspx");
	}

}
