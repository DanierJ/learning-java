package com.danjerous;

public class Main {

    public static void main(String[] args) {

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("El valor es uno.");
                break;

            case 2:
                System.out.println("El valor es dos.");
                break;

            case 3: case 4: case 5:
                System.out.println("El valor es tres.");
                break;

            default:
                System.out.println("El valor es none");
                break;

        }
    }
}
