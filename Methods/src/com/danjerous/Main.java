package com.danjerous;

public class Main {

    public static void main(String[] args) {
        int score;

        score = calculateScore(true, 100, 5, 200 );

        score = calculateScore(true, 300, 8, 600 );

    }

    public static int calculateScore (boolean gameOver, int score, int levelComplete , int bonus) {

        if (gameOver) {
            int finalScore = score + bonus;
            System.out.println("Your final score was" + finalScore);
            return  finalScore;
        }

        return  -1;
    }
}
