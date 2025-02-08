package pom.demo.traditional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout {

	WebDriver driver;

	public void openBrowser() {
		driver = new ChromeDriver();
	}

	public void navigateToLoginPage() {
		driver.get("https://the-internet.herokuapp.com/login");
	}

	public void testLogin() {
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button")).click();

		String actualFlashMsg = driver.findElement(By.id("flash")).getText().trim();
		String expectedFlashMsg = "You logged into a secure area!";
		Assert.assertTrue(actualFlashMsg.contains(expectedFlashMsg));
	}

	private void testLogout() {
		driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();

		String actualFlashMsg = driver.findElement(By.id("flash")).getText().trim();
		String expectedFlashMsg = "You logged out of the secure area!";
		Assert.assertTrue(actualFlashMsg.contains(expectedFlashMsg));

	}


	
	@Test
	public void logoutTest() {
		openBrowser();
		navigateToLoginPage();
		testLogin();
		testLogout();
	}

}
