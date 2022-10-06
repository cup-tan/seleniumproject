package com.practice.tests.day10_testbase_properties_driverUtil;

import com.practice.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file(){

        // Properties: Use Properties class object
        //We create properties object to be able to read configuration.properties file
        Properties properties = new Properties();

        // FileInputStream: opens the file
        String path = "configuration.properties";

        // We will load the file
        // We read from the file
        // Close the file
    }

    @Test
    public void using_properties_utility_method(){
        //This will read the given "key's" value and return it
        // as a String
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));
    }
}
