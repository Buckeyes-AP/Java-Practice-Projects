package org.example;


import java.text.NumberFormat;
import java.util.Arrays;

public class SalesReportApp {
    public static void main(String[] args) {
        System.out.println("The Sales Report application\n");
        System.out.println("Region\tQ1\t\t\tQ2\t\t\tQ3\t\t\tQ4");



        double[][] sales = {
                {1540.0, 2010.0, 2450.0, 1845.0}, // Region 1
                {1130.0, 1168.0, 1847.0, 1491.0}, // Region 2
                {1580.0, 2305.0, 2710.0, 1284.0}, // Region 3
                {1105.0, 4102.0, 2391.0, 1576.0}, // Region 4
        };

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        int region = 0;

        for (double[] row : sales) {
            region++;
            System.out.print(region + "\t\t");
            for (double col : row) {
                String currencyString = currency.format(col);
                System.out.print(currencyString + "\t");
            }
            System.out.println();

        }
        System.out.println();

        System.out.println("Sales by region:");
        region = 0;
        double sum = 0;
        for (double[] row: sales) {
            region++;
            System.out.print("Region " + region + ":\t");
            sum = row[0] + row[1] + row[2] + row[3];
            String currencyString = currency.format(sum);
            System.out.print(currencyString);
            System.out.println();
        }
        System.out.println();

        System.out.println("Sales by quarter:");
        region = 0;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;
        for (double[] row: sales) {
            region++;
            sum1 += row[0];
            sum2 += row[1];
            sum3 += row[2];
            sum4 += row[3];
            // System.out.println("Q" + region + ":\t\t");
        }
        System.out.println("Q1: " + currency.format(sum1));
        System.out.println("Q2: " + currency.format(sum2));
        System.out.println("Q3: " + currency.format(sum3));
        System.out.println("Q4: " + currency.format(sum4));

        System.out.println();
        double total = sum1 + sum2 + sum3 + sum4;
        System.out.println("Total sales: " + currency.format(total));
    }
}