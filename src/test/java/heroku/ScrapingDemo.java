package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrapingDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/abtest");
		
		String headingThree = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(headingThree);
		
		String paragraph = driver.findElement(By.xpath("//p")).getText();
		System.out.println(paragraph);
		
		//To click Elemental Selenium link
		driver.findElement(By.linkText("Elemental Selenium")).click();
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		
		
		driver.quit();
		
		
	}
	
	
	
}
