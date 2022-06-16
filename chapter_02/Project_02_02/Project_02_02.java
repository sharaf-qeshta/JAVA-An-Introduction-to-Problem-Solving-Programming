package chapter_02;

import java.util.Scanner;

/**
 * 2. Write a program that reads a line of text and then displays the line, but
 * with the first occurrence of hate changed to love. For example, a possible
 * sample dialogue might be
 * Enter a line of text.
 * I hate you.
 * I have rephrased that line to read:
 * I love you.
 * You can assume that the word hate occurs in the input. If the word hate occurs
 * more than once in the line, your program will replace only its first occurrence
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text.");
        String line = scanner.nextLine();

        System.out.println("I have rephrased that line to read:");
        System.out.println(line.replaceFirst("hate", "love"));
    }
}
