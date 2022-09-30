package chapter_07;

public class TicTacToe
{
    private char[][] board = new char[3][3];

    private boolean currentPlayer = true; // true => player 1 || false => player 2

    public boolean add(char turn, int row, int column)
    {
        if (row < 0 || row > 2 || column < 0 || column > 2)
        {
            System.out.println("Invalid indices try another cell :-) ");
            return false;
        }

        if (board[row][column] != 'X' && board[row][column] != 'O')
        {
            board[row][column] = turn;
            currentPlayer = !currentPlayer;
            System.out.println("Your choice accepted");
            return true;
        }

        System.out.println("the chosen cell is occupied try another one :-)");
        return false;
    }

    public boolean isFull()
    {
        for (char[] row: board)
            for (char element: row)
                if (element == 0)
                    return false;
        return true;
    }

    public void displayBoard()
    {
        for (char[] row: board)
        {
            for (char element: row)
            {
                if (element == 0)
                    System.out.print("  ");
                else
                    System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    public char turn()
    {
        if (currentPlayer)
            return 'X';
        return 'O';
    }

    public boolean isThereAWinner()
    {
        // check rows
        for (char[] row: board)
        {
            char currentChar = row[0];
            boolean winnerFound = true;
            for (char element: row)
            {
                if (currentChar != element || element == 0)
                {
                    winnerFound = false;
                    break;
                }
            }
            if (winnerFound)
                return true;
        }

        // check columns
        for (int column = 0; column < 3; column++)
        {
            char currentChar = board[0][column];
            boolean winnerFound = true;
            for (int row = 0; row < 3; row++)
            {
                if (currentChar != board[row][column] || board[row][column] == 0)
                {
                    winnerFound = false;
                    break;
                }
            }
            if (winnerFound)
                return true;
        }

        // check diagonals
        char test = board[0][0];
        if (board[1][1] == test && board[2][2] == test && test != 0)
            return true;
        test = board[0][2];
        return board[1][1] == test && board[2][0] == test && test != 0;
    }

    public char winner()
    {
        // check rows
        for (char[] row: board)
        {
            char currentChar = row[0];
            boolean winnerFound = true;
            for (char element: row)
            {
                if (currentChar != element || element == 0)
                {
                    winnerFound = false;
                    break;
                }
            }
            if (winnerFound)
                return currentChar;
        }

        // check columns
        for (int column = 0; column < 3; column++)
        {
            char currentChar = board[0][column];
            boolean winnerFound = true;
            for (int row = 0; row < 3; row++)
            {
                if (currentChar != board[row][column] || board[row][column] == 0)
                {
                    winnerFound = false;
                    break;
                }
            }
            if (winnerFound)
                return currentChar;
        }

        // check diagonals
        char test = board[0][0];
        if (board[1][1] == test && board[2][2] == test && test != 0)
            return test;
        test = board[0][2];
        if (board[1][1] == test && board[2][0] == test && test != 0)
            return test;

        return 0;
    }


    public void reinitialize()
    {
        board = new char[3][3];
        currentPlayer = true;
    }
}
