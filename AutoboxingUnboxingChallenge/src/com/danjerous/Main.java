package com.danjerous;

public class Main {

   // private static Bank bank = new Bank("BankFict");
   // private static Branch branch = new Branch("221B");

    public static void main(String[] args) {

        Bank bank = new Bank("BankFict");
        Branch branch = new Branch("221B");
        Customer customer = new Customer("Danier");


        System.out.println("------Branches list------");
        bank.showBranch();
        bank.addBranch(branch);
        bank.addBranch(branch);
        System.out.println("------Branches list------");
        bank.showBranch();
        System.out.println("----Customers list------");
        branch.showCustomer();
        branch.addCustomer(customer);
        System.out.println("----Customers list------");
        branch.showCustomer();
        System.out.println("-----Transactions list----");
        customer.showTransactions();
        customer.addTransaction(60.0);
        System.out.println("-----Transactions list----");
        customer.showTransactions();



    }
}
