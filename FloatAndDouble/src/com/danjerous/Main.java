package com.danjerous;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5 / 2;

        // Widht of a float is 32 (4bytes)
        float myFloatValue = 5f / 3f; /// The f is to specify that is a float 5f. Java assumes that a decimal is a double. (float) 5.4

        // width of a double is 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myIntValue = " + myFloatValue);
        System.out.println("myIntValue = " + myDoubleValue);

        double pounds = 30d;

        double kg = pounds * 0.453_592_37d;

        System.out.println("The conversion is: " + kg);
        /// It's better to use doubles.


    }
}
