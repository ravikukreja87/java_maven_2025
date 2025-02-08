package pom.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GalleryPage {
	protected WebDriver driver;

	public GalleryPage(WebDriver driver) {
		this.driver = driver;
	}

	private By heading = By.tagName("h1");

	public String getHeadingText() {
		return driver.findElement(heading).getText().trim();
	}

}
