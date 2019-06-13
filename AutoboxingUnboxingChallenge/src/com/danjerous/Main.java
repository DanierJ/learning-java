package com.danjerous;

public class Main {

   // private static Bank bank = new Bank("BankFict");
   // private static Branch branch = new Branch("221B");

    public static void main(String[] args) {

        Bank bank = new Bank("BankFict");

        Branch branch = new Branch("221B");
        Branch sndBranch = new Branch("36KL");

        Customer customer = new Customer("Danier");
        Customer sndCustomer = new Customer("Alexander");

        System.out.println("------Branches list------");
        bank.showBranch();

        bank.registerCustomer("221B", customer);
        bank.addBranch(branch);
        bank.registerCustomer("221B", customer);

        System.out.println("------Branches list------");
        bank.showBranch();

        System.out.println("----Customers list------");
       branch.showCustomer();

       bank.registerTransaction("221B", "Danier", 655.0);
       bank.registerTransaction("221B", "Danier", 655.0);
       bank.registerTransaction("65KL", "Danier", 65.0);

        System.out.println("-----Transactions list----");
        customer.showTransactions();

        System.out.println("\n\n\n\n");
        System.out.println("Buchalkas' Test");

        Bank sndBank = new Bank("National Australia Bank");

        Branch adeBranch = new Branch("Adelaide");

        Customer tim = new Customer("Tim");

        sndBank.addBranch(adeBranch);
        sndBank.registerCustomer("Adelaide", tim);

        sndBank.registerTransaction("Adelaide", "Tim", 44.22);
        sndBank.registerTransaction("Adelaide", "Tim", 44.22);
        sndBank.registerTransaction("Adelaide", "Tim", 44.22);

        System.out.println("-----Transactions list----");
        tim.showTransactions();





        // bank.addBranch(branch);
       // System.out.println("------Branches list------");
       // bank.showBranch();
      //  System.out.println("----Customers list------");
      //  branch.showCustomer();
      //  branch.addCustomer(customer);
     //   System.out.println("----Customers list------");
     //   branch.showCustomer();
     //   System.out.println("-----Transactions list----");
     //   customer.showTransactions();
     //   customer.addTransaction(60.0);
     //   System.out.println("-----Transactions list----");
      //  customer.showTransactions();



    }
}
