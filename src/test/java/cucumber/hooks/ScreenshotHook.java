package cucumber.hooks;

import driver.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotHook {

    @After
    public void takeScreenshot(Scenario scenario){

        scenario.write(DriverSingleton.getDriver().getCurrentUrl());
        byte[] screenshot = (DriverSingleton.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png", scenario.getName());

    }
}
