package com.practice.tests.day3_cssSelector_xpath;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WT_CybertekLinkVerification {
    public static void main(String[] args) {

        //TC #3: PracticeCybertek/ForgotPassword URL verification
        //1. Open Chrome browser
   //     WebDriverManager.chromedriver().setup();
   //     WebDriver driver = new ChromeDriver();

      WebDriver driver =  WebDriverFactory.getDriver("chrome"); // how to call the method

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Enter any email into input box // for goal approaches we need to use findElement
      //  driver.findElement(By.name("email")).sendKeys("anyemail@domain.com");

        // Web Element Type
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("anyemail@domain.com");// usable, easy to maintain //  variable name

        //4. Click on Retrieve password
      WebElement retrievePasswordButtom =  driver.findElement(By.id("form_submit"));
      retrievePasswordButtom.click(); // we can use this same page , different places, different location



        //5. Verify URL contains:
        //Expected: “email_sent”
        String expectedInUrl = "email_sent";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!!!");
        }

        //6. Verify textbox displayed the content as expected.
        //Expected: “Your e-mail’s been sent!”

        //verify the text



        String actualText = driver.findElement(By.name("confirmation_message")).getText(); // actual text
        String expectedText = "Your e-mail's been sent!";

        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);

        if (actualText.equals(expectedText)){
            System.out.println("Header text value verification PASSED!");
        }else{
            System.out.println("Header text value verification FAILED!!!");
        }

        //verify if the web element is displayed or not





    }
}
