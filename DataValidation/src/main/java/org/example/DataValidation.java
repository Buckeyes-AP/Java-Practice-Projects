package org.example;

import static org.example.Console.getInt;
import static org.example.Console.getString;

public class DataValidation {
    public static void main(String[] args) {

        String choice = "y";
        System.out.println("Welcome to the Area and Perimeter Calculator\n");

        while (choice.equalsIgnoreCase("y")) {
            int length = getInt("Enter length: ", 0, 1000000);

            int width = getInt("Enter width: ", 0, 1000000);


            int area = length * width;
            System.out.println("\nArea: " + (double) area);
            int perimeter = (2 * width) + (2 * length);
            System.out.println("Perimeter: " + (double) perimeter + "\n");

            choice = getString("Continue? (y/n): ", "y", "n");
            System.out.println();

        }
        System.out.println("Goodbye!");
    }
}