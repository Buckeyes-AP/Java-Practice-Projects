package org.example;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        System.out.println("Welcome to the letter Grade Converter\n");

        // while loop for grade converter
        while(choice.equalsIgnoreCase("y")) {
            // Prompt user to enter numerical grade
            System.out.print("Enter numerical grade: ");
            int grade = sc.nextInt();

            // check association of numerical grade to letter grade
            if (grade >= 88) {
                System.out.println("Letter grade: A");
            } else if (grade >= 80) {
                System.out.println("Letter grade: B");
            } else if (grade >= 67) {
                System.out.println("Letter grade: C");
            } else if (grade >= 60) {
                System.out.println("Letter grade: D");
            } else {
                System.out.println("Letter grade: F");
            }

            // choice to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
        }
        System.out.println("Goodbye!");
    }
}