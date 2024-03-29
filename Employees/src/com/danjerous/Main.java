package com.danjerous;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Employee jon = new Employee("Jon Doe", 30);
        Employee dan = new Employee("Dan Doe", 22);
        Employee ulrich = new Employee("Ulrich Nielsen", 42);
        Employee hannah = new Employee("Hannah Nielsen", 36);
        Employee charlotte = new Employee("Charlotte Doppler", 45);
        Employee barltoz = new Employee("Barltoz Tiedemann", 18);

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

        // Function

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(1));

        System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        Random random1 = new Random();

        for (Employee employee : employees) {
            if (random1.nextBoolean()) {
                System.out.println(getAName(getFirstName, employee));
            } else {
                System.out.println(getAName(getLastName, employee));
            }
        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();

         Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));

         Function chainedFunction = upperCase.andThen(firstName);

        System.out.println(chainedFunction.apply(employees.get(0)));


        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));


        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);

        c1.andThen(c2).accept("Hello world");





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


    private static String getAName ( Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
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
