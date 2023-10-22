package org.example;


import static org.example.Console.displayWelcome;
import static org.example.Console.getRandomInt;

public class GuessingGame {
    public static void main(String[] args) {
        final int LIMIT = 100;

        displayWelcome(LIMIT);
        int number = getRandomInt(LIMIT);
    }
}