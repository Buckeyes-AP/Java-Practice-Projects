package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Welcome to the Squares and Cubes table \n");
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            System.out.println("Number \tSquared\t Cubed");
            System.out.println("====== \t=======\t =====");
            for (int i = 1; i <= number; i++) {
                int squared = i * i;

                int cubed = i * i * i;

                System.out.println(i + "\t\t" + squared + "\t\t " + cubed);

            }

            System.out.print("\nContinue? (y/n): ");
            choice = sc.next();

        }
        System.out.println("\nGoodbye!");




    }
}