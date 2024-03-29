package com.danjerous;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java.", tempExit));


        tempExit = new HashMap<>();

        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
      //  tempExit.put("Q", 0);

        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building.", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
      //  tempExit.put("Q", 0);

        locations.put(2, new Location(2, "You are at the top of a hill.", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
      //  tempExit.put("Q", 0);

        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring.", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        //tempExit.put("Q", 0);

        locations.put(4, new Location(4, "You are in a valley beside a stream.", tempExit));
        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
       // tempExit.put("Q", 0);

        locations.put(5, new Location(5, "You are in the forest.", tempExit));

        Map<String, String> vocabulary = new HashMap<>();


        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("WEST", "W");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");




        int loc = 5;
       /* String[] road = "You are standing at the end of a road before a small brick building".split(" ");

        for (String r : road) {
            System.out.println(r);
        }*/

        while (true) {
            System.out.println(locations.get(loc).getDescription());
            System.out.println("\n");

           locations.get(5).getExits().remove("S");
            Map<String, Integer> exits = locations.get(5).getExits();

            exits.remove("S");


            tempExit.remove("S");

            System.out.print("Available exists of ["+ loc +"] are: ");

            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }



            if (loc == 0) {
                break;
            }

            exits = locations.get(loc).getExits();
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
