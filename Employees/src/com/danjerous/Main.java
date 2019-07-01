package com.danjerous;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Employee jon = new Employee("Jon Doe", 30);
        Employee dan = new Employee("Dan Doe", 22);
        Employee ulrich = new Employee("Ulrich Nielsen", 42);
        Employee hannah = new Employee("Hannah Nielsen", 36);
        Employee charlotte = new Employee("charlotte Nielsen", 45);
        Employee barltoz = new Employee("Barltoz Nielsen", 18);

        List<Employee> employees = new ArrayList<>();
        employees.add(jon);
        employees.add(dan);
        employees.add(ulrich);
        employees.add(hannah);
        employees.add(charlotte);
        employees.add(barltoz);

        printEmployeesByAge(employees, "Employe over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "Employees 30 and under", employee -> employee.getAge() <= 30);


        printEmployeesByAge(employees, "Employees younger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });

        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greaterThan15.test(10));

        int a = 20;
        System.out.println(greaterThan15.test(a));
        System.out.println(greaterThan15.and(lessThan100).test(a));




        ///// Suppliers

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);

        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }



       /* System.out.println("Employees over 30:");
        System.out.println("===============");

        employees.forEach(employee -> {
            if (employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        });

        System.out.println("\nEmployee 30 and younger.");
        System.out.println("===============");

        employees.forEach(employee -> {
            if (employee.getAge() <= 30) {
                employee.getName();
            }
        });*/

       /* for (Employee employee : employees) {
            if (employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        }*/
    }

    private static void printEmployeesByAge (List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {

        System.out.println(ageText);
        System.out.println("===============");

        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }

        System.out.println("===============");



       /* employees.forEach(employee -> {
            if (employee.getAge() > 30) {

            }
        });*/
    }
}
