package jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#default");
		

		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		String initialText = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println(initialText);
		//Drop here
		
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable")),50,50).build().perform();
//		actions.moveToElement(targetElement);
//		actions.release();
//		actions.build().perform();
		Thread.sleep(2000);
		
		String afterText = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println(afterText);
		//Dropped!
		
//		driver.quit();
		

	}

}
