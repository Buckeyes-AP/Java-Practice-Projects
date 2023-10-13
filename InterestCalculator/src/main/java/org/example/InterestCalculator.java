package org.example;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class InterestCalculator {
    public static void main(String[] args) {

        double value = 4944.5;
        String formattedNumber = String.format("%,.2f", value);
        System.out.println("$" + formattedNumber);


        double rate = .01;
        BigDecimal number = BigDecimal.valueOf(rate);
        BigDecimal percentValue = number.movePointRight(2);
        System.out.println(percentValue);



    }
}