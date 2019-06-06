package com.danjerous;

public class Account {
    private double balance;
    private String number;
    private String name;
    private String email;
    private String phone;

    public Account () {
        /*We can call constructor with another constructor*/
        this(0.00, "default Number", "default Name", "default Email", "default phone");

        System.out.println("Empty constructor called");
    }

    public Account (double balance, String number, String name, String email, String phone) {

        System.out.println("Constructor with parameters.");

        this.balance = balance;
        this.number = number;
        this.name = name;
        this.email = email;
        this.email = email;
        //setNumber(number);
    }

    public Account(String name, String email, String phone) {
       this(0.00, "99999", name, email, phone);
    }

    public String getNumber () {
        return this.number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public double getBalance () {
        return this.balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail () {
        return  this.email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPhone () {
        return this.phone;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public void deposit (double amount)  {

        this.balance += amount;

        System.out.println( "Your actual balance is " + this.getBalance());
    }

    public void withdraw (double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            System.out.println( "Your actual balance is " + this.getBalance());
        } else {
            System.out.println(  "You don't have enough funds. Your actual balance is: " + this.getBalance());
        }
    }


}
