package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage /*extends TestBase*/ {
    WebDriver driver;
    private By emailId=By.xpath("//*[@id=\"input-email\"]");
    private By pwd=By.xpath("//*[@id=\"input-password\"]");
    private By loginbutton=By.xpath("//input[@type='submit']");
    private By errormessage=By.xpath("//div[@class='alert alert-danger alert-dismissible']");



    public LoginPage(WebDriver driver)  {
        this.driver=driver;
       // PageFactory.initElements(driver,this);
    }
    public String gettitle(){
        return driver.getTitle();
    }
    public void validateLogin(String username,String password){
       driver.findElement(emailId).sendKeys(username);
       driver.findElement(pwd).sendKeys(password);

    }
    public Homepage clicklogin(){
        driver.findElement(loginbutton).click();
        return new Homepage(driver);
    }
    public String getmessage(){
        String message=driver.findElement(errormessage).getText();
        return message;
    }

}

