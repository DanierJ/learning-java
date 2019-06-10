package com.danjerous;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;


        System.out.println("myIntValue = " + myIntValue);

        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];

        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        myIntArray[0] = 5;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {1,1,1,1,1};

        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }

    private  static void modifyArray (int[] array)
    {
        System.out.println("/////// Modify///////");

        array[0] = 2;

        System.out.println(Arrays.toString(array));
        array = new int[] {1,2,3,4,5};

        System.out.println(Arrays.toString(array));


        System.out.println("///// END //////");

    }
}
