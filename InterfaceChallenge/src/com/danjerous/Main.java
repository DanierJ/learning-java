package com.danjerous;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tim", 100, 15);

        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(90);
        System.out.println(tim);
        tim.setWeapon("Ice");
        saveObject(tim);
      //  loadObject(tim);
        System.out.println(tim);

        ISaveable werewolf = new Monster ("Werewolf", 10, 20);
        System.out.println(werewolf);
        saveObject(werewolf);

        ((Monster) werewolf).getName();
        System.out.println(((Monster) werewolf).getName());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 - To enter a string\n" +
                "0 - To quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    scanner.nextLine();
                    values.add(index
                    , stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject (ISaveable objectToSave) {
        for (int i = 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject (ISaveable objectToLoad) {
        ArrayList<String> values = readValues();

        objectToLoad.read(values);
    }
}
