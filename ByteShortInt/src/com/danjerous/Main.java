package com.danjerous;

public class Main {

    public static void main(String[] args) {


        // Long has a width of 64
        long myLongValue = 100L; // The L is to tell that is a long value
        //  min -2*63, max 2*63

        // Int has a width of 32
        int minValue = -2_147_483_648; // This is the minimum value that it takes.
        int maxValue = 2_147_483_647; // This is the maximum value that it takes.
        int myTotal = (minValue/2);
        System.out.println("My Total int:" + myTotal);

        // Short has width of 16
        short myShortValue = 20; // a bit more larger
        // min -32768, max 32767. Twice a byte

        // byte has a width of 8
        byte myByteValue = 10; // smaller amount of space
        // min -128, max 127
        byte myByteTotal = (byte)(myByteValue/2); /// Java automatically convert expressions into integers so we need to tell the right data type (Type casting)
        System.out.println("My total Byte:" + myByteTotal);

        byte byteVal = 120;
        short shortVal = 3000;
        int intVal = 10000;
        long longVal = 5000L + ((byteVal + shortVal + intVal) * 10L);

        System.out.println("My challenge result: " + longVal);



    }
}
