package com.innova.java.training.lab.guessgame;


public class Score {

    private int guessedNumber;
    private int score;

    public int getGuessedNumber() {
        return this.guessedNumber;
    }

    public void setGuessedNumber(final int guessedNumberParam) {
        this.guessedNumber = guessedNumberParam;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(final int scoreParam) {
        this.score = scoreParam;
    }

    @Override
    public String toString() {
        return "Score [guessedNumber=" + this.guessedNumber + ", score=" + this.score + "]";
    }


}
