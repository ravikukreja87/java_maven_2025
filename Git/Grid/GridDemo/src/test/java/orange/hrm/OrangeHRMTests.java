package orange.hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class OrangeHRMTests {

    WebDriver driver;


    @Parameters("browser")
    @BeforeMethod
    public void setBrowser(String browser) throws MalformedURLException {
        if (browser.equals("Chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        } else if (browser.equals("Firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), firefoxOptions);
        } else if (browser.equals("Edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), edgeOptions);
            String entirePageSource = driver.getPageSource();
            entirePageSource.contains("https://");
        }
    }

    @Test
    public void loginWithValidCredentials() throws MalformedURLException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String expectedResult = "Dashboard";
        String actualResult = driver.findElement(By.xpath("//h6")).getText().trim();
        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test
    public void loginWithInvalidCredentials() throws MalformedURLException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("ad");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String expectedResult = "Invalid credentials";
        String actualResult = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText().trim();
        Assert.assertEquals(actualResult, expectedResult);


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
