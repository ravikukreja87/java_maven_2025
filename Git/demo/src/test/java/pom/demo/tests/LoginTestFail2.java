package pom.demo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.demo.assertions.CustomAssertion;
import pom.demo.pages.LoginPage;
import pom.demo.pages.MainPage;
import pom.demo.utils.ScreenShotUtils;

public class LoginTestFail2 {
	private WebDriver driver;
	private final String HOME_PAGE = "https://the-internet.herokuapp.com/";

	@BeforeTest
	public void setup() {
//		FileUtils.deleteScreenShotDirectory();
		driver = new ChromeDriver();
		driver.get(HOME_PAGE);
	}

	@Parameters({ "username", "password" })
	@Test
	public void loginTestIncorrectCredentials(String username, String password) {

		ScreenShotUtils.takeFullPageScreenShot(driver);
		ScreenShotUtils.takeScreenShotWithDate(driver, "Heroku App Main Page. URL - " + HOME_PAGE);

		MainPage mainPage = new MainPage(driver);

		CustomAssertion.validateExpectedContainsInActual(mainPage.getMessageText(), "Welcome to the-internet");
		CustomAssertion.softAssertExpectedContainsInActual(mainPage.getSubHeading(), "Available Examples");
		mainPage.clickOnFormAuth();

		ScreenShotUtils.takeScreenShot(driver);

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);

		String actualFlashMsg = loginPage.getFlashMessage();
		String expectedFlashMsg = "Your username is invalid!";
		CustomAssertion.validateExpectedContainsInActual(actualFlashMsg, expectedFlashMsg);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
