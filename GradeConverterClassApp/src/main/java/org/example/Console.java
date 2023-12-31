package org.example;

import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static void displayWelcome() {
        System.out.println("Welcome to the Letter Grade Converter\n");
    }
    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
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
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer. Try again.");
            }
        }
    }

    public static int getInt (String prompt, int min, int max) {
        while (true) {
            int value = getInt(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than "
                + min + " and less than " + max + ".");
            }
        }
    }

    public static double getDouble(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }

    public static double getDouble(String prompt,double min, double max) {
        while (true) {
            double value = getDouble(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than "
                + min + " and less than " + max + ".");
            }
        }
    }
}
