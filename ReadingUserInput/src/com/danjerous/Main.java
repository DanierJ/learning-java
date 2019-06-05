package com.danjerous;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of Birth");

        boolean hasNextIn = scanner.hasNextInt(); // Asks if the value entered is an int

        if(hasNextIn) {

            int yearOfBirth = scanner.nextInt(); // it converts the input into a integer

            scanner.nextLine(); // handle next line character

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // gets the user input

            int age = 2019 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Hello," + name  + "! Your age is: " + age );
            } else {
                System.out.println("Invalid value for year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close(); // If we're not using scanner we need to close it. 

    }
}
