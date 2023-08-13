       package com.firstAutomation.testCases;
       import java.util.logging.Logger;
       //import org.apache.log4j.PropertyConfigurator;
       import org.openqa.selenium.WebDriver;
       import org.openqa.selenium.chrome.ChromeDriver;
       import org.testng.annotations.BeforeClass;
       //import org.testng.annotations.BeforeMethod;
       //import org.testng.annotations.BeforeMethod;
       public class BaseClass1 {
	   //static String URL="https://opensource-demo.orangehrmlive.com/";
	   static String URL="https://www.amazon.in/";	
	   String Userids="tahirabdul29@gmail.com";
	   String Passs="P@ssword@393";
	   public static WebDriver driver;
	   public static Logger loger;
	   @BeforeClass
	  //@BeforeMethod		
	   public  void setup() {
	  //System.setProperty("WebDriver.Crome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe"); 
	   driver=new ChromeDriver();
	   driver.get(URL);
	   Logger loger=Logger.getLogger("ORANGEHRM");
	   //PropertyConfigurator.configure("Log4j.properties");
	   }
	   //@AfterClass
	   /*public  void tearDn() {
	   driver.quit();
	   }*/
	   }


