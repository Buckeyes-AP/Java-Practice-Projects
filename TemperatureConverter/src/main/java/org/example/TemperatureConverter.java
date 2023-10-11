package org.example;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String choice = "y";
       System.out.println("Welcome to the Temperature Converter\n");

       //while loop for temperature converter
        while(choice.equalsIgnoreCase("y")) {
            System.out.print("Enter degrees in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            //calculate celsius
            double celsius = (fahrenheit-32) * 5/9;

            // check to see if value is a whole number or not
            if (celsius % 1 == 0) {
                int wholeCelsius = (int) celsius;
                System.out.println("Degrees in Celsius: " + wholeCelsius + "\n");
            } else {
                celsius = (double) Math.round(celsius * 100) / 100;
                System.out.println("Degrees in Celsius: " + celsius + "\n");
            }

            // prompt users choice to continue or not
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}