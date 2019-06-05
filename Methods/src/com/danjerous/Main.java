package com.danjerous;

public class Main {

    public static void main(String[] args) {
        int score;

        score = calculateScore(true, 100, 5, 200 );

        System.out.println("Your final score was: " + score);

        score = calculateScore(true, 300, 8, 600 );

        System.out.println("Your final score was: " + score);


        System.out.println("SCORE TABLE");

        displayHighScorePosition("Jason", calculateHighScorePosition(1500));displayHighScorePosition("Zordan", calculateHighScorePosition(900));displayHighScorePosition("Baba", calculateHighScorePosition(400));displayHighScorePosition("Craik", calculateHighScorePosition(50));




    }

    public static int calculateScore (boolean gameOver, int score, int levelComplete , int bonus) {

        if (gameOver) {
            int finalScore = score + bonus;

            return  finalScore;
        }

        return  -1;
    }

    public static void displayHighScorePosition (String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + "on the high score table");
    }

    public static int calculateHighScorePosition (int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500  && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return  4;
        }
    }
}
