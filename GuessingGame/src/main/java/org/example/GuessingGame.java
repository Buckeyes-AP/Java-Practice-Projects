package org.example;



import static org.example.Console.*;

public class GuessingGame {
    public static void main(String[] args) {

        displayWelcome();

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            Game game = new Game();

            int theNumber = game.getTheNumber();
            int guess = game.getGuess();
            int count = game.getCount();

            System.out.println("Hint: # is " + theNumber);

            while (guess != theNumber) {
                guess = Console.getInt("Enter number: ", 0, 101);
                count++;

                int diff = theNumber - guess;
                if (diff < -10) {
                    System.out.println("Way too high!\n");
                } else if (diff > 10) {
                    System.out.println("Way too low!\n");
                } else if (diff < 0) {
                    System.out.println("Too high!\n");
                } else if (diff > 0) {
                    System.out.println("Too low!\n");
                } else {
                    System.out.println("You got it in " + count + " tries.\n");

                    if (count <= 3) {
                        System.out.println("Great work! You're a mathematical wizard!\n");
                    } else if (count <= 7) {
                        System.out.println("Not too bad. You've got some potential.\n");
                    } else {
                        System.out.println("What took you so long? Maybe you should take some lessons.\n");
                    }
                }


            }
            choice = Console.getString("Try again(y/n)?: ", "y", "n");
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}
