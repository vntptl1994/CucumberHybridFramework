package com.qa.tutorialninjha.Steps;

import com.qa.tutorialninjha.Base.TestBase;
import io.cucumber.java.en.Given;


public class HomepageStepDefinition extends TestBase{


   @Given("User opens the browser")
   public void user_opens_the_browser()  {
      TestBase.init();

   }

   @Given("User is on home page")
   public void user_is_on_home_page()  {
   }



}
