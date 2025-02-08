package heroku;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import utils.ScreenShotUtils;

public class ScreenShotDemo {
	
	@Test
	public void fullScreenShot() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
//		ScreenShotUtils.takeScreenShotOnCurrentScreen(driver);
		Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save();
	}

}
