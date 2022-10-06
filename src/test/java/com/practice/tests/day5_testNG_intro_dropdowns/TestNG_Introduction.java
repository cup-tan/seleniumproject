package com.practice.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Introduction {

    @BeforeClass
    public void setUpClass() { // run one time
        System.out.println("Before class is running...");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("After class is running...");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("before method is running...");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("after method is running...");
    }


    @Test
    public void test1() {
        System.out.println("Test1 is running...");
    }

    @Test
    public void test2() {
        System.out.println("Test2 is running...");
    }

    @Test
    public void test3() {
        String str1 = "TestNG";
        String str2 = "TestNG";
        String str3 = "asdasfd";


        Assert.assertTrue(str1.equals(str2));

        Assert.assertTrue(str1.equals(str3),"Str1 is not equal to Str3.");//when only assertion is false , message will print

        System.out.println("Just checking if this line will run??????");

        Assert.assertEquals(str1,str2,"Failure message just in case str1 is not equals to str2");




    }


}
