package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        tags = "@smoke",
        glue = "cucumber",
        features = "src/test/resources/cucumber/features")

public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
