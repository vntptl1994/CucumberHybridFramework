package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FeaturedHomePageproducts {
    WebDriver driver;
    By listfeaturedproducts= By.xpath("//div[@id='common-home']//div[@id='content']//div[@class='row']//following::div[starts-with(@class,'product-layout')]");
    By featuredproduct= By.xpath("//div[@id='common-home']//div[@id='content']//div[@class='row']//following::div[starts-with(@class,'product-layout')]");


    public FeaturedHomePageproducts(WebDriver driver)  {
        this.driver=driver;
        //PageFactory.initElements(driver,this);
    }
  public int getproductsize(){
      List<WebElement> featuredproductlist=driver.findElements(listfeaturedproducts);
      return featuredproductlist.size();
    }

    public FeatureProductDetailsPage clickonfeatureproduct(){
        driver.findElement(featuredproduct).click();
        return new FeatureProductDetailsPage(driver);
    }
}
