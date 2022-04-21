package com.innova.java.training.lab.guessgame;


public class ScoreHistory {

    private String user;
    private int    score;
    private int    guessCount;

    public String getUser() {
        return this.user;
    }

    public void setUser(final String userParam) {
        this.user = userParam;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(final int scoreParam) {
        this.score = scoreParam;
    }

    public int getGuessCount() {
        return this.guessCount;
    }

    public void setGuessCount(final int guessCountParam) {
        this.guessCount = guessCountParam;
    }

    @Override
    public String toString() {
        return "ScoreHistory [user=" + this.user + ", score=" + this.score + ", guessCount=" + this.guessCount + "]";
    }

}
