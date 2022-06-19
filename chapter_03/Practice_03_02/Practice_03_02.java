package chapter_03;

import java.util.Scanner;

/**
 * 2. Write a program to read in three nonnegative integers from the keyboard.
 * Display the integers in increasing order.
 *
 * @author Sharaf Qeshta
 * */
public class Practice_03_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int max, mid, min;

        System.out.print("Enter the first number: ");
        max = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n = scanner.nextInt();
        if (n > max)
        {
            int temp = max;
            max = n;
            mid = temp;
        }
        else
            mid = n;

        System.out.print("Enter the third number: ");
        int n2 = scanner.nextInt();
        if (n2 > max)
        {
            int temp = max;
            max = n2;
            int temp2 = mid;
            mid = temp;
            min = temp2;
        }
        else if (n2 > mid)
        {
            int temp = mid;
            mid = n2;
            min = temp;
        }
        else
            min = n2;

        System.out.println(max + ", " + mid + ", " + min);
    }
}
