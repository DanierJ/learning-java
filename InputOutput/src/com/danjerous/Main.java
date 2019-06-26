package com.danjerous;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  private static Locations locations = new Locations();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        Map<String, String> vocabulary = new HashMap<>();


        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("WEST", "W");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");



        Location currentLocation = locations.getLocation(1);

        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("\t\t" + currentLocation.getDescription());
            System.out.println("-----------------------------------------------------------------------------------------------");



            if (currentLocation.getLocationID() == 0) {
                break;
            }
            Map<String, Integer> exits = currentLocation.getExits();


            System.out.print("Available exists of are: ");

            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }

            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] words = direction.split(" ");

                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)) {
                currentLocation = locations.getLocation(currentLocation.getExits().get(direction));
            } else {
                System.out.println("You cannot go in that direction.");
            }






           /* if(!locations.containsKey(loc)) {
                System.out.println("You cannot go in that direction.");
                loc = 1;
            }*/
        }
        locations.close();
    }
}
