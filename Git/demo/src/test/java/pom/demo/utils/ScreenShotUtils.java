package pom.demo.utils;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class ScreenShotUtils {

	public static void takeScreenShot(WebDriver driver) {
		Shutterbug.shootPage(driver).save();
	}
	
	public static String getScreenshotAsBase64(WebDriver driver) {
        String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        return screenshotBase64;
    }

	public static void takeFullPageScreenShot(WebDriver driver) {
		Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save();
	}

	public static void takeScreenShotWithDate(WebDriver driver, String message) {
		Shutterbug.shootPage(driver).withTitle(message + new Date()).save("./screenshots");
	}

	public static void takeScreenShotWithBlurredElement(WebDriver driver, WebElement element) {
		Shutterbug.shootPage(driver).blur(element).save("./screenshots");
	}

	public static void takeScreenShotWithHighligtedElement(WebDriver driver, WebElement element) {
		Shutterbug.shootPage(driver).highlight(element).save("./screenshots");
	}



}
