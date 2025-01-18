package jquery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelect {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");

		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		
		List<WebElement> multiSelect = driver.findElements(By.xpath("//ol/li"));
		//This multi-select contains 7 elements
		Actions action = new Actions(driver);
		action.click(multiSelect.get(0));
		action.keyDown(Keys.CONTROL);
		action.click(multiSelect.get(3));
		action.click(multiSelect.get(5));
		
		action.build().perform();
		
	}
}