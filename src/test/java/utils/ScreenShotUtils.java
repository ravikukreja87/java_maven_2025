package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtils {

	public static String generateScreenShotFileName() {

		String filename = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		filename = "screenshots/ss_" + filename + ".png";

		return filename;

	}

	public static void takeScreenShotOnCurrentScreen(WebDriver driver) {

		// TakesScreenshot interface
		// I will need driver instance
		File sourceScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			String screenShotFileName = generateScreenShotFileName();
			File targetFileOnDrive = new File(screenShotFileName);
			FileUtils.copyFile(sourceScreenshotFile, targetFileOnDrive);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
