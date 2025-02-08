package heroku;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDemo3 {

	@Test
	public void scrollDemo() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Scroll down
		
		WebElement body = driver.findElement(By.xpath("//body"));
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			body.sendKeys(Keys.PAGE_DOWN);
		}
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			body.sendKeys(Keys.PAGE_UP);
		}

	}

}
