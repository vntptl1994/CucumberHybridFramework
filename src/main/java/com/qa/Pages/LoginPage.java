package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage /*extends TestBase*/ {
    WebDriver driver;
    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id="input-password")
    WebElement password;

    public LoginPage(WebDriver driver)  {
        this.driver=driver;
       // PageFactory.initElements(driver,this);
    }

}
