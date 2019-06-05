package com.danjerous;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";

        myString += " with concatenation";

        String notNumber = "220";
        String neitherNumber = "300";

        String notNN = notNumber + neitherNumber;
        //220300

        System.out.println(myString);

        int myVal = 20;

        notNN = notNumber + myVal;
        System.out.println(notNN);
        notNN = myVal + notNumber;
        System.out.println(notNN);

        /// Both cases it converts in String





    }
}
