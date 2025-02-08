package heroku.waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FluentWaitExample2 {

	@Test
	public void fluentWaitTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.xpath("//button")).click();

		// Fluent wait logic

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);

		WebElement headingElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//div[@id='finish']//h4"));
			}
		});

		String actualMessage = headingElement.getText();
		System.out.println("actualMessage :: " + actualMessage);
		String expectedMessage = "Hello World!";
		Assert.assertEquals(actualMessage, expectedMessage);

	}

}
