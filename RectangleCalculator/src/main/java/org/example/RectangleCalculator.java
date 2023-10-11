package org.example;

import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String choice = "y";
       System.out.println("Welcome to the Area and Perimeter Calculator\n");

       // while loop to calculate area and perimeter
        while(choice.equalsIgnoreCase("y")) {
            // prompt user for length and width then store the values
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            // calculate area and perimeter
            double area = width * length;
            double perimeter = 2 * width + 2 * length;
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter + "\n");

            // prompt user to continue or not
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");

    }
}