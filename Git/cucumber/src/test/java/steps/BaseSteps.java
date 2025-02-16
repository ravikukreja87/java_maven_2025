package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseSteps {

    private static WebDriver driver;

    @Before
    public static void setup() {
//        driver = new ChromeDriver();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        chromeOptions.setPageLoadTimeout(Duration.ofSeconds(1));

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"),firefoxOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public static void tearDown() {
        driver.close();
        driver.quit();
    }

}
