package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        System.out.println("Greatest Common Divisor Finder \n");

        


        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter first number: ");
            int x = sc.nextInt();
            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            int divisor = 0;

            while (x != 0) {

                for (int i = x; i > 0; i--) {
                    if (x == 0) {
                        break;
                    }
                    x -= y;
                    if (x == 0) {
                        break;
                    }
                    if (x < y) {
                        divisor = x;
                        x = y;
                        y = divisor;
                        continue;
                    }
                    x -= divisor;
                }

            }
            System.out.println("Greatest common divisor: " + y + "\n");
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}