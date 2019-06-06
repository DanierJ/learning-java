package com.danjerous;

public class Main {

    public static void main(String[] args) {

        //Account danierAccount = new Account(0.00, "123654", "Danier", "dan@fan.com", "325441");

        /*Account danierAccount = new Account();

        danierAccount.withdraw(100.0);

        danierAccount.deposit(50.0);
        danierAccount.withdraw(100.0);


        danierAccount.deposit(51.0);
        danierAccount.withdraw(100.0);

        Account jackAccount = new Account ("Jack", "jack@k.com", "66554");

        System.out.println(jackAccount.getNumber() + " name " + jackAccount.getName());
*/
        VipCustomer defaultVIP = new VipCustomer();

        System.out.println("name: " + defaultVIP.getName() + " email: " + defaultVIP.getEmail() + " creditLimit: " + defaultVIP.getCreditLimit());

        VipCustomer daveVIP = new VipCustomer("Dave", "dave@gma.com");

        System.out.println("name: " + daveVIP.getName() + " email: " + daveVIP.getEmail() + " creditLimit: " + daveVIP.getCreditLimit());

        VipCustomer lous = new VipCustomer("Lous", "l.com", 1000.00);

        System.out.println("name: " + lous.getName() + " email: " + lous.getEmail() + " creditLimit: " + lous.getCreditLimit());

    }
}
