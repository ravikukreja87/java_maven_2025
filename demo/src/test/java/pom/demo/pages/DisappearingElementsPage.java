package pom.demo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisappearingElementsPage {

	protected WebDriver driver;

	public DisappearingElementsPage(WebDriver driver) {
		this.driver = driver;
	}

	private By galleryButton = By.xpath("//a[text()='Gallery']");

	public void clickGallery() {

		for (int i = 0; i < 5; i++) {
			if (driver.findElements(galleryButton).size() > 0) {
				driver.findElement(galleryButton).click();
			} else {
				driver.navigate().refresh();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

	}

}
