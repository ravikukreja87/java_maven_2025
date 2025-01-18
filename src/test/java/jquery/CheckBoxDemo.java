package jquery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");

		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		// Click on any combination of checkboxes
		// 1. We will put all checkboxes in a list of web elements
		List<WebElement> checkboxes = driver.findElements(By.xpath("//legend[text()='Hotel Ratings: ']/../label"));
		System.out.println(checkboxes.size());
		//
//		for (WebElement checkbox : checkboxes) {
//			checkbox.click();
//		}
//		checkboxes.get(1).click();
		checkboxes.get(2).click();
	}
}