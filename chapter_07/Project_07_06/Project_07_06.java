package chapter_07;

import java.util.Scanner;

/**
 * 6. Define a class called TicTacToe. An object of type TicTacToe is a single
 * game of tic-tac-toe. Store the game board as a single two-dimensional
 * array of base type char that has three rows and three columns. Include
 * methods to add a move, to display the board, to tell whose turn it is (X or
 * O), to tell whether there is a winner, to say who the winner is, and to
 * reinitialize the game to the beginning. Write a main method for the class
 * that will allow two players to enter their moves in turn at the same
 * keyboard.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        TicTacToe ticTacToe = new TicTacToe();

        while (!ticTacToe.isThereAWinner() && !ticTacToe.isFull())
        {
            ticTacToe.displayBoard();
            System.out.println("Player " + ticTacToe.turn() + " turn");

            System.out.print("Enter an a cell: ");
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            while (!ticTacToe.add(ticTacToe.turn(), row, column))
            {
                System.out.print("Enter an a cell: ");
                row = scanner.nextInt();
                column = scanner.nextInt();
            }
        }

        ticTacToe.displayBoard();
        char winner = ticTacToe.winner();
        if (winner == 0)
            System.out.println("Draw");
        else
            System.out.println("The winner is " + winner);
    }
}
