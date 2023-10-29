package org.example;

public class Game {
    private final int count;
    private final int guess;
    private final int theNumber;


    public Game() {
        count = 0;
        guess = 0;
        theNumber = (int) (Math.random() * 100) + 1;
    }
    public int getCount() {
        return count;
    }
    public int getGuess() {
        return guess;
    }

    public int getTheNumber() {
        return theNumber;
    }




}
