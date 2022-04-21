package com.innova.java.training.lab.guessgame;


public class GameRun {

    public static void main(final String[] args) {
        NumberGuessGame guessGameLoc = new NumberGuessGame(40);
        while (true) {
            int index = guessGameLoc.showMenuAndGetPref();
            guessGameLoc.execute(index);
        }
    }
}
