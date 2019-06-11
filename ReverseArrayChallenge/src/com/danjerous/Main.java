package com.danjerous;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 69};

        System.out.println("This is the normal array: " + Arrays.toString(array));

        reverse(array);



    }

    private static void reverse (int[] array) {

      //  int[] reverseArray = Arrays.copyOf(array, array.length);
        int j = array.length-1;
        int temp;
        int count;

        if(array.length % 2 == 0) {
            count = array.length / 2;
        } else {
            count =  array.length / 2 - 1;
        }

        for (int i = 0; i < count; i++) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }

        System.out.println("This is the reversed array: " + Arrays.toString(array));
    }
}
