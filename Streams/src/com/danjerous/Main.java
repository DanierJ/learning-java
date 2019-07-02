package com.danjerous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N46",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "071");

        List<String> gNumbers = new ArrayList<>();

        someBingoNumbers.forEach(number -> {
            if(number.toUpperCase().startsWith("G")) {
               // System.out.println(number);
                gNumbers.add(number);

            }
        });

        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));

       // gNumbers.forEach((String s) -> System.out.println(s));


        /// All of the above can be done in one step. Like so:

        someBingoNumbers
                .stream()
                .map(String::toUpperCase) // This is the same as s -> s.toUpperCase() it's calling only a method so you can use the method reference
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);




    }
}
