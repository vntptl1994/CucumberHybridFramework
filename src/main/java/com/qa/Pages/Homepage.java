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
    public String validateloginpagetitle(){
        return driver.getTitle();
    }
    public LoginPage clickonlogin(){
        login_link.click();
        return new LoginPage();
    }
    public void clickonMyaccountlink()  {
        myaccount_link.click();

    }

}
