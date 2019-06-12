package com.danjerous;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionList;

    public Customer(String name) {
        this();
        this.name = name;
        transactionList.add(500.0);
        System.out.println("Me ejecuté.");
    }

    private Customer (){
        this.transactionList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTransaction (Double transaction) {
        transactionList.add(transaction);
        return true;
    }

    public void showTransactions() {
        if (transactionList.size() == 0) {
            System.out.println("There are not customer in this branch.");
        } else {
            for (int i = 0; i < transactionList.size(); i++) {
                System.out.println((i+1) + ". customer [" + transactionList.get(i).doubleValue() + "]"); // Unboxing.
            }
        }
    }
}
