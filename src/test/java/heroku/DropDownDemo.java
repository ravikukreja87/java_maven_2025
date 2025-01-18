package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.get("https://the-internet.herokuapp.com/dropdown");
		// Select a value from dropdown
		// 1. Find the dropdown/Locate the dropdown
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		// 2. After finding the dropdown
		// Call Select class
		Select select = new Select(dropdown);
		// 3. Pass dropdown webelement to Select class constructor
		// 4. Instance of select has been created
		// 5. Use this select instance to choose required values from drop down
//		select.selectByVisibleText("Option 2");
//		select.selectByContainsVisibleText("1");

//		select.selectByIndex(0);
		select.selectByValue("1"); // This works on value attribute of option tag

		driver.quit();
	}

}
