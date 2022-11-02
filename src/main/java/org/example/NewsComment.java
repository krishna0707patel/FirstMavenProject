package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComment {
    //imported selenium web driver interface using maven dependency to perform automation task
    protected static WebDriver driver;
    // main method of this class
    public static void main(String[] args) {
//Set the path of the driver for the chromeBrowser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        //creating object with chromeBrowser
        driver = new ChromeDriver();

// to maximise the browser window
        driver.manage().window().maximize();

        //driver.get command used for to open an URL and it will wait till the whole page gets loaded.
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("read-more")).click();
        driver.findElement(By.className("enter-comment-title")).sendKeys("Good shopping website");
        driver.findElement(By.className("enter-comment-text")).sendKeys("This shopping website is very good they values customer's money&feedback.");
        driver.findElement(By.name("add-comment")).click();


       String newscomment = driver.findElement(By.className("result")).getText();
       System.out.println(newscomment);

        // The driver.quit command is used to close the webpage.
        driver.quit();
    }
}
