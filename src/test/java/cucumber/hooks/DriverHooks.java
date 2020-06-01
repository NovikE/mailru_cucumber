package cucumber.hooks;

import decorator.CustomDriverDecorator;
import driver.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverHooks {

    protected CustomDriverDecorator driver;

    @Before
    public void setupDriver(){
        driver = DriverSingleton.getDriver();
    }

    @After
    public void quitDriver(){
        DriverSingleton.closeDriver();
    }
}
