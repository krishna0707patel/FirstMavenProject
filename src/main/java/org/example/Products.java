package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SplittableRandom;

public class Products {
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

        driver.findElement(By.className("header-menu")).click();
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).click();
        driver.findElement(By.xpath("//a[@title=\"Show products in category Desktops\"]")).click();

        String product1 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]")).getText();


        String product2 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();

        String product3 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();

        //local variable item introduced to find element by .gettext command
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        // The driver.quit command is used to close the webpage.
        driver.quit();

    }
}
