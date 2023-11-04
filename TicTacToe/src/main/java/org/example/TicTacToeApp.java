package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe");
        displayBoard();
        startGame();
        System.out.println("Bye!");

    }

    private static String[][] board = {
            {" ", " ", " ",},
            {" ", " ", " ",},
            {" ", " ", " ",},
    };

    private static void displayBoard() {
        System.out.println();
        System.out.println("+---+---+---+");
        for (String[] row : board) {
            System.out.print("|");
            for (String column : row) {
                System.out.print(" " + column + " |");
            }
            System.out.println();
            System.out.println("+---+---+---+");
        }
        System.out.println();
    }

    private static void startGame() {
        boolean gameOver = false;
        while (gameOver == false) {
            gameOver = takeTurn();
        }
        System.out.println();
        System.out.println("Game over!");
    }

    private static boolean takeTurn() {
        int turn = 1;
        boolean gameOver;
        String mark;
        while(true) {
            if (turn % 2 != 0) {
                mark = "X";
            } else {
                mark = "O";
            }
            System.out.println(mark + "'s turn");

            int row = Console.getInt("Pick a row (1, 2, 3): ");
            if (row < 1 || row > 3) {
                System.out.println("Invalid row number. Try again.");
                continue;
            }
            int column = Console.getInt("Pick a column (1, 2, 3):");
            if (column < 1 || column > 3) {
                System.out.println("Invalid column number. Try again.");
                continue;
            }
            if (!board[row-1][column-1].equals(" ")) {
                System.out.println("This square is already taken. Try again.");
                continue;
            }

            board[row-1][column-1] = mark;
            displayBoard();
            turn++;
        }


    }
}
