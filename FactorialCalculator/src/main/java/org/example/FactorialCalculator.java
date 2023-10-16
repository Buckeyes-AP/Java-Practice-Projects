package org.example;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        String message = "Enter an integer that's greater than 0 and less than 21: ";
        System.out.println("Welcome to the Factorial Calculator\n");

        while (choice.equalsIgnoreCase("y")) {
            System.out.print(message);
            long input = sc.nextLong();
            long count = 1;

            for (long i = 1; i <= input; i++) {
                count *= i;
            }
            System.out.println("The factorial of " + input + " is " + count + "\n");
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}