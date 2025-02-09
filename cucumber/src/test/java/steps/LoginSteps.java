package steps;

import io.cucumber.java.en.*;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class LoginSteps {

    private WebDriver driver;

    @Given("User opens Chrome browser")
    public void user_opens_chrome_browser() {
        driver = new ChromeDriver();
    }

    @Given("User is on login page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("User enters valid username standard_user and password secret_sauce")
    public void user_enters_valid_username_standard_user_and_password_secret_sauce() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

    }

    @Then("User should successfully login")
    public void user_should_successfully_login() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User should be on inventory page")
    public void user_should_be_on_inventory_page() {
        String actualPageURL = driver.getCurrentUrl();
        String expectedPageURL = "https://www.saucedemo.com/inventory.html";
        assertEquals(expectedPageURL, actualPageURL);
    }

    @When("User enters valid username standard_user and invalid password secret")
    public void user_enters_valid_username_standard_user_and_invalid_password_secret() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret");
    }

    @Then("Login should fail")
    public void login_should_fail() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User should be on login page")
    public void user_should_be_on_login_page() {
        String actualPageURL = driver.getCurrentUrl();
        String expectedPageURL = "https://www.saucedemo.com/";
        assertEquals(expectedPageURL, actualPageURL);

    }

	@And("Browser is closed")
	public void browserIsClosed() {
		driver.quit();
	}
}
