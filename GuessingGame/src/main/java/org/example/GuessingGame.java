package org.example;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static org.example.Console.*;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the guess number game!");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("I'm thinking of a number from 1 to 100 .");
        System.out.println("Try to guess it.");
        System.out.println();
        

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            int count = 0;
            int guess = 0;
            int theNumber = (int) (Math.random() * 100) + 1;

            System.out.println("Hint: # is " + theNumber);

            while (guess != theNumber) {
                guess = Console.getInt("Enter number: ", 0, 101);
                count++;

                int diff = theNumber - guess;
                if (diff < -10) {
                    System.out.println("Way too high!");
                } else if (diff > 10) {
                System.out.println("Way too low!");
                } else if (diff < 0) {
                    System.out.println("Too high!");
                } else if (diff > 0) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("You got it in " + count + " tries.");

                    if (count <= 3) {
                        System.out.println("Great work! You're a mathematical wizard!");
                    } else if (count <= 7) {
                        System.out.println("Not too bad. You've got some potential.");
                    } else {
                        System.out.println("What took you so long? Maybe you should take some lessons.");
                    }
                }

                choice = Console.getString("Try again(y/n)?", "y", "n");
            }

        /* int count = 1;

        while (choice.equalsIgnoreCase("y")) {
            int number = getRandomInt(LIMIT);
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

            } else if (count > 3 && count <= 7 && guess == number) {
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
     */
        }
    }
}
