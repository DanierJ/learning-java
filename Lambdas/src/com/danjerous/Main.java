package com.danjerous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    new Thread(new CodeToRun()).start();


	    new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from other runnable.");
            }
        }).start();


	    /// With lambda expression
        new Thread(()-> System.out.println("Printing from the runnable lambda.")).start();


        new Thread(()-> {
            System.out.println("Printing from the runnable lambda.");
            System.out.println("With multiple lines");
        }).start();


        Employee jon = new Employee("Jon Doe", 30);
        Employee dan = new Employee("Dan Doe", 22);
        Employee ulrich = new Employee("Ulrich Nielsen", 42);
        Employee hannah = new Employee("Hannah Nielsen", 36);

        List<Employee> employees = new ArrayList<>();
        employees.add(jon);
        employees.add(dan);
        employees.add(ulrich);
        employees.add(hannah);

        /*Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });*/

        /// With lambdas

        Collections.sort(employees, (employee1, employee2)->employee1.getName().compareTo(employee2.getName()));


        System.out.println("\n");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

       /* String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, employees.get(0).getName(), employees.get(1).getName());*/

       /*UpperConcat uc = (String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase();*/

       UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();

       String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());

        System.out.println(sillyString);


    }

    public final static String doStringStuff (UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from the runnable.");
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat (String s1, String s2);
}