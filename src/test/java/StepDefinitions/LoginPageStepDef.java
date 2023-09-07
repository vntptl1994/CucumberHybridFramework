package StepDefinitions;

import com.qa.Factory.DriverFactory;
import com.qa.Pages.Homepage;
import com.qa.Pages.LoginPage;
import com.qa.Utils.TestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageStepDef {
    LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
    Homepage homepage;

   /* @Given("User is on Loginpage")
    public void userIsOnLoginpage() {
        String title=loginPage.gettitle();
        Assert.assertEquals(title,"Account Login");
    }*/
    @When("User enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        loginPage.validateLogin(username,password);
    }

    @When("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clicklogin();

    }

    @Then("User is successfully login")
    public void userIsSuccessfullyLogin() {
        String title=loginPage.gettitle();
        Assert.assertEquals(title, TestUtil.HOME_PAGETITLE);
    }


}