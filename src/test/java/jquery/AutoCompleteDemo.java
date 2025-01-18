package jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/#remote");
		
		String heading = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(heading);
		// Autocomplete
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(0);
		Thread.sleep(2000);



		driver.findElement(By.id("birds")).sendKeys("crow");
		Thread.sleep(5000);
		// House Crow
		String text = "";

		while (!text.equals("House Crow")) {
			
			text = driver.findElement(By.xpath("//div[@role='status']/div")).getText();
			Thread.sleep(100);
			System.out.println(text);
			if(text.equals("House Crow")) {
				System.out.println("Inside Break");
				driver.findElement(By.id("birds")).sendKeys(Keys.ARROW_UP);
				driver.findElement(By.id("birds")).sendKeys(Keys.ENTER);
				break;
			}
			driver.findElement(By.id("birds")).sendKeys(Keys.ARROW_DOWN);
		}

		String output = driver.findElement(By.xpath("//div[@id='log']/div")).getText();
		System.out.println(output);
//		driver.quit();
	}

}