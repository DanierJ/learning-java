package com.danjerous;

public class Main {

    public static void main(String[] args) {
	    // Same method names but different paramaters

       int newScore = calculateScore("Tim", 500);

       calculateScore(300);

       calculateScore();

    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player "+ playerName + "scored " + score + " points");
        return score *1000;
    }

    public static int calculateScore ( int score) {
        System.out.println("Unnamed " + "scored " + score + " points");
        return score *1000;
    }

    public static int calculateScore () {
        System.out.println("No player name, no player score. ");
        return 0;
    }

}
