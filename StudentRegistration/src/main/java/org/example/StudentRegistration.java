package org.example;

import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Registration Form\n");

        // Request first name
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        // Request last name
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        // Request year of birth
        System.out.print("Enter year of birth: ");
        int year = sc.nextInt();
        System.out.println();

        // Output welcome message
        System.out.println("Welcome " + firstName + " " +lastName);
        System.out.println("Your registration is complete");
        System.out.println("Your temporary password is: " + firstName + "*" + year);
    }
}