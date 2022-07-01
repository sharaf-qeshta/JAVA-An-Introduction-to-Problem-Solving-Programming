package chapter_04;


import java.util.Scanner;

/**
 * 1. Write a program that implements your algorithm from Exercise 3.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_01
{
    public static void main(String[] args)
    {
        // let numberOfGuesses => 3
        // loop numberOfGuesses times
        // every time read a guess from the keyboard guess => userGuess
        // let rightPositions => 0 and sum => 0
        // loop through the characters in the user guess
        // if the character in the user guess match the character secret word at
        // the same position then increment rightPositions by one and add the
        // digit to sum

        Scanner scanner = new Scanner(System.in);
        int numberOfGuesses = 3, rightPositions = 0, sum = 0;
        String secretWord = "53840";

        for (int i = 0; i < numberOfGuesses; i++)
        {
            System.out.print("Enter a five digit word: ");
            String guess = scanner.next();

            for (int j = 0; j < 5; j++)
            {
                if (guess.charAt(j) == secretWord.charAt(j))
                {
                    rightPositions++;
                    sum += Integer.parseInt(guess.charAt(j) + "");
                }
            }

            System.out.println(rightPositions + " and " + sum);
            rightPositions = 0; sum = 0;
        }

    }
}
