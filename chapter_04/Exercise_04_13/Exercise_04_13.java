package chapter_04;

import java.util.Scanner;

/**
 * 13. Write a fragment of code that computes the final score of a bowling game.
 * Use a loop to read the number of pins toppled by three players during five
 * turns each. Display the final score afterward.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_13
{
    public static void main(String[] args)
    {
        int player1Scores = 0, player2Scores = 0, player3Scores = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 4; i++)
        {
            int playerScores = 0;
            for (int j = 1; j < 5; j++)
            {
                System.out.println("Enter the number of pins toppled by player "
                        + i + " at round " + j + ": ");
                playerScores += scanner.nextInt();
            }

            if (i == 1)
                player1Scores = playerScores;
            else if (i == 2)
                player2Scores = playerScores;
            else
                player3Scores = playerScores;
        }

        System.out.println("Player 1 scores " + player1Scores);
        System.out.println("Player 2 scores " + player2Scores);
        System.out.println("Player 3 scores " + player3Scores);
    }
}
