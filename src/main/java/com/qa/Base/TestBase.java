package com.qa.Base;

import com.qa.Utils.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class TestBase {


   public static Properties  properties;
   public static WebDriver driver;

   public TestBase() {
      properties=new Properties();

       try {
           FileInputStream fis=new FileInputStream("C:\\Users\\Amitkumar Patel\\OneDrive\\Desktop\\Naveen Mathur Sessions\\CucumberConcepts\\src\\main\\java\\com\\qa\\Config\\config.properties");
           properties.load(fis);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

   }
   public static void init(){

       WebDriverManager.chromedriver().setup();

       String browsename=properties.getProperty("browser");
       if(browsename.equals("chrome")){
           ChromeOptions options=new ChromeOptions();
           options.addArguments("--remote-allow-origin");
           driver=new ChromeDriver();

       }
       driver.manage().window().maximize();
      // driver.manage().timeouts().implicitlyWait(Duration.ofDays(TestUtil.IMPLICITWAIT_TIMEOUT));
      // driver.manage().timeouts().pageLoadTimeout(Duration.ofDays(TestUtil.PAGE_LOAD_TIEMOUT));
       driver.get(properties.getProperty("url"));

   }

}
