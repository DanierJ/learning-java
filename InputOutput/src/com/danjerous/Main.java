package com.danjerous;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, String> vocabulary = new HashMap<>();


        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("WEST", "W");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");




        int loc = 1;
       /*String[] road = "You are standing at the end of a road before a small brick building".split(" ");

        for (String r : road) {
            System.out.println(r);
        }*/

        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("\t\t" + locations.get(loc).getDescription());
            System.out.println("-----------------------------------------------------------------------------------------------");


            Map<String, Integer> exits = locations.get(loc).getExits();

            if (loc == 0) {
                break;
            }
            System.out.print("Available exists of ["+ loc +"] are: ");

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
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction.");
            }






           /* if(!locations.containsKey(loc)) {
                System.out.println("You cannot go in that direction.");
                loc = 1;
            }*/
        }

    }
}
