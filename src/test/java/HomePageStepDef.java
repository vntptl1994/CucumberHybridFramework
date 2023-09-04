import com.qa.Base.TestBase;
import com.qa.Pages.Homepage;
import com.qa.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDef extends TestBase {
    Homepage homepage=new Homepage();
    LoginPage loginPage;
    @Given("User opens the browser")
    public void userOpensTheBrowser() {
        TestBase.init();
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
       String title= homepage.validateloginpagetitle();
        Assert.assertEquals(title,"Account Login");
    }
}
