package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateGoogle {
	
	public static void main(String[] args) {
		
		//Setup.
		//Find selenium java jar (java archive)
		
		//1. Create a WebDriver instance
		WebDriver driver = new ChromeDriver(); //browser opening here
		
		//creating a driver instance from ChromDriver class
		//planning to launch chrome browser
		
		//2. Open Chrome Browser
		//3. Navigate to google website (https://www.google.com/)
		//Visualize this driver instance as my chrome browser
		driver.get("https://www.google.com/");
		
		

		
		
		
	}
	

}
