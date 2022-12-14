package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/*
We store all the web elements and methods related to LoginPage in this .java class.
 */

public class LoginPage {

    public LoginPage(){ // constructor when we call this constructor, this method will work
        PageFactory.initElements(Driver.getDriver(), this); // this from current object class
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameInput;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }



}
