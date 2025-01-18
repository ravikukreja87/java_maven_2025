package jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#default");

		/**
		 * Switch inside the frame 1. Locate/Find the frame as WebElement 2. Switch to
		 * the frame
		 */
		

		WebElement frame = driver.findElement(By.className("demo-frame"));
//		driver.switchTo().frame(0);
//		driver.switchTo().frame(""); //Name or id attributes
		driver.switchTo().frame(frame);

		String initialText = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println(initialText);
		//Drop here
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceElement, targetElement);
		actions.build().perform();
		
		String afterText = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println(afterText);
		//Dropped!
		
		driver.quit();
		

	}

}
