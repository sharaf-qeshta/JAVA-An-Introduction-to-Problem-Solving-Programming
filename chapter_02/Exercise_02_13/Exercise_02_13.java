package chapter_02;


import java.util.Scanner;

/**
 * 13. Repeat the previous exercise, but remove the statement keyboard
 * .useDelimiter("m"). Enter 'Dream' as the first string and 'Think
 * Imagine' as the second string.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_13
{
    public static void main(String[] args)
    {
        /*
        * Enter a string.
        * 'Dream'
        * 'Think Imagine'
        * String1 is 'Dream'
        * String2 is 'Think
        * */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string.");
        String string1 = keyboard.next();
        String string2 = keyboard.next();
        System.out.println("String1 is " + string1);
        System.out.println("String2 is " + string2);
    }
}
