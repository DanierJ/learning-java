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


       /* for (Employee employee : employees) {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
            // new Thread(() -> System.out.println(employee.getAge())).start();
        }*/

        // Enhancement

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

        /*System.out.println("***********************");

        // Employee employee; // can't
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);

            System.out.println(employee.getName());
            new Thread(() -> System.out.println(employee.getAge())).start();

        }*/


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
          //  System.out.println(employee.getName());
        }

       /* String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, employees.get(0).getName(), employees.get(1).getName());*/

       /*UpperConcat uc = (String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase();*/

       UpperConcat uc = (s1, s2) -> {
           String result =
           s1.toUpperCase() + s2.toUpperCase();
           return result;
       };

       String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());

       // System.out.println(sillyString);



        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();

        System.out.println(s);








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

class AnotherClass {
    public String doSomething() {

        int i = 0; // must be final or never change.

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression class's name is " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The anotherClass class's name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
       /* final int i = 0;

        {
            UpperConcat uc = new UpperConcat() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    System.out.println("i (within anonymous class) = " + i);
                    return s1.toUpperCase() + s2.toUpperCase();
                }
            };
            System.out.println("The anotherClass class's name is " + getClass().getSimpleName());
           // i++;
           // System.out.println("i = " + i);

            return Main.doStringStuff(uc, "String1", "String2");
        }*/


        /*System.out.println("The anotherClass class's name is " + getClass().getSimpleName());
        return Main.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("The anonymous class's name is " + getClass().getSimpleName());
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, "String1", "String2");*/
    }
}