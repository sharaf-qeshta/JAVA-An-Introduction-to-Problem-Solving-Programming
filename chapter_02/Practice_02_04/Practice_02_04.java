package chapter_02;

import java.util.Scanner;

/**
 * 4. Write a program that reads a four-digit integer, such as 2014, and then
 * displays it, one digit per line in reverse order, like so:
 * 4
 * 1
 * 0
 * 2
 * Your prompt should tell the user to enter a four-digit integer. You can then
 * assume that the user follows directions. (Hint: Use the division and
 * remainder operators.)
 *
 * @author Sharaf Qeshta
 * */
public class Practice_02_04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four digit number: ");
        int n = scanner.nextInt();

        System.out.println(n % 10);
        n /= 10;
        System.out.println(n % 10);
        n /= 10;
        System.out.println(n % 10);
        n /= 10;
        System.out.println(n % 10);
    }
}
