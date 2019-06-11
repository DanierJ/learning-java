package com.danjerous;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How long is your array? \r");
        int count =  scanner.nextInt();

        System.out.println("Well, then fill it in.");

        int[] array = readIntegers(count);

        System.out.println("The minimum value is: " + findMin(array));

    }

    private static int[] readIntegers(int count) {


        int[] array = new int[count];

        System.out.println("Enter " + count + " numbers: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;

    }

    private static int findMin (int[] array) {
        // Integer.MAX_VALUE;

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;

    }
}
