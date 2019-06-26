package com.danjerous;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {


        try {
            int result = divide();
            System.out.println(result);

        } catch (ArithmeticException | NoSuchElementException e) { //Multiple catching in one catch statement.
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down.");
        }
    }

    private static int divide() {
        int x, y;
       // try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + " y is " + y);
            return x / y;

        /*} catch (NoSuchElementException e) {
            throw new NoSuchElementException("No suitable input");
        } catch (ArithmeticException e ) {
            throw new ArithmeticException("Attempt to divide by 0");
        }*/
    }

    private static int getInt() {
        System.out.println("Please enter an integer");

        while(true) {
            try {
                return s.nextInt();

            } catch (InputMismatchException e) {
                // got round again. Read pas the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9.");
            }
        }
    }
}