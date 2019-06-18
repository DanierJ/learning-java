package com.danjerous;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       /* ArrayList<Integer> arry = new ArrayList<>();

        arry.add(1);
        arry.add(2);
        arry.add(3);
        arry.add(4);
        arry.add(5);

        doubleValues(arry);*/

       FootballPlayer joe = new FootballPlayer("Joe");
       BaseballPlayer kriss = new BaseballPlayer("Kriss");
       BascketPlayer jon = new BascketPlayer("Jon");

       Team<FootballPlayer> gairaYork = new Team<>("Gaira York");
       gairaYork.addPlayer(joe);
       //gairaYork.addPlayer(kriss);
      // gairaYork.addPlayer(jon);

        System.out.println(gairaYork.numPlayer());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago cubs");
        baseballPlayerTeam.addPlayer(kriss);

        //Team<String> brokenTeam = new Team<>("This won't work");
        //brokenTeam.addPlayer("no-one");

        Team<BascketPlayer> bascketPlayerTeam = new Team<>("Crows");
        bascketPlayerTeam.addPlayer(jon);

        System.out.println("Rankings");
        System.out.println(gairaYork.getName() + " : " + gairaYork.ranking());
    }

    private static void doubleValues(ArrayList<Integer> arr) {
        for(int i : arr) {
            System.out.println(i * 2);
        }
    }
}
