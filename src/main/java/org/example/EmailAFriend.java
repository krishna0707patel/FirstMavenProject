package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmailAFriend {
    //imported selenium web driver interface using maven dependency to perform automation task
    protected static WebDriver driver;
    // main method of this class
    public static void main(String[] args) {

        String timestamp = new SimpleDateFormat("yyyyMMDDHHmmss").format(new Date());
        System.out.println(timestamp);
        //Set the path of the driver for the chromeBrowser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        //creating object with chromeBrowser
        driver = new ChromeDriver();

// to maximise the browser window
        driver.manage().window().maximize();

        //driver.get command used for to open an URL and it will wait till the whole page gets loaded.
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//div[@class=\"item-grid\"]//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        driver.findElement(By.className("email-a-friend")).click();
        driver.findElement(By.name("FriendEmail")).sendKeys("ashish01"+timestamp+"@gmail.com");
        driver.findElement(By.name("YourEmailAddress")).sendKeys("kristy"+timestamp+"@gmail.com");
        driver.findElement(By.name("PersonalMessage")).sendKeys("This Macbook pro is very nice and attractive feature dear!!!!!");
        driver.findElement(By.name("send-email")).click();

        String msg = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).getText();
        System.out.println(msg);

        // The driver.quit command is used to close the webpage.
          driver.quit();

    }
}
