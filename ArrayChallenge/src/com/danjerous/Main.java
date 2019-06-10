package com.danjerous;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = getIntegers(5);

        int[] sorted = sortArray(myIntArray);

        printArray(sorted);

    }

    public static int[] getIntegers (int number) {
        int[] values = new int[number];
        System.out.println("Please enter " + number + " numbers.\r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i< array.length; i++) {
            System.out.println("El valor del elemento en la posición [" + i + "] es: " + array[i]);
        }
    }

    public static int[] sortArray (int[] array) {

        /* Copying the array.

        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
               sortedArray[i] = array[i];
        }*/

        //// Copying array with inbuilt function:

        int[] sortedArray = Arrays.copyOf(array, array.length);


        int aux;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1 ; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    aux = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = aux;
                    flag = true;
                }
            }
        }

        return sortedArray;

    }


}
