package chapter_09;

import java.util.Scanner;

/**
 * 1. Use the exception class MessageTooLongException of Self-Test Question
 * 16 in a program that asks the user to enter a line of text having no more
 * than 20 characters. If the user enters an acceptable number of characters,
 * the program should display the message, “You entered x characters, which
 * is an acceptable length” (with the letter x replaced by the actual number of
 * characters). Otherwise, a MessageTooLongException should be thrown
 * and caught. In either case, the program should repeatedly ask whether the
 * user wants to enter another line or quit the program.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_09_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        while (!quit)
        {
            System.out.print("Enter a phrase: ");
            String phrase = scanner.nextLine();
            try
            {
                testPhrase(phrase);
            }
            catch (MessageTooLongException exception)
            {
                System.out.println(exception.getMessage());
            }

            System.out.print("Do you want to enter a new phrase y/n: ");
            quit = scanner.next().toLowerCase().charAt(0) == 'n';
            scanner.nextLine();
        }
    }

    public static void testPhrase(String phrase) throws MessageTooLongException
    {
        if (phrase.length() <= 20)
            System.out.println("You entered " + phrase.length() + " characters, which is an acceptable length");
        else
            throw new MessageTooLongException();

    }
}
