package heroku;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSuccess {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize(); //TO maximize the browser
		
		
		
		driver.findElement(By.linkText("Form Authentication")).click();
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click(); //Login button
		
		//After click on login, lets print current url
		
		System.out.println(driver.getCurrentUrl());
		
		
		String actualResult = driver.findElement(By.id("flash")).getText();
		
//      String expectedResult = "You logged into a secure area!";
        
        System.out.println(actualResult);
        
        WebElement logoutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
        System.out.println(logoutButton.getAttribute("href"));
        logoutButton.click();
        actualResult = driver.findElement(By.id("flash")).getText();
        System.out.println(actualResult);
        
//        You logged out of the secure area!
        driver.quit();

	}

}
