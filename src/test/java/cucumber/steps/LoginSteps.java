package cucumber.steps;

import decorator.CustomDriverDecorator;
import factorymethod.QAUserCreator;
import factorymethod.User;
import factorymethod.UserCreator;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import pages.LoginPage;

import java.io.IOException;

public class LoginSteps {

    private  CustomDriverDecorator driver;

    private LoginPage loginPage;

    @When("the user opens Mail ru page")
    public void opensMailRuPage() {
        loginPage = new LoginPage(driver);
    }

    @When("the user enter his Login name {string} and password {string}")
    public void enterLoginNameAndPassword(String loginName, String password) {
        loginPage.login(new User (loginName, password));
    }

    @Then("the User name in the box equals Login name {string}")
    public void isLoginName(String loginName){
        try {
            Assert.assertTrue(loginPage.getLoggedUserName().contains(loginName), "Wrong user login name!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
