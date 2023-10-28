package org.example;


public class GradeConverterClassApp {
    public static void main(String[] args) {

        Console.displayWelcome();
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            Grade grade = new Grade();

            int number = Console.getInt("Enter numerical grade: ");

            grade.setNumber(number);

            String letter = grade.getLetter();

            System.out.println("Letter grade: " + letter + "\n");

            choice = Console.getString("Continue? (y/n): ", "y", "n");
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}