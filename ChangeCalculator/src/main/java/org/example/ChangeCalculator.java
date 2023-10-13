package org.example;


import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        System.out.println("Welcome to the Change Calculator\n");

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter number of cents (0-99): ");
            int cents = sc.nextInt();
            System.out.println();
            // initialize each coin
            int quarters = 0;
            int dimes = 0;
            int nickels = 0;
            int pennies = 0;

            // keep track of amount
            int count;

            // get change
            if (cents % 25 != 0 || cents == 25) {
                quarters = cents / 25;
                count = quarters * 25;
                cents -= count;
            }
            if (cents % 10 != 0 || cents == 10) {
                dimes = cents / 10;
                count = dimes * 10;
                cents -= count;
            }
            if (cents % 5 != 0 || cents == 5) {
                nickels = cents / 5;
                count = nickels * 5;
                cents -= count;
            }
            if (cents < 5) {
                pennies = cents;
            }

            // print-out results
            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes: " + dimes);
            System.out.println("Nickels: " + nickels);
            System.out.println("Pennies: " + pennies + "\n");

            // exit loop
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}