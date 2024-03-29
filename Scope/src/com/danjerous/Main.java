package com.danjerous;

public class Main {

    public static void main(String[] args) {

        String privateVar = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();

        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();

        System.out.println("******");

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();

        innerClass.timesThree();

        System.out.println("****");
        scopeInstance.useInner();
        
    }
}
