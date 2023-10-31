package org.example;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class BattingStatisticsApp {
    public static void main(String[] args) {

        Console.displayWelcome();
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            int times = Console.getInt("Enter number of times at bat: ", 1, 30);
            Console.points();

            int atBat = 0;
            int hit = 0;
            int sum = 0;

            int[] number = new int[times];

            for (int i = 0; i < number.length; i++) {
                atBat++;
                int result = Console.getInt("Result for at-bat " + atBat + ": ", -1, 5);
                number[i] = result;
            }
            System.out.println();

            for (int i : number) {
                sum += i;

                if (i > 0) {
                    hit++;
                }
            }
            double slugging = (double) sum / number.length;
            double average = (double) hit / number.length;

            DecimalFormat formatPercentage = new DecimalFormat("#0.000");

            System.out.println("Batting average: " + formatPercentage.format(average) + "\n");
            System.out.println("Slugging percent: " + formatPercentage.format(slugging));

            choice = Console.getString("Another player? (y/n): ", "y", "n");
            System.out.println();
        }
        System.out.println("Goodbye!");
    }

}