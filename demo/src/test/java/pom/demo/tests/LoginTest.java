package pom.demo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import pom.demo.assertions.CustomAssertion;
import pom.demo.pages.LoginPage;
import pom.demo.pages.MainPage;
import pom.demo.pages.SecurePage;
import pom.demo.utils.FileUtils;
import pom.demo.utils.ScreenShotUtils;
import reporting.ExtentReporterSetup;

public class LoginTest {
	protected WebDriver driver;
	private final String HOME_PAGE = "https://the-internet.herokuapp.com/";
	ExtentTest test;

	@BeforeTest
	public void setup() {

//		FileUtils.deleteScreenShotDirectory();
		driver = new ChromeDriver();
		driver.get(HOME_PAGE);
	}

	@Test
	public void loginTest() {

		test = ExtentReporterSetup.getInstance().createTest("Login");
		ScreenShotUtils.takeFullPageScreenShot(driver);
		ScreenShotUtils.takeScreenShotWithDate(driver, "Heroku App Main Page. URL - " + HOME_PAGE);

		MainPage mainPage = new MainPage(driver);

		CustomAssertion.validateExpectedContainsInActual(mainPage.getMessageText(), "Welcome to the-internet");
		CustomAssertion.softAssertExpectedContainsInActual(mainPage.getSubHeading(), "Available Examples");
		mainPage.clickOnFormAuth();

		ScreenShotUtils.takeScreenShot(driver);

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tomsmith", "SuperSecretPassword!");

		SecurePage securePage = new SecurePage(driver);
		String actualFlashMsg = securePage.getFlash();
		ScreenShotUtils.takeScreenShotWithHighligtedElement(driver, securePage.getFlashElement());
		String expectedFlashMsg = "You logged into a FAILURE!";
		boolean status = CustomAssertion.validateExpectedContainsInActual(actualFlashMsg, expectedFlashMsg);

		if (status)
			test.pass("Test Passed");
		else {
			test.assignAuthor("Techcanvass");
			test.assignCategory("Sanity");
			test.info("This test will fail!!!");
			
			test.fail("Test Failed", MediaEntityBuilder
					.createScreenCaptureFromBase64String(ScreenShotUtils.getScreenshotAsBase64(driver)).build());
		}
	}

	@Test
	public void login() {
		test = ExtentReporterSetup.getInstance().createTest("Login Second");

		ScreenShotUtils.takeFullPageScreenShot(driver);
		ScreenShotUtils.takeScreenShotWithDate(driver, "Heroku App Main Page. URL - " + HOME_PAGE);

		MainPage mainPage = new MainPage(driver);

		CustomAssertion.validateExpectedContainsInActual(mainPage.getMessageText(), "Welcome to the-internet");
		boolean status = CustomAssertion.softAssertExpectedContainsInActual(mainPage.getSubHeading(),
				"Available Examples");
		if (status)
			test.pass("Test Passed");
		else {
			test.assignAuthor("Techcanvass");
			test.assignCategory("Sanity");
			test.info("This test will fail!!!");
			
			test.fail("Test Failed", MediaEntityBuilder
					.createScreenCaptureFromBase64String(ScreenShotUtils.getScreenshotAsBase64(driver)).build());
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		ExtentReporterSetup.getInstance().flush();
	}

}
