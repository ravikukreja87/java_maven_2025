package jquery;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class DialogDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/dialog/#default");
		driver.findElement(By.xpath("//a[contains(text(),'Modal f')]")).click();

		WebElement frame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
	
		String heading = driver.findElement(By.xpath("//div[@id='users-contain']/h1")).getText();
		System.out.println(heading);
		// Existing Users:

		addUser(driver, "Jon", "jon@dummy.com", "dummy");
		addUser(driver, "Mark", "mark@dummy.com", "dummy1");
		addUser(driver, "Tom", "tom@dummy.com", "dummy2");
		driver.switchTo().defaultContent();
		Shutterbug.shootElement(driver, frame).save();

//		driver.quit();
	}

	private static void addUser(WebDriver driver, String name, String email, String password) {
		// Add a user
		driver.findElement(By.id("create-user")).click();
		
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[text()='Create an account']")).click();
	}
}