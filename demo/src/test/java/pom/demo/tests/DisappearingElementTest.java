package pom.demo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pom.demo.assertions.CustomAssertion;
import pom.demo.pages.DisappearingElementsPage;
import pom.demo.pages.GalleryPage;
import pom.demo.pages.MainPage;

public class DisappearingElementTest {

	private WebDriver driver;
	private final String HOME_PAGE = "https://the-internet.herokuapp.com/";

	@Parameters({ "browser" })
	@BeforeTest
	public void setup(String browser) {
//		FileUtils.deleteScreenShotDirectory();
		switch (browser) {
		case "chrome": {

			driver = new ChromeDriver();
			driver.get(HOME_PAGE);
			break;
		}
		case "firefox": {

			driver = new FirefoxDriver();
			driver.get(HOME_PAGE);
			break;
		}
		case "edge": {

			driver = new EdgeDriver();
			driver.get(HOME_PAGE);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + browser);
		}

	}

	@Test
	public void testDisappearingGallery() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickOnDisappearingLink();

		DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage(driver);
		disappearingElementsPage.clickGallery();

		GalleryPage galleryPage = new GalleryPage(driver);
		String actual = galleryPage.getHeadingText();
		String expected = "Not Found";

		CustomAssertion.validateExpectedContainsInActual(actual, expected);

	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
