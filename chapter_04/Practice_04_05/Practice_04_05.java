package chapter_04;

import java.util.Scanner;

/**
 * 5. Write a program to read a list of nonnegative integers and to display the
 * largest integer, the smallest integer, and the average of all the integers. The
 * user indicates the end of the input by entering a negative sentinel value
 * that is not used in finding the largest, smallest, and average values. The
 * average should be a value of type double so that it is computed with a
 * fractional part.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_04_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int integer = scanner.nextInt();

        int min = integer, max = integer, sum = 0;

        double count = 0;
        while (integer >= 0)
        {
            count++;
            sum += integer;

            if (integer > max)
                max = integer;
            if (integer < min)
                min = integer;
            System.out.print("Enter a nonnegative integer: ");
            integer = scanner.nextInt();
        }

        System.out.println("The minimum number in the list is " + min);
        System.out.println("The maximum number in the list is " + max);
        System.out.println("The average " + sum/count);
    }
}
