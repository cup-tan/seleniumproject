package com.practice.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* TASK: NEW METHOD CREATION
    Method name: getDriver
    Static method
    Accepts string argument: browserType --> will determine what browser opens
        -> if "chrome" opens chrome browser
        -> if "firefox" opens firefox browser
    return type: WebDriver

     */
public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {    // WebDriver is a return Type

        if (browserType.equalsIgnoreCase("Chrome")){
            //System.setProperty("webDriver.chrome.driver", "path");

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.out.println("Given browser does not exist. Driver = null!");
            return null;
        }

    } // (red sign)compile error because we don't have return yet
}