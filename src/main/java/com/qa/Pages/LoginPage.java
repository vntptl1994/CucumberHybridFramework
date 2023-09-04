package com.qa.Pages;

import com.qa.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id="input-password")
    WebElement password;

    public LoginPage()  {
        PageFactory.initElements(driver,this);
    }

}
