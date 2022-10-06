package com.practice.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_PracticeCybertek_Xpath {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2'] "));
        button2.click();

        String expectedText = "Clicked on button two!";
        String actualText = driver.findElement(By.id("result")).getText();
        System.out.println("actualText = " + actualText);


        if (actualText.equals(expectedText)){
            System.out.println("Text verification is PASSED!");
        }else{
            System.out.println("Text verification is FAILED!!!");
        }

    }
}
