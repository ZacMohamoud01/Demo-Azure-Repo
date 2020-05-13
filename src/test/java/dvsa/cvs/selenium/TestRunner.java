package dvsa.cvs.selenium;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@Zac"},
        plugin = {"pretty"},
        features = "classpath:features",
        glue = {"dvsa.cvs.StepDefs"}
)

public class TestRunner {
}
