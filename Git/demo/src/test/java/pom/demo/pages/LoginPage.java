package pom.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.LocatorConstants;
import pom.demo.utils.ScreenShotUtils;

public class LoginPage {

	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By username = By.id(LocatorConstants.USERNAME);
	private By password = By.id("password");
	private By loginButton = By.xpath("//button");
	private By flashMessage = By.xpath("//div[@class='flash error']");

	public void login(String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		ScreenShotUtils.takeScreenShotWithBlurredElement(driver, driver.findElement(password));
		driver.findElement(loginButton).click();

	}

	public String getFlashMessage() {
		ScreenShotUtils.takeScreenShotWithHighligtedElement(driver, driver.findElement(flashMessage));
		return driver.findElement(flashMessage).getText().trim();
	}

}
