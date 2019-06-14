package com.danjerous;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Dan", 36.65);

	    Customer anotherCustomer = customer;
	    anotherCustomer.setBalance(12.31);

        System.out.println("Balance for customer [" + customer.getName() + "] is [" + customer.getBalance() + "]");


        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);


        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2); // Adds element 2 in index 1

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
