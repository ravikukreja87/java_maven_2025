package heroku.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.ScreenShotUtils;

public class DynamicButton {

	@Test
	public void wait_test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

		//Click on enable button
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
		
		
		String actualMessage = driver.findElement(By.id("message")).getText();
		String expectedMessage = "It's enabled!";
		Assert.assertEquals(expectedMessage, actualMessage);
		
		//Disabling the implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.findElement(By.xpath("//form[@id='input-example']/input")).sendKeys("Testing");
		
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		
		
		
		actualMessage = driver.findElement(By.id("message")).getText();
		expectedMessage = "It's disabled!";
		Assert.assertEquals(expectedMessage, actualMessage);
		
		ScreenShotUtils.takeScreenShotOnCurrentScreen(driver);
		
		
	}

}
