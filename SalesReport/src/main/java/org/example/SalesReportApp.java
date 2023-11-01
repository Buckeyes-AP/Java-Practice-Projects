package org.example;


import java.text.NumberFormat;

public class SalesReportApp {
    public static void main(String[] args) {
        System.out.println("The Sales Report application\n");
        System.out.println("Region\tQ1\t\t\tQ2\t\t\tQ3\t\t\tQ4");

        int region = 0;

        double[][] sales = {
                {1540.0, 2010.0, 2450.0, 1845.0}, // Region 1
                {1130.0, 1168.0, 1847.0, 1491.0}, // Region 2
                {1580.0, 4102.0, 2391.0, 1284.0}, // Region 3
                {1105.0, 4102.0, 2391.0, 1576.0}, // Region 4
        };

        


        for (double[] row : sales) {
            region++;

            System.out.print(region + "\t\t");
            for (double col : row) {
                System.out.print(col + "\t\t");
            }
            System.out.println();
        }

    }
}