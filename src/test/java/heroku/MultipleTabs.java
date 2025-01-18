package heroku;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/abtest");

		String headingThree = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(headingThree);

		String paragraph = driver.findElement(By.xpath("//p")).getText();
		System.out.println(paragraph);

		String parentHandle = driver.getWindowHandle(); // preserve/save my current tab to a variable

		// To click Elemental Selenium link
		driver.findElement(By.linkText("Elemental Selenium")).click(); // This opens up in new tab
		String currentUrl = driver.getCurrentUrl();// However, driver is pointing to old tab only
		// Here we have to make sure that driver instance switches to new tab
		// Selenium treats new windows/tabs as same
		System.out.println(currentUrl);

		/**
		 * Process to handle multiple windows/tabs 1. Preserve where we are. 2.
		 * Open/click link which will open a new tab/window 3. New tab now opens up 4.
		 * Find all window/tab handles which are open now
		 * 
		 * 
		 */

		Set<String> handles = driver.getWindowHandles();// Store only unique window handles in set of string
		for (String handle : handles) {
			// I know that I have to switch to a tab/window/handle which is NOT
			// currentHandle
			if (!handle.equalsIgnoreCase(parentHandle)) {
				driver.switchTo().window(handle);
			}
		}

		currentUrl = driver.getCurrentUrl();// However, driver is pointing to old tab only

		System.out.println(currentUrl);

		driver.switchTo().defaultContent();
		driver.switchTo().window(parentHandle);

		currentUrl = driver.getCurrentUrl();// However, driver is pointing to old tab only

		System.out.println(currentUrl);

		driver.quit();

	}

}
