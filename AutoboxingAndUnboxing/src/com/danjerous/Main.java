package com.danjerous;

import java.util.ArrayList;


class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue (){
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {

        // Need a reference class ArrayList<int> intArray = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();

        intClassArrayList.add(new IntClass(54));

        //var integer = Integer.valueOf(50);
        Integer integer = Integer.valueOf(40);

        Double doubleValue = Double.valueOf(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<>();


        for (int i = 0; i <=10; i++) {
            // Autoboxing
            integerArrayList.add(Integer.valueOf(i));

            System.out.println(i + "--->" + integerArrayList.get(i).intValue()); //Unboxing.
        }

        Integer myIntValue = 56; /// Autoboxing; Integer.valueOf(56)
        int myInt = myIntValue; // myInt.intValue() autounboxing.

        //intClassArrayList.add(myInt); // Can't

        ArrayList<Double> doubleArrayList = new ArrayList<>();

        for (double dbl = 0.0; dbl<= 10.0; dbl+= 0.5) {
            //doubleArrayList.add(Double.valueOf(dbl));

            // autoboxing
            doubleArrayList.add(dbl);
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            //double value = doubleArrayList.get(i).doubleValue();

            // Unboxing
            double value = doubleArrayList.get(i);
            System.out.println(i + " ----> " + value);
        }
















    }
}
