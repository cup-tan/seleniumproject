package com.practice.tests.day11_utils_review_actions;

public class Singleton {

    // first  the constructor private for singleton
    private Singleton() {
    }

    //Making the String private so that we can only reach this using getter method
    private static String word;

    //Creating a "getter" method to allow users to reach private String above
    public static String getWord(){

        if (word == null){

            System.out.println("First time call. Word Object is null. "+
                    "Assigning value to it now!");
            word = "something";

        }else{
            System.out.println("Word already has value");
        }

        return word;
    }

}
