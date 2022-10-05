package chapter_07;

import java.util.Arrays;

public class SudokuPuzzle
{
    private int[][] board = new int[9][9];
    private boolean[][] start = new boolean[9][9];

    public SudokuPuzzle() { }

    public void addInitial(int row, int col, int value)
    {
        if (row < 0 || row > 8 || col < 0 || col > 8)
            return;
        if (value < 1 || value > 9)
            return;

        board[row][col] = value;
        start[row][col] = true;
    }

    public void addGuess(int row, int col, int value)
    {
        if (row < 0 || row > 8 || col < 0 || col > 8)
        {
            System.out.println("Enter a valid position!!");
            return;
        }

        if (value < 1 || value > 9)
        {
            System.out.println("Enter a valid value!!");
            return;
        }


        if (!start[row][col])
        {
            board[row][col] = value;
            return;
        }

        System.out.println("you can`t change the initial values!!");
    }

    public boolean checkPuzzle() {
        // check rows
        for (int i = 0; i < 9; i++) {
            boolean[] checker = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0)
                    return false;
                checker[board[i][j] - 1] = true;
            }

            for (int j = 0; j < 9; j++)
                if (!checker[j])
                    return false;
        }

        // check columns
        for (int i = 0; i < 9; i++) {
            boolean[] checker = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == 0)
                    return false;
                checker[board[j][i] - 1] = true;
            }

            for (int j = 0; j < 9; j++)
                if (!checker[j])
                    return false;
        }

        // check sub squares
        for (int i = 0; i < 7; i += 3)
        {
            for (int j = 0; j < 7; j += 3)
            {
                boolean[] checker = new boolean[9];

                for (int k = 0; k < 3; k++)
                {
                    for (int l = 0; l < 3; l++)
                    {
                        int x = i + k;

                        int y = j + l;

                        if (board[x][y] == 0)
                            return false;
                        checker[board[x][y] - 1] = true;
                    }
                }

                for (int z = 0; z < 9; z++)
                    if (!checker[z])
                        return false;
            }
        }

        // valid solution
        return true;
    }

    public int getValueIn(int row, int col)
    {
        if (row < 0 || row > 8 || col < 0 || col > 8)
            return -1;
        return board[row][col];
    }

    public boolean[] getAllowedValues(int row, int col)
    {
        if (row < 0 || row > 8 || col < 0 || col > 8)
            return null;

        boolean[] validReplacement = new boolean[9];
        Arrays.fill(validReplacement, true);

        for (int i = 0; i < 9; i++)
        {
            if (board[row][i] != 0)
                validReplacement[board[row][i]-1] = false;
            if (board[i][col] != 0)
                validReplacement[board[i][col]-1] = false;
        }

        int startRow;
        if (row < 3)
            startRow = 0;
        else if (row < 6)
            startRow = 3;
        else
            startRow = 6;

        int startColumn;
        if (col < 3)
            startColumn = 0;
        else if (col < 6)
            startColumn = 3;
        else
            startColumn = 6;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                int x = startRow + i;

                int y = startColumn + j;

                if (board[x][y] != 0)
                    validReplacement[board[x][y]-1] = false;
            }
        }

        return validReplacement;
    }

    public boolean isFull()
    {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] == 0)
                    return false;
        return true;
    }


    public void reset()
    {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (!start[i][j])
                    board[i][j] = 0;
    }


    public String toString()
    {
        String output = "";
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
                output += board[i][j] + "  ";
            output += "\n";
        }
        return output;
    }
}
