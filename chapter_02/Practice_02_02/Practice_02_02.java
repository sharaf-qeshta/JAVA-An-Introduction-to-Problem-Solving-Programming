package chapter_02;

import java.util.Scanner;

/**
 * 2. Write a program that uses Scanner to read two strings from the keyboard.
 * Display each string, along with its length, on two separate lines. Then
 * create a new string by joining the two strings, separated by a blank. Display
 * the new string and its length on a third line.
 *
 * @author Sharaf Qeshta
 * */
public class Practice_02_02
{
    public static void main(String[] args)
    {
        /*
        * Enter the first string: Sharaf
        * Enter the second string: Qeshta
        * Sharaf have length of 6 characters
        * Qeshta have length of 6 characters
        * Sharaf Qeshta have length of 12 characters
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.next();

        System.out.print("Enter the second string: ");
        String string2 = scanner.next();

        System.out.println(string1 + " have length of " + string1.length() + " characters");
        System.out.println(string2 + " have length of " + string2.length() + " characters");
        System.out.println(string1 + " " + string2 + " have length of "
                + (string1.length() + string2.length()) + " characters");
    }
}
