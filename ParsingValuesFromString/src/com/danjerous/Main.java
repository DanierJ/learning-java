package com.danjerous;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);

        number++;
        numberAsString += 1;

        System.out.println("Number = " +  number);
        System.out.println("numberAsString = " +  numberAsString);

        double numberDouble = Double.parseDouble(numberAsString);

        short numberShort = Short.parseShort(numberAsString);
    }
}
