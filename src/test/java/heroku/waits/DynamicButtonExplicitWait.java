package heroku.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.ScreenShotUtils;

public class DynamicButtonExplicitWait {

	@Test
	public void wait_test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

		// Click on enable button
		driver.findElement(By.xpath("//button[text()='Enable']")).click();

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		
		String actualMessage = driver.findElement(By.id("message")).getText();
		String expectedMessage = "It's enabled!";
		Assert.assertEquals(expectedMessage, actualMessage);

		driver.findElement(By.xpath("//form[@id='input-example']/input")).sendKeys("Testing");

		driver.findElement(By.xpath("//button[text()='Disable']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		actualMessage = driver.findElement(By.id("message")).getText();
		expectedMessage = "It's disabled!";
		Assert.assertEquals(expectedMessage, actualMessage);

		ScreenShotUtils.takeScreenShotOnCurrentScreen(driver);

	}

}
