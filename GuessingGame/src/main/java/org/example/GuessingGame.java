package org.example;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static org.example.Console.*;

public class GuessingGame {
    public static void main(String[] args) {
        final int LIMIT = 100;

        displayWelcome(LIMIT);
        int number = getRandomInt(LIMIT);

        Scanner sc = new Scanner(System.in);
        int count = 1;
        String choice  = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter number: ");
            int guess = sc.nextInt();

            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }

            if (guess < number) {
                System.out.println("Too low! Guess again.\n");
            } else if (guess > number) {
                System.out.println("Too high! Guess again.\n");
            } else if (count > 7 && guess == number) {
                System.out.println("What took you so long? Maybe you should take some lessons.");
                System.out.println("You guessed it in " + count + " tries.\n");
                choice = getString("Continue? (y/n): ", "y", "n");
                if (choice.equals("y")) {
                    count = 1;
                }
                System.out.println();
            }
                else if (count > 3 && count <= 7 && guess == number) {
                System.out.println("Not too bad! You've got some potential.");
                System.out.println("You guessed it in " + count + " tries.\n");
                choice = getString("Continue? (y/n): ", "y", "n");
                if (choice.equals("y")) {
                    count = 1;
                }
                System.out.println();
            } else if (count <= 3 && guess == number) {
                System.out.println("Great work! You are a mathematical wizard.");
                System.out.println("You guessed it in " + count + " tries.\n");
                choice = getString("Continue? (y/n): ", "y", "n");
                if (choice.equals("y")) {
                    count = 1;
                }
                System.out.println();
            } else {
                System.out.println("You guessed it in " + count + " tries.\n");
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
            }
            count++;
        }
        System.out.println("Goodbye!");
    }
}