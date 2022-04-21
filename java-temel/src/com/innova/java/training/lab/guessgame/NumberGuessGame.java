package com.innova.java.training.lab.guessgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    private static final int              MENU_GAME_INDEX       = 1;
    private static final int              MENU_SCORE_LIST_INDEX = 2;
    private final int                     numberLimit;
    private int                           currentNumber;
    private String                        gameUser;
    private final Scanner                 scanner               = new Scanner(System.in);
    private final ArrayList<ScoreHistory> scoreHistories        = new ArrayList<>();

    public NumberGuessGame(final int numberLimitParam) {
        this.numberLimit = numberLimitParam;
    }

    public void startGame() {
        Random randomLoc = new Random();
        this.currentNumber = randomLoc.nextInt(this.numberLimit);
        System.out.println("Oyuncu isminizi giriniz : ");
        this.gameUser = this.scanner.next();
    }

    public int showMenuAndGetPref() {
        System.out.println(MENU_GAME_INDEX + "-Oyunu oyna");
        System.out.println(MENU_SCORE_LIST_INDEX + "-Skorları gör");
        System.out.println("Seçiminiz : ");
        return this.scanner.nextInt();
    }

    public void execute(final int menuIndex) {
        switch (menuIndex) {
            case MENU_GAME_INDEX:
                this.startGame();
                this.playGame();
                break;
            case MENU_SCORE_LIST_INDEX:
                this.showScoreTable();
                break;
            default:
                break;
        }
    }

    private void showScoreTable() {
        System.out.println("Score Listesi");
        for (ScoreHistory sh : this.scoreHistories) {
            System.out.println(sh);
        }
    }

    public void playGame() {
        ArrayList<Score> gameScoreList = new ArrayList<>();
        int totalScore = 0;
        while (true) {
            System.out.println("Bir sayı giriniz (0-" + this.numberLimit + ") :");
            int guessedNumber = this.scanner.nextInt();
            Score scoreLoc = new Score();
            scoreLoc.setGuessedNumber(guessedNumber);
            if (guessedNumber > this.currentNumber) {
                System.out.println("Büyük girdiniz. Sayıyı küçültün.");
                int deltaScore = guessedNumber - this.currentNumber;
                totalScore += deltaScore;
                scoreLoc.setScore(deltaScore);
            } else if (guessedNumber < this.currentNumber) {
                System.out.println("Küçük girdiniz. Sayıyı büyültün.");
                int deltaScore = this.currentNumber - guessedNumber;
                totalScore += deltaScore;
                scoreLoc.setScore(deltaScore);
            } else {
                for (Score s : gameScoreList) {
                    System.out.println(s);
                }
                System.out.println("Bildiniz. Sayı : " + this.currentNumber + " skorunuz : " + totalScore);
                ScoreHistory historyLoc = new ScoreHistory();
                historyLoc.setUser(this.gameUser);
                historyLoc.setScore(totalScore);
                historyLoc.setGuessCount(gameScoreList.size());
                this.scoreHistories.add(historyLoc);
                break;
            }
            gameScoreList.add(scoreLoc);
        }
    }


}
