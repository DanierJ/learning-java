package com.danjerous;

public class Main {

    public static void main(String[] args) {





     /*   WITHOUT ENCAPSULATION


     Player player1 = new Player();

        player1.name = "Danier";
        player1.health = 100;
        player1.weapon = "Sword";


        int damage = 10;

        player1.loseHealth(damage);

        System.out.println("Remaining health = " + player1.healthRemaining());

        damage = 11;

        player1.loseHealth(damage);


        System.out.println("Remaining health = " + player1.healthRemaining());*/

     EnhancedPlayer player = new EnhancedPlayer("Danier", 200, "Sword");

        System.out.println("Initial health is " + player.getHitPoints());



    }
}
