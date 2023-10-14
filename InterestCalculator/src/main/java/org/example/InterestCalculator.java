package org.example;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        System.out.println("Welcome to the Interest Calculator\n");

        while(choice.equalsIgnoreCase("y")) {
            System.out.print("Enter loan amount: ");
            double value = sc.nextDouble();;
            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();

            double interest = value * rate;

            String formattedNumber = String.format("%,.2f", value);
            System.out.println("$" + formattedNumber);

            BigDecimal number = BigDecimal.valueOf(rate);
            BigDecimal percentValue = number.movePointRight(2);
            System.out.println(percentValue + "%" + "");

            formattedNumber = String.format("%,.2f", interest);
            System.out.println("$" + formattedNumber);

            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");





    }
}