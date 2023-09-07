package StepDefinitions;

import com.qa.Factory.DriverFactory;
import com.qa.Pages.Homepage;
import com.qa.Pages.LoginPage;
import com.qa.Utils.TestUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDef /*extends TestBase */{
    Homepage homepage=new Homepage(DriverFactory.getDriver());
    LoginPage loginPage;
    @Given("User opens the browser")
    public void userOpensTheBrowser() {
        //TestBase.init();
        DriverFactory.getDriver().get(TestUtil.url);
    }

    @When("User clicks on My accountmenu")
    public void userClicksOnMyAccountmenu() {
        homepage.clickonMyaccountlink();

    }


    @And("select Login option")
    public void selectLoginOption() {
        loginPage=homepage.clickonlogin();
    }

    @Then("User is on Loginpage")
        public void userIsOnLoginpage() {
        String title= loginPage.gettitle();
        Assert.assertEquals(title,"Account Login");
    }

}