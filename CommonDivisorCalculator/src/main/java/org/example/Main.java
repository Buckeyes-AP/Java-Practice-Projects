package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        System.out.println("Greatest Common Divisor Finder");

        System.out.print("Enter first number: ");
        int first = sc.nextInt(); // 12
        System.out.print("Enter second number: ");
        int second = sc.nextInt(); // 8

        for (int i = second; i < first; i++) {

            for ( i = second; i < first; i++) {
                first -= second;
                System.out.println(first);
            }
        }







    }
}