package com.danjerous;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");

        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondtInstance = new StaticTest("2nd Instance");

        System.out.println(secondtInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thrIns = new StaticTest("3rd instance");

        System.out.println(thrIns.getName() + " is instance number " + StaticTest.getNumInstances());







    }
}
