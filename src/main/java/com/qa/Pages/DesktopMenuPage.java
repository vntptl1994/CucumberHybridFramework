package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DesktopMenuPage {
    WebDriver driver;
    By desktopsmenu=By.linkText("Desktops");
    By menu_pc=By.linkText("PC (0)");
    By desktopmenulis=By.xpath("//ul[@class='nav navbar-nav']//li[@class='dropdown open']");
    public DesktopMenuPage(WebDriver driver)  {
        this.driver=driver;
        //PageFactory.initElements(driver,this);
    }
    public boolean clickdesktopmenu(){
      driver.findElement(desktopsmenu).click();
      return driver.findElement(desktopmenulis).isDisplayed();
    }
    public DesktopCategoryPCPage clickpcmenu(){
        driver.findElement(menu_pc).click();
        return new DesktopCategoryPCPage(driver);
    }
}
