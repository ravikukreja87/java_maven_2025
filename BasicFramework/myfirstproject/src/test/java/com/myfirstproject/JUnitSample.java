package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitSample {
	
	
	@Test
	public void sampleTestSelenium() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
