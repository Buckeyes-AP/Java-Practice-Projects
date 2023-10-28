package org.example;

public class Grade {

    private int number;
    private String letter;

    public Grade() {
        number = 0;
    }

    public Grade(int grade) {
        number = grade;
    }

    public int getNumber() {
        return number;
    }
    public String getLetter() {
        if (number >= 88) {
            return "A";
        } else if (number >= 80) {
            return "B";
        } else if (number >= 67) {
            return "C";
        } else if (number >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public void setNumber(int number) {
        this.number = number;
    }

}
