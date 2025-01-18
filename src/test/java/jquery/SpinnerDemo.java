package jquery;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpinnerDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/spinner/");

		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement inputBox = driver.findElement(By.id("spinner"));
		// Set value to 10
		inputBox.sendKeys("10");
		// Press up arrow key 10 times to increase value to 15
		for (int i = 0; i < 10; i++) {
			inputBox.sendKeys(Keys.ARROW_UP);
		}
		// Press get value button
		driver.findElement(By.id("getvalue")).click();
		// Handle Alert popup dialog

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);

		alert.accept();

		// Status of input box
		System.out.println(inputBox.isEnabled());
		driver.findElement(By.id("disable")).click();
		System.out.println(inputBox.isEnabled());
		driver.findElement(By.id("disable")).click();
		System.out.println(inputBox.isEnabled());

		driver.quit();
	}
}