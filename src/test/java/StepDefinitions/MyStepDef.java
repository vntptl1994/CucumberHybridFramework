package StepDefinitions;

import com.qa.Factory.DriverFactory;
import com.qa.Pages.*;
import com.qa.Utils.TestUtil;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MyStepDef /*extends TestBase */{
    Homepage homepage=new Homepage(DriverFactory.getDriver());
    LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
    MyAccountPage myAccountPage=new MyAccountPage(DriverFactory.getDriver());
    FeaturedHomePageproducts featuredHomePageproducts=new FeaturedHomePageproducts(DriverFactory.getDriver());
    FeatureProductDetailsPage featureProductDetailsPage=new FeatureProductDetailsPage(DriverFactory.getDriver());
    DesktopMenuPage desktopMenuPage=new DesktopMenuPage(DriverFactory.getDriver());
    DesktopCategoryPCPage desktopCategoryPCPage=new DesktopCategoryPCPage(DriverFactory.getDriver());
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

    @When("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
      loginPage.validateLogin(username,password);
    }

    @When("User clicks on login button")
    public void userClicksOnLoginButton() {
         homepage=loginPage.clicklogin();
    }

    @Then("User is successfully login")
    public void userIsSuccessfullyLogin() {
        String title=homepage.validatepagetitle();
        Assert.assertEquals(title,"My Account");
    }

    @Then("message is displayed for wrong credentials")
    public void messageIsDisplayedForWrongCredentials() {
        String error="Warning: No match for E-Mail Address and/or Password.";
        String errormessage=loginPage.getmessage();
        System.out.println(errormessage);
        Assert.assertEquals(error,errormessage);

    }

    @When("User click on login button without providing any credentials")
    public void userClickOnLoginButtonWithoutProvidingAnyCredentials() {
        loginPage.clicklogin();
        messageIsDisplayedForWrongCredentials();
    }

    /*@Then("User verify the prodcuts availaibility")
    public void userVerifyTheProdcutsAvailaibility() {
        Assert.assertEquals(featuredHomePageproducts.getproductsize(),"4");
    }*/

    @When("User clicks on any feature product")
    public void userClicksOnAnyFeatureProduct() {
       featureProductDetailsPage=featuredHomePageproducts.clickonfeatureproduct();
       Assert.assertEquals(featureProductDetailsPage.gettitle(),"");
    }

    @Then("User is on FeatureProductdetailsPage")
    public void userIsOnFeatureProductdetailsPage() {
    }

    @When("User click on Desktop menu")
    public void userClickOnDesktopMenu() {
        Boolean value=desktopMenuPage.clickdesktopmenu();
        Assert.assertEquals(value,true);
    }


    @When("User clicks on {string}")
    public void userClicksOn(String pc) {
        desktopCategoryPCPage=desktopMenuPage.clickpcmenu();
        Assert.assertEquals("PC",desktopCategoryPCPage.getdesktopPcmenupagetitle());
    }
}