package org.example;


import java.util.Scanner;

import static org.example.Console.displayWelcome;
import static org.example.Console.getRandomInt;

public class GuessingGame {
    public static void main(String[] args) {
        final int LIMIT = 100;

        displayWelcome(LIMIT);
        int number = getRandomInt(LIMIT);

        Scanner sc = new Scanner(System.in);
        int count = 1;
        String choice  = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter number: ");
            int guess = sc.nextInt();

            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }

            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            } else {
                System.out.println("You guessed it in " + count + " tries.\n");
                break;
            }
            count++;
        }
        System.out.println("Goodbye!");
    }
}