package chapter_04;

import java.util.Scanner;

/**
 * 1. Repeat Practice Program 4 of Chapter 3, but use a loop that reads and
 * processes sentences until the user says to end the program.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_04_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            if (sentence.equals("end"))
                break;

            if (sentence.charAt(sentence.length()-1) == '?')
            {
                if (sentence.length() % 2 == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else if (sentence.charAt(sentence.length()-1) == '!')
                System.out.println("Wow");
            else
                System.out.println("\"Well " + sentence + "\"");
        }
    }
}
