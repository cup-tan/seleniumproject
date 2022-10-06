package com.practice.tests.day10_testbase_properties_driverUtil;

import com.practice.utilities.ConfigurationReader;
import com.practice.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilsPractice {

    @Test
    public void simple_google_search_test() {
        //Driver.getDriver() = driver
        //From now on we will call the driver --> Driver.getDriver();
        Driver.getDriver().get("https://google.com");

        //Locating the google search box using its name attribute value
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        String search = ConfigurationReader.getProperty("searchValue");

        searchBox.sendKeys(search + Keys.ENTER);

        //expected
        String expectedInTitle = search; // "wooden spoon"
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }
}
