package com.practice.tests.day12_review_jsexecuter_pom;

import com.practice.utilities.BrowserUtils;
import com.practice.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void uploading_file_test(){
        //Getting the page
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        Driver.getDriver().manage().window().maximize();

        //get the path of the file you want to upload
        //MAC: right click on the file you want to upload
        //click option alt button or command and select"copy as path name"

        //Windows: Right click -> properties -> copy from location
        //OR SHIFT + RIGHT CLICK --> Copy as path
        String path = "/Users/aslihanbasak/Desktop/IMG_7915.HEIC"; // alt option button

        //Locate the upload web element
        WebElement uploadInput = Driver.getDriver().findElement(By.id("file-upload"));

        //send the path of the file to uploadInput webElement
        uploadInput.sendKeys(path);

        //locate the UPLOAD button
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        //click to upload button
        BrowserUtils.wait(2);
        uploadButton.click();


    }
}
