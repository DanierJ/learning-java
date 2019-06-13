package com.danjerous;

import java.util.ArrayList;

public class Branch {
    private String idBranch;
    private ArrayList<Customer> customerList;

    public Branch(String idBranch) {
        this.idBranch = idBranch;
        customerList = new ArrayList<>();
    }

    public String getIdBranch() {
        return idBranch;
    }

    public boolean addCustomer (Customer customer) {
        if(findCustomer(customer.getName()) >= 0) {
            System.out.println("Sorry, this customer [" + customer.getName() + "] already exits.");
            return false;
        }

        customerList.add(customer);
        //System.out.println("Customer [" + customer.getName() + "] added successfully.");
        return true;
    }



    private int findCustomer(String customerName) {

        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getName().equals(customerName))
                return i;
        }

        return -1;

    }

    public void showCustomer() {
        if (customerList.size() == 0) {
            System.out.println("There are not customer in this branch.");
        } else {
            for (int i = 0; i < customerList.size(); i++) {
                System.out.println((i+1) + ". customer [" + customerList.get(i).getName() + "]");
            }
        }
    }

    public boolean registerTransaction (String customerName, double amount) {
        int position = findCustomer(customerName);
        if (position >= 0) {
            customerList.get(position).addTransaction(amount);
            System.out.println("customer[" + customerName + "]'s transaction with amount of [" + amount + "] successfully registered.");
            return true;
        }

        System.out.println("Sorry, that customer isn't register in this branch.");
        return false;

    }




}
