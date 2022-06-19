package chapter_03;

import java.util.Scanner;

/**
 * 4. Write a program that reads a one-line sentence as input and then displays
 * the following response: If the sentence ends with a question mark (?) and
 * the input contains an even number of characters, display the word Yes. If
 * the sentence ends with a question mark and the input contains an odd
 * number of characters, display the word No. If the sentence ends with an
 * exclamation point (!), display the word Wow. In all other cases, display the
 * words You always say followed by the input string enclosed in quotes.
 * Your output should all be on one line. Be sure to note that in the last case,
 * your output must include quotation marks around the echoed input string.
 * In all other cases, there are no quotes in the output. Your program does not
 * have to check the input to see that the user has entered a legitimate sentence.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_03_04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

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
