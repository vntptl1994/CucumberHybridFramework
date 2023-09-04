import com.qa.Base.TestBase;
import io.cucumber.java.en.Given;

public class MyStepdefs extends TestBase {
    @Given("User opens the browser")
    public void userOpensTheBrowser() {
        TestBase.init();
    }
}
