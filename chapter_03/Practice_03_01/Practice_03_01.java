package chapter_03;

import java.util.Scanner;

/**
 * 1. If a number x is multiplied by the number 0, the result is zero. Write a
 * program that tests whether the result is zero if one number is multiplied
 * by 0. Read the number from the keyboard.
 *
 * @author Sharaf Qeshta
 * */
public class Practice_03_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

        System.out.println(integer + " * 0 = " + (integer * 0));
    }
}
