package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFramesExample {

	@Test
	public void nestedFrames() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		switchToFrame(driver, "frame-right");
		switchToFrame(driver, "frame-left");
		switchToFrame(driver, "frame-middle");

		driver.switchTo().frame("frame-bottom");
		String text = driver.findElement(By.xpath("//body")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
	}

	private void switchToFrame(WebDriver driver, String frameName) {
		WebDriver topFrame = driver.switchTo().frame("frame-top");
		topFrame.switchTo().frame(frameName);
		String bodyText = topFrame.findElement(By.xpath("//body")).getText();
		System.out.println(bodyText);
		driver.switchTo().defaultContent();
	}

}
