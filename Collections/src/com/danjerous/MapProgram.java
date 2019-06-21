package com.danjerous;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "A compiled high level, object-oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, high level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners all purpose symbolic instructions code."));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

       // System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "The best language to learn"));
        }

        System.out.println(languages.get("Java"));

        System.out.println("==============================================");

      //  languages.remove("Lisp");
        if(languages.remove("Algol", "A algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }


        if(languages.replace("Lisp", "This will not work", "A function programming language with imperative features")) {
            System.out.println("Lisp replaced.");
        } else {
            System.out.println("Lisp not replaced.");
        }

        if(languages.replace("Lisp", "Therein lies madness", "A function programming language with imperative features")) {
            System.out.println("Lisp replaced.");
        } else {
            System.out.println("Lisp not replaced.");
        }

       // System.out.println(languages.replace("Cobol", "This will not be added."));

        System.out.println("==============================================");

        for (String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }



    }
}
