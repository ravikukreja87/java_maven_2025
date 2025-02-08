package pom.demo.traditional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

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

	@Test
	public void test() {
		openBrowser();
		navigateToLoginPage();
		testLogin();
	}

}
