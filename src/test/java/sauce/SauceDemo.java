package sauce;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import constants.LocatorConstant;
import constants.WebConstants;
import utils.ExcelUtils;

public class SauceDemo {

	@Test
	public void ecomFlow() throws Exception, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebConstants.TIMEOUT_SECS));

		List<Map<String, Object>> fullData = ExcelUtils.readExcel();

		for (Map<String, Object> eachRow : fullData) {
			System.out.println("Executing for : " + eachRow.get("UseCase Description").toString());
			driver.get(WebConstants.BASE_URL);
			driver.findElement(By.id(LocatorConstant.LOGIN_USER_NAME)).sendKeys(eachRow.get("UserName").toString()); // Username
			driver.findElement(By.id(LocatorConstant.LOGIN_PASSWORD)).sendKeys(eachRow.get("Password").toString()); // Password
			driver.findElement(By.name(LocatorConstant.LOGIN_BUTTON)).click();
			if (eachRow.get("UseCase Description").toString().equals("Locked Out User Test")) {
				System.out.println("Skipping for Locked out user");
				System.out.println(eachRow.get("UseCase Description").toString() + "\n=====================");
				continue;
			}
			driver.findElement(By.name(LocatorConstant.ADD_TO_CART_BUTTON)).click();
			driver.findElement(By.xpath(LocatorConstant.SHOPPING_CART_ICON)).click();
			driver.findElement(By.id(LocatorConstant.CHECKOUT_BUTTON)).click();
			driver.findElement(By.id(LocatorConstant.FIRST_NAME)).clear();
			driver.findElement(By.id(LocatorConstant.FIRST_NAME)).sendKeys(eachRow.get("First Name").toString());
			driver.findElement(By.id(LocatorConstant.FIRST_NAME)).clear();
			driver.findElement(By.id(LocatorConstant.LAST_NAME)).sendKeys(eachRow.get("Last Name").toString());
			driver.findElement(By.id(LocatorConstant.FIRST_NAME)).clear();
			driver.findElement(By.id(LocatorConstant.POSTAL_CODE)).sendKeys(eachRow.get("Zipcode").toString());
			driver.findElement(By.id(LocatorConstant.CONTINUE_BUTTON)).click();
			driver.findElement(By.id(LocatorConstant.FINISH_BUTTON)).click();
			String orderComplete = driver.findElement(By.xpath(LocatorConstant.ORDER_COMPLETE_HEADING)).getText();
			System.out.println(orderComplete + " for " + eachRow.get("UseCase Description").toString() + "\n=====================");
		}

	}

}
