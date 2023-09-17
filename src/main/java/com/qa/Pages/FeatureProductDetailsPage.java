package com.qa.Pages;

import org.openqa.selenium.WebDriver;

public class FeatureProductDetailsPage {
    WebDriver driver;
    public FeatureProductDetailsPage(WebDriver driver)  {
        this.driver=driver;
        //PageFactory.initElements(driver,this);
    }
    public String gettitle(){
        return driver.getTitle();
    }
}
