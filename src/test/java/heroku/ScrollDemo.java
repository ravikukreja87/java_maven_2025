package heroku;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDemo {

	@Test
	public void scrollDemo() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Scroll down

		scrollDown(driver);

	}

	private void scrollDown(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "window.scrollTo(0, document.body.scrollHeight);"; // This line contains javascript code to be
																			// executed
		js.executeScript(script);
	}

}
