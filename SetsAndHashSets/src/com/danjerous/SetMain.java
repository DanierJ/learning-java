package com.danjerous;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(squares);

        union.addAll(cubes);

        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);

        intersection.retainAll(cubes);

        System.out.println("Intersection contains " + intersection.size() + " elements.");

        for (int element : intersection) {
            System.out.println("Num: " + element + " | Square: " + Math.sqrt(element) + " | Cube: " + Math.cbrt(element));
        }

        Set<String> words = new HashSet<>();
        String sentece = "I want to work on Accenture";
        String[] arrayWords = sentece.split(" ");

        words.addAll(Arrays.asList(arrayWords));
        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] arrayWording = {"all", "nature", "but", "art", "cheese"};
        nature.addAll(Arrays.asList(arrayWording));

        String[] divineWords = {"Hello", "Hola", "Tim", "Joder", "nature"};

        divine.addAll(Arrays.asList(divineWords));

        System.out.println("Nature - divine:");
        Set<String> diff1 = new HashSet<>(nature);

        diff1.removeAll(divine);

        printSet(diff1);

        System.out.println("divine - nature");

        Set<String> diff2 = new HashSet<>(divine);

        diff2.removeAll(nature);

        printSet(diff2);


        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference.");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if (nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }

        if (nature.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of nature.");
        }

        if (divine.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of divine.");
        }






    }


    private static void printSet (Set<String> set) {
        System.out.println("\t");
        for (String s : set) {
            System.out.println(s + " ");
        }
        System.out.println();
    }
}
