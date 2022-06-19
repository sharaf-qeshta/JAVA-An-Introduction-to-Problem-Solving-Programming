package chapter_03;

import java.util.Scanner;

/**
 * 3. Write a program that reads three strings from the keyboard. Although the
 * strings are in no particular order, display the string that would be second
 * if they were arranged lexicographically.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_03_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String max, mid;

        System.out.print("Enter the first string: ");
        max = scanner.next();

        System.out.print("Enter the second string: ");
        String s2 = scanner.next();
        if (s2.compareTo(max) > 0)
        {
            String temp = max;
            max = s2;
            mid = temp;
        }
        else
            mid = s2;

        System.out.print("Enter the third string: ");
        String s3 = scanner.next();
        if (s3.compareTo(max) > 0)
            mid = max;
        else if (s3.compareTo(mid) > 0)
            mid = s3;

        System.out.println(mid);
    }
}
