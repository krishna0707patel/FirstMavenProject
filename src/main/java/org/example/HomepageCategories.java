package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageCategories {
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

        // This .findelement command is used for unique identifier a web element with webpage by id,by classname, by xpath.

        driver.findElement(By.className("header-menu")).click();
        String item1 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).getText();

        String item2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/electronics\"]")).getText();

        String item3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]")).getText();

        String item4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]")).getText();

        String item5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]")).getText();

        String item6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/jewelry\"]")).getText();

        String item7 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/gift-cards\"]")).getText();

        //local variable item introduced to find element by .gettext command

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println(item5);
        System.out.println(item6);
        System.out.println(item7);

        // The driver.quit command is used to close the webpage.

        driver.quit();

    }
}
