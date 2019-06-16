package com.danjerous;

public class Main {

    public static void main(String[] args) {
        // Interface: specify methods that a particular class that implements the interface must implement.
        // It's a way to standardize the way a particular set of classes is used.

        DeskPhone telephone = new DeskPhone(1354);

        ITelephone dan;
        dan = new DeskPhone(365);

        telephone.callPhone(1354);
        telephone.answer();

        telephone.hang();

        Gearbox gear = new Gearbox(true, telephone);

        ITelephone danMobile = new MobilePhone(125);
        danMobile.callPhone(125);
        danMobile.answer();

    }
}
