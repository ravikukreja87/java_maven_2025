package steps;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CartSteps {

    WebDriver driver = BaseSteps.getDriver();


    double totalCartPrice;
    private double taxAmount;

/*    @Given("User logs in successfully to sauce demo web application")
    public void user_logs_in_successfully_to_sauce_demo_web_application() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/

    @When("User adds Bolt T-Shirt and Red T-Shirt to the cart")
    public void user_adds_bolt_t_shirt_and_red_t_shirt_to_the_cart() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();


    }

    @When("Click on Cart Icon")
    public void click_on_cart_icon() {

        driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click();
    }

    @When("Clicks on Checkout button")
    public void clicks_on_checkout_button() {
        driver.findElement(By.id("checkout")).click();
    }

    @When("enters first name as {string}, last name as {string}, zip code as {int}")
    public void enters_first_name_as_jon_last_name_as_tom_zip_code_as(String firstName, String lastName, int zipcode) {
        driver.findElement(By.id("first-name")).sendKeys(firstName);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        driver.findElement(By.id("postal-code")).sendKeys(String.valueOf(zipcode));


        Shutterbug.shootPage(driver).save();

        String latestFileNameInFolder = Objects.requireNonNull(findUsingCommonsIO("./screenshots")).getAbsolutePath();

        try (InputStream is = Files.newInputStream(Paths.get(latestFileNameInFolder))) {
            Allure.attachment(latestFileNameInFolder, is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static File findUsingCommonsIO(String sdir) {
        File dir = new File(sdir);
        if (dir.isDirectory()) {
            File[] dirFiles = dir.listFiles((FileFilter) FileFilterUtils.fileFileFilter());
            if (dirFiles != null && dirFiles.length > 0) {
                Arrays.sort(dirFiles, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
                return dirFiles[0];
            }
        }

        return null;
    }

    @When("Click on Continue button")
    public void click_on_continue_button() {
        driver.findElement(By.id("continue")).click();
        ;
    }

    @When("Clicks on Finish button")
    public void clicks_on_finish_button() {
        driver.findElement(By.name("finish")).click();
    }

    @Then("Thank you for your order! must be displayed to the user")
    public void thank_you_for_your_order_must_be_displayed_to_the_user() {
        String expectedResult = "Thank you for your order!";
        String actualResult = driver.findElement(By.xpath("//h2")).getText();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Then("User must be on checkout-complete page")
    public void user_must_be_on_checkout_complete_page() {
        String expectedResult = "Checkout: Complete!";
        String actualResult = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(expectedResult, actualResult);


        String expectedURL = "https://www.saucedemo.com/checkout-complete.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);


    }

    @When("Read and store the prices of added products")
    public void read_and_store_the_prices_of_added_products() {

        List<WebElement> priceOfAllProducts = driver.findElements(By.xpath("//div[@data-test='inventory-item-price']"));

        for (WebElement element : priceOfAllProducts) {
            String price = element.getText().replace("$", "");
            System.out.println("Price = " + price);
            totalCartPrice = totalCartPrice + Double.parseDouble(price);
        }

    }

    @Then("total of added products must be displayed correctly under Price Total Item Total label")
    public void total_of_added_products_must_be_displayed_correctly_under_price_total_item_total_label() {
        String actualItemTotalOnWebPage = driver.findElement(By.xpath("//div[@data-test='subtotal-label']")).getText();
        actualItemTotalOnWebPage = actualItemTotalOnWebPage.replace("Item total: $", "");
        double itemTotal = Double.parseDouble(actualItemTotalOnWebPage);
        Assert.assertEquals(itemTotal, totalCartPrice, 0);


    }

    @Then("{double} percent tax must be added to item total")
    public void percent_tax_must_be_added_to_item_total(double tax) {

        taxAmount = totalCartPrice * tax / 100;
        String actualTaxOnWebPage = driver.findElement(By.xpath("//div[@data-test='tax-label']")).getText().replace("Tax: $", "");
        double taxOnWebPage = Double.parseDouble(actualTaxOnWebPage);
        Assert.assertEquals(taxAmount, taxOnWebPage, 0.01);


    }

    @Then("validate Total label")
    public void validate_total_label() {
        double totalAfterTax = totalCartPrice + taxAmount;
        String actualTotalOnWebPage = driver.findElement(By.xpath("//div[@data-test='total-label']")).getText();
        double itemTotal = Double.parseDouble(actualTotalOnWebPage.replace("Total: $", ""));
        Assert.assertEquals(totalAfterTax, itemTotal, 0.01);
    }


}
