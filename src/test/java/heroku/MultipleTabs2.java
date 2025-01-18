package heroku;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/abtest");

		String headingThree = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(headingThree);

		String paragraph = driver.findElement(By.xpath("//p")).getText();
		System.out.println(paragraph);

		driver.findElement(By.linkText("Elemental Selenium")).click(); // This opens up in new tab
		
		Thread.sleep(3000);

		Set<String> handles = driver.getWindowHandles();// Store only unique window handles in set of string
		for (String handle : handles) {
			// I switch on all handles one by one and figure out handlestring
			driver.switchTo().window(handle);
			if(driver.getTitle().toLowerCase().contains("elemental")) {
				break; //Break loop if correct handle found
			} else {
				System.out.println("Continue loop - " + driver.getTitle()); //Continue in case of
				//incorrect handle title
			}

		}

		String currentUrl = driver.getCurrentUrl();// However, driver is pointing to old tab only

		System.out.println(currentUrl);
		
		driver.quit();

	}

}
