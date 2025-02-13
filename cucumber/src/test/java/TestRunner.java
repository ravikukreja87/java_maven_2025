import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		plugin = {
				"pretty",
				"html:target/cucumber-reports.html",
				"json:target/cucumber.json",
				"junit:target/cucumber.xml",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
				},
		dryRun = true,
		monochrome = true
		)


public class TestRunner {
	
	

}
