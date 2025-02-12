package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/Features", // Relative path to feature files
        glue = "StepDefinition", // Package containing step definitions
       plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true

)
public class TestRunner {
}