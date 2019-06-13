package com.danjerous;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchList;

    public Bank(String name) {
        this.name = name;
        branchList = new ArrayList<>();
    }

    public boolean addBranch (Branch branch) {
        if(findBranch(branch.getIdBranch()) >= 0) {
            System.out.println("Sorry, this branch [" + branch.getIdBranch() + "] already exits.");
            return false;
        }

        branchList.add(branch);
        System.out.println("Branch with id[" + branch.getIdBranch() + "] added successfully.");

        return true;
    }



    private int findBranch (String idBranch) {

        for (int i = 0; i < branchList.size(); i++) {
            if(branchList.get(i).getIdBranch().equals(idBranch))
                return i;
        }

        return -1;

    }

    public void showBranch() {
        if (branchList.size() == 0) {
            System.out.println("There are not branches in this bank.");
        } else {
            for (int i = 0; i < branchList.size(); i++) {
                System.out.println((i+1) + ". branchId [" + branchList.get(i).getIdBranch() + "].");
            }
        }
    }

    public boolean registerCustomer (String idBranch, Customer customer) {
        int position = findBranch(idBranch);
        if (position >= 0) {
            if( branchList.get(position).addCustomer(customer)) {
                System.out.println("Customer successfully registered at branch [" + idBranch + "].");
                    return true;
            }

        }

        System.out.println("Sorry, that branch doesn't exists.");
        return false;

    }

    public boolean registerTransaction (String idBranch, String customerName, double amount) {
        int position = findBranch(idBranch);

        if (position >= 0 ) {
            return branchList.get(position).registerTransaction(customerName, amount);
        }

        System.out.println("Sorry, that branch doesn't exists.");
        return false;
    }



}
