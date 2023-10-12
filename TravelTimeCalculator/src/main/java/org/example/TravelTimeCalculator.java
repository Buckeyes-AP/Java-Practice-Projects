package org.example;

import java.util.Scanner;

public class TravelTimeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        System.out.println("Welcome to the Travel Time Calculator\n");

        // while loop to calculate travel time
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles: ");
            double miles = sc.nextDouble(); // 200
            System.out.print("Enter miles per hour: ");
            double mph = sc.nextDouble(); // 65
            System.out.println();
            // Calculate hours
            double time = miles / mph;  // 200/65 = 3.0796
            double estTime = (double) Math.round(time * 100) / 100; // 3.08
            int hours = (int) Math.floor(estTime);

            // Calculate minutes
            double minutesOnly = estTime % 1; // .080000
            double estMinutes = (double) Math.round(minutesOnly * 100) / 100; // 0.08
            double minuteConverter = 60 * estMinutes;
            int minutes = (int) Math.floor(minuteConverter);

            // Print-out results
            System.out.println("Estimated travel time");
            System.out.println("---------------------");
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes + "\n");

            // prompt user to continue or not
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");

    }
}