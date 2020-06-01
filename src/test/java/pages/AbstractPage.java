package pages;

import decorator.CustomDriverDecorator;
import driver.DriverSingleton;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected CustomDriverDecorator driver = DriverSingleton.getDriver();

    protected final int WAIT_TIMEOUTS_SECONDS = 10;

    protected AbstractPage(){
      // this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
