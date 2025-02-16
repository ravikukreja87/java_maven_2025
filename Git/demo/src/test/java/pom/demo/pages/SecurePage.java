package pom.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pom.demo.utils.ScreenShotUtils;

public class SecurePage {

	// https://the-internet.herokuapp.com/secure

	protected WebDriver driver;
	private By flash = By.id("flash");

	public SecurePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFlashElement() {
		return driver.findElement(flash);
	}

	public String getFlash() {
		WebElement flashElement = driver.findElement(flash);
		
		return flashElement.getText();
	}

}
