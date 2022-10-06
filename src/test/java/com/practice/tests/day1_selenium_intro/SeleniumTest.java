package com.practice.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest  {

    public static void main(String[] args) throws InterruptedException {

        //1- set up the web driver
        WebDriverManager.chromedriver().setup();
    //    System.setProperty("driver.type","path to the driver");
     //   System.setProperty("webdriver.chrome.driver","path to the driver")

        //2- create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3- test if driver is working
        driver.get("https://www.google.com");

        System.out.println("The title of the page is: "+ driver.getTitle());

        String actualTitle = driver.getTitle();
        System.out.println(" ACTUAL TITLE STRING: " + actualTitle);

        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        Thread.sleep(1000);

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        Thread.sleep(1000);

        driver.navigate().to("https://www.facebook.com");

        String pageSource = driver.getPageSource();

        System.out.println("pageSource = " + pageSource);

        driver.close();


    }
}
