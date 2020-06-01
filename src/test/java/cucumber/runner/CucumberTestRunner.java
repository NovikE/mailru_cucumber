package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        tags = "@smoke",
        glue = "src/test/java/cucumber/steps",
        features = "src/test/resources/cucumber/features")

public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
