package step_definitions;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        format = {"pretty", "json:target/cucumber-JSON-report/CucumberTestReport.json"},
        tags = {},
        glue = "stepdefs"
)

public class TestRunner {

}
