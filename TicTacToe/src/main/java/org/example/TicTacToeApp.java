package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeApp {
    public static void main(String[] args) {

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        System.out.println("+---+---+---+");
        System.out.println("|  " + board[0][0] + "|  " + board[0][1] + "|  " + board[0][2] + "|");

    }
}