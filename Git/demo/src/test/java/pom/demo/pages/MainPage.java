package pom.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

	// https://the-internet.herokuapp.com/

	protected WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	private By messageBy = By.tagName("h1");
	private By subHeading = By.xpath("//h2");
	private By formAuthenticationLink = By.linkText("Form Authentication");
	private By disappearingLink = By.linkText("Disappearing Elements");

	public String getTitle() {
		return driver.getTitle();
	}

	public String getMessageText() {
		return driver.findElement(messageBy).getText();
	}

	public String getSubHeading() {
		return driver.findElement(subHeading).getText();
	}

	public void clickOnFormAuth() {
		driver.findElement(formAuthenticationLink).click();
	}
	
	public void clickOnDisappearingLink() {
		driver.findElement(disappearingLink).click();
	}

}
