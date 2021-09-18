package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report",
        					"json:target/cucumber.json"}, 
				glue = "com.automation.steps",
				dryRun = false,
				features = "src/main/java/features/")
public class TestRunner {

}
