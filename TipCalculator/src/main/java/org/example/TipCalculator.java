package org.example;


import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        System.out.println("Tip Calculator\n");



        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Cost of meal: ");
            double cost = sc.nextDouble(); // 52.31
            System.out.println();

            // initialize tip percentage
            double tip = .1;

            for (int i = 1; i <= 3; i++) {
                tip += 0.05;

                // tip percentage
                NumberFormat percent = NumberFormat.getPercentInstance();
                String tipPercent = percent.format(tip);
                System.out.println(tipPercent);

                // tip currency
                double tipAmount = (double) Math.round((tip * cost) * 100) / 100; // 7.85
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                String tipCurrency = currency.format(tipAmount);
                System.out.println("Tip amount: " + tipCurrency);

                // total amount
                double total = (double) Math.round((cost + tipAmount) * 100) / 100;
                String totalCurrency = currency.format(total);
                System.out.println("Total amount: " + totalCurrency + "\n");  // 60.16
            }
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        System.out.println("Goodbye!");
    }
}