package com.danjerous;

public class Final {
    public static void main(String[] args) {
       /* SomeClass one = new SomeClass("One");
        SomeClass two = new SomeClass("Two");
        SomeClass three = new SomeClass("Three");
*/
       /* System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());*/

        /// Marking a class with final you prevent that class from being subclassed
        // Making a method final it prevents the method from being overridden

       /* int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(654);
        password.letMeIn(674312);*/

        System.out.println("Main method called");

        SIBT test = new SIBT();
        test.someMethod();
        System.out.println("Owner is " + SIBT.owner);
    }
}
