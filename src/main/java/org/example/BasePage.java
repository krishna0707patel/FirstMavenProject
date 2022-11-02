package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePage {

   //imported selenium web driver interface using maven dependency to perform automation task
   protected static WebDriver driver;
   // main method of this class
   public static void main(String[] args) {
//Set the path of the driver for the chromeBrowser
      System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
      //creating object with chromeBrowser
      driver = new ChromeDriver();
      String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

      System.out.println(timeStamp);

// to maximise the browser window
      driver.manage().window().maximize();

      //driver.get command used for to open an URL and it will wait till the whole page gets loaded.
      driver.get("https://demo.nopcommerce.com/");
      driver.findElement(By.className("ico-register")).click();
      driver.findElement(By.id("FirstName")).sendKeys("Kristy");

      driver.findElement(By.id("LastName")).sendKeys("shah");
      driver.findElement(By.name("Email")).sendKeys("kristy"+timeStamp+"@gmial.com");
      driver.findElement(By.name("Password")).sendKeys("Kbc@1234");
      driver.findElement(By.name("ConfirmPassword")).sendKeys("Kbc@1234");
      driver.findElement(By.name("register-button")).click();

      String regMsg = driver.findElement(By.className("result")).getText();
      System.out.println(regMsg);
      // The driver.quit command is used to close the webpage.
       driver.quit();





   }



}
