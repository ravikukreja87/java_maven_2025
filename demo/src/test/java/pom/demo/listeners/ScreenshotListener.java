package pom.demo.listeners;

import org.testng.ITestListener;

import pom.demo.tests.LoginTest;
import pom.demo.utils.ScreenShotUtils;

public class ScreenshotListener extends LoginTest implements ITestListener {




	
	void onTestFailure(ITestListener result) {
		ScreenShotUtils.takeFullPageScreenShot(driver);
	}

}
