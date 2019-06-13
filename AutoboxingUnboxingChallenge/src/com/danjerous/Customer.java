package com.danjerous;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionList;

    public Customer(String name) {
        this();
        this.name = name;
        transactionList.add(500.0); // Autoboxing
    }

    private Customer (){
        this.transactionList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTransaction (double transaction) {
        transactionList.add(transaction);
        return true;
    }

    public void showTransactions () {
        if (transactionList.size() == 0) {
            System.out.println("There has not been transactions.");
        } else {
            for (int i = 0; i < transactionList.size(); i++) {
                System.out.println((i+1) + ". Amount [" + transactionList.get(i).doubleValue() + "]"); // Unboxing.
            }
        }
    }
}
