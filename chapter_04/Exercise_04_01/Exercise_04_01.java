package chapter_04;

import java.util.Scanner;

/**
 * 1. Write a fragment of code that will read words from the keyboard until the
 * word done is entered. For each word except done, report whether its first
 * character is equal to its last character. For the required loop, use a
 * a. while statement
 * b. do-while statement
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();
        while (!word.equals("done"))
        {
            if (word.charAt(0) == word.charAt(word.length()-1))
                System.out.println("the first and the last characters of " + word + " the same");
            else
                System.out.println("the first and the last characters of " + word + " is not the same");
            System.out.print("Enter a word: ");
            word = scanner.next();
        }

        System.out.print("Enter a word: ");
        word = scanner.next();
        do
        {
            if (word.charAt(0) == word.charAt(word.length()-1))
                System.out.println("the first and the last characters of " + word + " the same");
            else
                System.out.println("the first and the last characters of " + word + " is not the same");

            System.out.print("Enter a word: ");
            word = scanner.next();
        }
        while (!word.equals("done"));
    }
}
