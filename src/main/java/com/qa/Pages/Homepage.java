package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage /*extends TestBase*/ {
    WebDriver driver;
    /*@FindBy(xpath = "//a[@title=\"My Account\"]//parent::*")
    WebElement myaccount_link;*/
    private By myaccountlink=By.xpath("//a[@title=\"My Account\"]//parent::*");
    private By loginlink=By.linkText("Login");

   /* @FindBy(linkText = "Login")
    WebElement login_link;
*/
    public Homepage(WebDriver driver)  {
        this.driver=driver;
        //PageFactory.initElements(driver,this);
    }
    public String validateloginpagetitle(){
        return driver.getTitle();
    }
    public LoginPage clickonlogin(){
        driver.findElement(loginlink).click();
        return new LoginPage(driver);
    }
    public void clickonMyaccountlink()  {
        driver.findElement(myaccountlink).click();

    }

}
