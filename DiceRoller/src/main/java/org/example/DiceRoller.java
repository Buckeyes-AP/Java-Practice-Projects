package org.example;

import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Roll the dice? (y/n): ");
            choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
            System.out.println();

            int dice1 = dice1();
            System.out.println("Die 1: " + dice1);

            int dice2 = dice2();
            System.out.println("Die 2: " + dice2);

            int total = total(dice1, dice2);
            System.out.println("Total: " + total);

            if (dice1 == 1 && dice2 == 1) {
                System.out.println("Snake eyes!");
            }
            if (dice1 == 6 && dice2 == 6) {
                System.out.println("Boxcars!");
            }
            System.out.println();
            System.out.print("Roll again? (y/n): ");
            choice = sc.next();
        }
        System.out.println("\nGoodbye!");
    }

   public static int dice1() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int dice2() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int total(int dice1, int dice2) {
        return dice1 + dice2;
    }

}