package org.example;

import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static void displayWelcome() {
        System.out.println("Welcome to the guess number game!");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Try to guess it.");
        System.out.println();
    }

    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;
        int i = (int) d;
        i++;
        return i;
    }
    public static String getString(String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.isEmpty()) {
                System.out.println("Error! This entry is required. Try again.\n");
            } else {
                isValid = true;
            }
        }
        return s;
    }

    public static String getString(String prompt, String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getString(prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" +
                        s2 + "'. Try again.\n");
            } else {
                isValid = true;
            }
        }
        return s;
    }

    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.\n");
            }
            sc.nextLine(); // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".\n");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".\n");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.\n");
            }
            sc.nextLine(); // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".\n");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".\n");
            } else {
                isValid = true;
            }
        }
        return d;
    }
}
