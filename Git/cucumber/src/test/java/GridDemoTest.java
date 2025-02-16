import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDemoTest {


    @Test
    public void gridDemoTest(){
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setCapability("browserVersion", "100");
//        chromeOptions.setCapability("platformName", "Windows");
// Showing a test name instead of the session id in the Grid UI
        chromeOptions.setCapability("se:name", "My simple test");
// Other type of metadata can be seen in the Grid UI by clicking on the
// session info or via GraphQL
        chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value");
        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.get("http://www.google.com");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}