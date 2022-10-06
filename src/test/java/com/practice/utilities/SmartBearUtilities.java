package com.practice.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {


    //Mini-Task:
    //#1- Create a new class called : SmartBearUtilities
    //#2- Create a method called loginToSmartBear
    //#3- This method simply logs in to SmartBear when you call it.
    //#4- Accepts WebDriver type as parameter

    public static void loginToSmartBear(WebDriver driver) {

        //3. Enter username: “Tester”
        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }

    /*
    • Method takes WebDriver object and String(name).
    • Method should verify if given name exists in orders.
    • This method should simply accepts a name(String), and assert whether
    given name is in the list or not.
    • Create a new TestNG test to test if the method is working as expected.
     */
    public static void verifyOrder(WebDriver driver, String name) {
        //Created a locator only returns the names of the costumer from all of the rows
        //Created a list and stored the cells that has costume name information into it.
        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        //If there is only one table on the page, you don't have to locate the table  --> //tr/td[2]
        //List<WebElement> nameList = driver.findElements(By.xpath("tr/td[2]")

        for (WebElement each : nameList) {    //shortCut iter --> for each loop

            if (each.getText().equals(name)) {
                Assert.assertTrue(true);
                return; // return will exist whole method
            }

        }
        // Assert fail method will fail the test when it is called, no matter what.
        Assert.fail("Name: "+name+" does not exist in the list! Verification FAILED!!!");

    }

    /*

Practice #5: Method: printNamesAndCities
• Create a method named printNamesAndCities in SmartBearUtils class.
• Method takes WebDriver object.
• This method should simply print all the names in the List of All Orders.
• Create a new TestNG test to test if the method is working as expected.
• Output should be like:
• Name1: name , City1: city
• Name2: name , City2: city
     */

    public static void printNameAndCities(WebDriver driver){
    //locating all the names from all the rows and storing in a list of web element
    List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

    //we need to locate all the cities from all the rows
        List<WebElement> citiesList =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

        for (int i = 0; i < nameList.size(); i++){
            System.out.println("name"+(i+1)+": "+nameList.get(i).getText()+", City"+(i+1)+": "+citiesList.get(i).getText());
        }


    }
}
