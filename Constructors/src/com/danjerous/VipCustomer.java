package com.danjerous;

public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer (String name, String email) {
        this(name, email, 500.0);
    }

    public VipCustomer () {
        this("Jhon", "jhon@j.com", 500.0);
    }






    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

}
