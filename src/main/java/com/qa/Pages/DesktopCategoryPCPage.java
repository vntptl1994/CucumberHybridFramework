package com.qa.Pages;

import org.openqa.selenium.WebDriver;

public class DesktopCategoryPCPage {
    WebDriver driver;
    public DesktopCategoryPCPage(WebDriver driver)  {
        this.driver=driver;
        //PageFactory.initElements(driver,this);
    }
    public String getdesktopPcmenupagetitle(){
        return driver.getTitle();
    }
}
