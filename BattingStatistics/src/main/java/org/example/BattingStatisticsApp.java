package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BattingStatisticsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Batting Average Calculator");


        System.out.print("Enter number of times at bat: ");
        int bat = sc.nextInt();
        int atBat = 0;
        int hit = 0;
        double average = 0;
        double slugging = 0;
        int sum = 0;
        int[] number = new int[bat];

        for (int i = 0; i < number.length; i++) {
            atBat++;
            System.out.print("Result for at-bat " + atBat + ": ");
            int result = sc.nextInt();
            number[i] = result;
        }
       // Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        for (int i : number) {
            sum += i;

            if (i > 0) {
                hit++;
            }
        }
            slugging = (double) sum / number.length;
            average = (double) hit / number.length;

        System.out.println(slugging);
        System.out.println(average);

    }

}