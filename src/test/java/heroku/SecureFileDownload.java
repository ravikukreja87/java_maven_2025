package heroku;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecureFileDownload {

	@Test
	public void secureFileDownlaod() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--safebrowsing-disable-download-protection");
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/download_secure");
		// username:password@url
		driver.findElement(By.linkText("myfile.pdf")).click();
		driver.findElement(By.linkText("pom.xml")).click();

		// Check if file "myfile.pdf is successfully downloaded or not?
		// Check the downloads directory, latest file should be "myfile.pdf"
		Thread.sleep(2000);
		File downloadDirectory = new File("C:\\Users\\91721\\Downloads");
		// List all files available in downloads directory
		File[] downloadDirectoryContents = downloadDirectory.listFiles();
		boolean conditionForFailure = false;
		for (File eachFile : downloadDirectoryContents) {
			if (eachFile.getName().equals("myfile.pdf")) {
				Assert.assertTrue(true);
				System.out.println("File found! - " + eachFile.getName());
				System.out.println(eachFile.getAbsolutePath());
				conditionForFailure = false;
				break;
			} else {
				conditionForFailure = true;
			}
		}
		if (conditionForFailure)
			Assert.assertFalse(true);

	}

}
