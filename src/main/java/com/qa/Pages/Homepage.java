package com.qa.Pages;

import com.qa.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends TestBase {
    @FindBy(linkText = "My Account")
    WebElement myaccount_link;

    @FindBy(linkText = "Login")
    WebElement login_link;

    public Homepage()  {
        PageFactory.initElements(driver,this);
    }
    /*public String validatehomepagetitle(){
        return driver.getTitle();
    }
    public LoginPage clickonMyaccountlink() throws Exception {
        login_link.click();
        return new LoginPage();
    }*/
}
