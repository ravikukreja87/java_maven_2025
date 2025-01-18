package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {

		// 1. Create a WebDriver instance
		// 2. Open Chrome Browser
		WebDriver driver = new ChromeDriver(); // browser opening here

		// 3. Navigate to google website (https://www.google.com/)
		driver.get("https://www.google.com/");

		// 4. Enter search string
		// We can see the text box which accepts search string
		// I enter the search string in the text box as "techcanvass training"
		// And click on Google Search button

		// Tool - Developer's Tool, integrated in chrome browser

		// 1) Where to type? That means I have to provide address of the webelement,
		// where I want to type the text

		// HTML - DOM - Document object model
		// 2) What to type?
		driver.findElement(By.name("q")).sendKeys("techcanvass training");
		driver.findElement(By.name("q")).submit();

		// techcanvass training - Google Search

		String expectedResult = "techcanvass training - Google Search";
		String actualResult = driver.getTitle();
		System.out.println(actualResult);
		// Assertion -comparing actual result with expected result

		if (expectedResult.equals(actualResult)) {
			System.out.println("Test Passed!");

		} else {
			System.out.println("Test Failed!");
			AssertionError.class.getName();
		}

		driver.quit();

	}

}
