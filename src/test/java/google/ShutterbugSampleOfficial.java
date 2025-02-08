package google;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import java.util.Date;
import java.awt.Color;
import java.awt.Font;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShutterbugSampleOfficial {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/imghp");
		WebElement googleLogo = driver.findElement(By.xpath("//img[@alt='Google Images']"));
		WebElement searchBtn = driver.findElement(By.name("btnK"));
		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("Testing");

		Shutterbug.shootPage(driver).blur(searchBox).highlight(searchBtn).monochrome(googleLogo)
				.highlightWithText(googleLogo, Color.blue, 3, "Monochromed logo", Color.blue,
						new Font("SansSerif", Font.BOLD, 20))
				.highlightWithText(searchBox, "Blurred secret words").withTitle("Google home page - " + new Date())
				.withName("home_page").withThumbnail(0.7).save("C:\\testing\\screenshots\\");
		driver.quit();
	}

}
