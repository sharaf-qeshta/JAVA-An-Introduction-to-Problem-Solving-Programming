package chapter_05;

import java.util.Scanner;

/**
 * 6. Consider a class that could be used to play a game of hangman. The class
 * has the following attributes:
 * • The secret word.
 * • The disguised word, in which each unknown letter in the secret word is
 * replaced with a question mark (?). For example, if the secret word is
 * abracadabra and the letters a, b, and e have been guessed, the disguised
 * word would be ab?a?a?ab?a.
 * • The number of guesses made.
 * • The number of incorrect guesses.
 * It will have the following methods:
 * • makeGuess(c) guesses that character c is in the word.
 * • getDisguisedWord returns a string containing correctly guessed letters
 * in their correct positions and unknown letters replaced with ?.
 * • getSecretWord returns the secret word.
 * • getGuessCount returns the number of guesses made.
 * • isFound returns true if the hidden word has been discovered.
 * a. Write a method heading for each method.
 * b. Write preconditions and postconditions for each method.
 * c. Write some Java statements that test the class.
 * d. Implement the class.
 * e. List any additional methods and attributes needed in the
 * implementation that were not listed in the original design. List any
 * other changes made to the original design.
 * f. Write a program that implements the game of hangman using the class
 * you wrote for Part d.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Hangman hangman = new Hangman("Sharaf");

        while (!hangman.isFound())
        {
            System.out.print("Enter a guess for " + hangman.getDisguisedWord() + ": ");
            char guess = scanner.next().charAt(0);
            hangman.makeGuess(guess);
        }
        System.out.println("The hidden word is " + hangman.getSecretWord());
        System.out.println("You get after " + hangman.getGuessCount() + " guesses!");
    }
}
