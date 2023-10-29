package org.example;

public class Dice {
    private final Die die1;
    private final Die die2;

    public Dice() {
         die1 = new Die();
         die2 = new Die();
    }

    public int getDie1Value() {
        return die1.getValue();
    }

    public int getDie2Value() {
        return die2.getValue();
    }

    public int getSum() {
        return getDie1Value() + getDie2Value();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public void printRoll() {
        int total = getSum();
        System.out.println();
        System.out.println("Die 1: " + getDie1Value());
        System.out.println("Die 2: " + getDie2Value());
        System.out.println("Total: " + total);

        switch (total) {
            case 2:
                System.out.println("Snake eyes!");
                break;
            case 7:
                System.out.println("Craps!");
                break;
            case 12:
                System.out.println("Box cars");
                break;
        }
        System.out.println();
    }
}
