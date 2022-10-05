package chapter_07;

import java.util.Scanner;

/**
 * 11. Sudoku is a popular logic puzzle that uses a 9 by 9 array of squares
 * that are organized into 3 by 3 subarrays. The puzzle solver must fill in
 * the squares with the digits 1 to 9 such that no digit is repeated in any
 * row, any column, or any of the nine 3 by 3 subgroups of squares.
 * Initially, some squares are filled in already and cannot be changed. For
 * example, the following might be a starting configuration for a Sudoku
 * puzzle:
 * Create a class SudokuPuzzle that has the attributes
 * • board—a 9 by 9 array of integers that represents the current state of the
 * puzzle, where 0 indicates a blank square
 * • start—a 9 by 9 array of boolean values that indicates which squares in
 * board are given values that cannot be changed
 * and the following methods:
 * • SudokuPuzzle—a constructor that creates an empty puzzle
 * • toString—returns a string representation of the puzzle that can be
 * printed
 * • addInitial(row, col, value)—sets the given square to the given
 * value as an initial value that cannot be changed by the puzzle solver
 * • addGuess(row, col, value)—sets the given square to the given value;
 * the value can be changed later by another call to addGuess
 * • checkPuzzle—returns true if the values in the puzzle do not violate the
 * restrictions
 * • getValueIn(row, col)—returns the value in the given square
 * • getAllowedValues(row, col)—returns a one-dimensional array of
 * nine booleans, each of which corresponds to a digit and is true if the
 * digit can be placed in the given square without violating the
 * restrictions
 * • isFull—returns true if every square has a value
 * • reset—changes all of the nonpermanent squares back to blanks (0s)
 * Write a main method in the class Sudoku that creates a SudokuPuzzle
 * object and sets its initial configuration. Then use a loop to allow
 * someone to play Sudoku. Display the current configuration and ask for
 * a row, column, and value. Update the game board and display it again.
 * If the configuration does not satisfy the restrictions, let the user know.
 * Indicate when the puzzle has been solved correctly. In that case, both
 * checkPuzzle and isFull would return true. You should also allow
 * options for resetting the puzzle and displaying the values that can be
 * placed in a given square.
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_11
{
    /**
     * sample run =>
     * 1  2  3  4  9  7  8  6  5
     * 4  5  9  0  0  0  0  0  0
     * 6  7  8  0  0  0  0  0  0
     * 3  0  0  0  1  0  0  0  0
     * 2  0  0  0  0  0  0  0  0
     * 9  0  0  0  0  5  0  0  0
     * 8  0  0  0  0  0  0  0  0
     * 7  0  0  0  0  0  0  0  0
     * 5  0  0  9  0  0  0  0  0
     *
     *
     * Enter the position and the value <i, j, v> : 1 3 6
     * 1  2  3  4  9  7  8  6  5
     * 4  5  9  6  0  0  0  0  0
     * 6  7  8  0  0  0  0  0  0
     * 3  0  0  0  1  0  0  0  0
     * 2  0  0  0  0  0  0  0  0
     * 9  0  0  0  0  5  0  0  0
     * 8  0  0  0  0  0  0  0  0
     * 7  0  0  0  0  0  0  0  0
     * 5  0  0  9  0  0  0  0  0
     *
     *
     * Enter the position and the value <i, j, v> : 2 3 2
     * 1  2  3  4  9  7  8  6  5
     * 4  5  9  6  0  0  0  0  0
     * 6  7  8  2  0  0  0  0  0
     * 3  0  0  0  1  0  0  0  0
     * 2  0  0  0  0  0  0  0  0
     * 9  0  0  0  0  5  0  0  0
     * 8  0  0  0  0  0  0  0  0
     * 7  0  0  0  0  0  0  0  0
     * 5  0  0  9  0  0  0  0  0
     *
     *
     * Enter the position and the value <i, j, v> : 0 0 2
     * you can`t change the initial values!!
     * 1  2  3  4  9  7  8  6  5
     * 4  5  9  6  0  0  0  0  0
     * 6  7  8  2  0  0  0  0  0
     * 3  0  0  0  1  0  0  0  0
     * 2  0  0  0  0  0  0  0  0
     * 9  0  0  0  0  5  0  0  0
     * 8  0  0  0  0  0  0  0  0
     * 7  0  0  0  0  0  0  0  0
     * 5  0  0  9  0  0  0  0  0
     *
     *
     * Enter the position and the value <i, j, v> : 8 8 5
     * 1  2  3  4  9  7  8  6  5
     * 4  5  9  6  0  0  0  0  0
     * 6  7  8  2  0  0  0  0  0
     * 3  0  0  0  1  0  0  0  0
     * 2  0  0  0  0  0  0  0  0
     * 9  0  0  0  0  5  0  0  0
     * 8  0  0  0  0  0  0  0  0
     * 7  0  0  0  0  0  0  0  0
     * 5  0  0  9  0  0  0  0  5
     *
     *
     * Enter the position and the value <i, j, v> : 8 8 1
     * 1  2  3  4  9  7  8  6  5
     * 4  5  9  6  0  0  0  0  0
     * 6  7  8  2  0  0  0  0  0
     * 3  0  0  0  1  0  0  0  0
     * 2  0  0  0  0  0  0  0  0
     * 9  0  0  0  0  5  0  0  0
     * 8  0  0  0  0  0  0  0  0
     * 7  0  0  0  0  0  0  0  0
     * 5  0  0  9  0  0  0  0  1
     *
     *
     * Enter the position and the value <i, j, v> :
     * */
    public static void main(String[] args)
    {
        SudokuPuzzle puzzle = new SudokuPuzzle();

        // add the initial positions
        int[] firstRow = {1, 2, 3, 4, 9, 7, 8, 6, 5};
        for (int i = 0; i < 9; i++)
            puzzle.addInitial(0, i, firstRow[i]);

        int[] firstColumn = {1, 4, 6, 3, 2, 9, 8, 7, 5};
        for (int i = 0; i < 9; i++)
            puzzle.addInitial(i, 0, firstColumn[i]);

        puzzle.addInitial(1, 1, 5);
        puzzle.addInitial(1, 2, 9);
        puzzle.addInitial(2, 1, 7);
        puzzle.addInitial(2, 2, 8);
        puzzle.addInitial(3, 4, 1);
        puzzle.addInitial(5, 5, 5);
        puzzle.addInitial(8, 3, 9);

        // Start the game
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            while (!puzzle.checkPuzzle() && !puzzle.isFull())
            {
                System.out.println(puzzle + "\n");

                System.out.print("Enter the position and the value <i, j, v> : ");
                int row = scanner.nextInt();
                int column = scanner.nextInt();
                int value = scanner.nextInt();

                puzzle.addGuess(row, column, value);
            }

            if (puzzle.isFull())
                System.out.println("try a again");
            else
                System.out.println("You win");

            System.out.print("you want to quit? ");
            String answer = scanner.next().trim().toLowerCase();

            if (answer.equals("yes"))
                puzzle.reset();
            else
                break;
        }
    }
}
