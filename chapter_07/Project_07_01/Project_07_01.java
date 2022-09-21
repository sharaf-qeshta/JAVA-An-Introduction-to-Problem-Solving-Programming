package chapter_07;

import java.util.Scanner;

/**
 * 1. Write a program that will read a line of text that ends with a period, which
 * serves as a sentinel value. Display all the letters that occur in the text, one
 * per line and in alphabetical order, along with the number of times each
 * letter occurs in the text. Use an array of base type int of length 26, so that
 * the element at index 0 contains the number of a’s, the element at index 1
 * contains the number of b’s, and so forth. Allow both uppercase and
 * lowercase letters as input, but treat uppercase and lowercase versions of the
 * same letter as being equal. (Hints: Use one of the methods toUpperCase or
 * toLowerCase in the wrapper class Character, described in Chapter 6. You
 * will find it helpful to define a method that takes a character as an argument
 * and returns an int value that is the correct index for that character. For
 * example, the argument 'a' results in 0 as the return value, the argument
 * 'b' gives 1 as the return value, and so on. Note that you can use a type cast,
 * such as (int)letter, to change a char to an int. Of course, this will not
 * get the number you want, but if you subtract (int)'a', you will then get
 * the right index.) Allow the user to repeat this task until the user says she or
 * he is through.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter -1 to exit!");
        System.out.println("Enter a line: ");
        String line = scanner.nextLine();

        while (!line.equals("-1"))
        {
            printInfo(line);
            System.out.println("Enter a line: ");
            line = scanner.nextLine();
        }
    }

    public static void printInfo(String line)
    {
        char[] letters = line.toUpperCase().toCharArray();
        int[] occurrences = new int[26];
        for (char letter: letters)
            if (Character.isLetter(letter))
                occurrences[letter - 65] += 1;

        for (int i = 0; i < occurrences.length; i++)
        {
            char currentChar = (char) (i + 65);
            System.out.println(currentChar + " occurs " + occurrences[i] + " times.");
        }
    }
}
