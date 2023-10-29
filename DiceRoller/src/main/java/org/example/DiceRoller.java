package org.example;

import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll the dice? (y/n): ");
        String choice = sc.next();
        while (choice.equalsIgnoreCase("y")) {

            Dice dice = new Dice();

            dice.roll();

            dice.printRoll();

            System.out.print("Roll again? (y/n): ");
            choice = sc.next();
        }
        System.out.println("\nGoodbye!");
    }
}