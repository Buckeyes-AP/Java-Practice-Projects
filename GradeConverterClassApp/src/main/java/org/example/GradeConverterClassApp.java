package org.example;


public class GradeConverterClassApp {
    public static void main(String[] args) {
            Grade grade = new Grade();

            int number = Console.getInt("Enter number: ");

            grade.setNumber(80);
            System.out.println(grade.getLetter());
        }
}