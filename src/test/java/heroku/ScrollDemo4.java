package heroku;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollDemo4 {

	@Test
	public void scrollDemo() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Scroll down
		Thread.sleep(3000);
		WebElement body = driver.findElement(By.xpath("//body"));
        
        int deltaY = 1000;
        new Actions(driver)
                .scrollByAmount(0, deltaY)
                .perform();

	}

}
