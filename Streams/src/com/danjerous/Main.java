package com.danjerous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                .filter(s -> s.startsWith("G")) // intermediate operation
                .sorted()
                .forEach(System.out::println); // Terminal operation.

        Stream<String> ioNumerStream = Stream.of("I26", "I17", "I29", "O71");

        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");

        Stream<String> concatStream = Stream.concat(ioNumerStream, inNumberStream);

        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count()
        );



        Employee sara = new Employee("Sara Nielsen", 25);
        Employee keanu = new Employee("Keanu Reeves", 40);
        Employee jonas = new Employee("Jonas  Kahnwald", 19);
        Employee martha = new Employee("Martha Nielsen", 19);

        Department biology = new Department("biollogync");

        biology.addEmployee(sara);
        biology.addEmployee(keanu);
        biology.addEmployee(jonas);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(martha);

        List<Department> departments = new ArrayList<>();

        departments.add(biology);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);


        List<String> sortedGNumbers = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList()); // To save the stream.

List<String> sortedGNumbersArrays = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll); // accumulator.

        sortedGNumbers.stream()
                .forEach(System.out::println);

        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        // Reduce

        // Youngest employee
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);


        Stream.of("A", "B", "C")
                .filter(s -> {
                    System.out.println(s);
                    return s.startsWith("A");
                }); // This is lazily evaluated, that means if there's no a terminal operator it won't do a thing.







    }
}
