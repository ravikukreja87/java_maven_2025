package heroku.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.ScreenShotUtils;

public class DynamicButtonExplicitWait3 {

	@Test
	public void wait_test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		

		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

		// Click on enable button
		driver.findElement(By.xpath("//button[text()='Remove']")).click();

		WebElement checkbox = driver.findElement(By.xpath("//form[@id='checkbox-example']//input"));

		wait.until(ExpectedConditions.invisibilityOf(checkbox));

		String actualMessage = driver.findElement(By.id("message")).getText();
		String expectedMessage = "It's gone!";
		Assert.assertEquals(expectedMessage, actualMessage);
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='checkbox-example']//input")));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form[@id='checkbox-example']//input")))).click();
		
		actualMessage = driver.findElement(By.id("message")).getText();
		expectedMessage = "It's back!";
		Assert.assertEquals(expectedMessage, actualMessage);

		

		ScreenShotUtils.takeScreenShotOnCurrentScreen(driver);

	}

}
