package chapter_02;

import java.util.Scanner;

/**
 * 3. Write a program that demonstrates the operator ++ by performing the
 * following tasks:
 * • Use Scanner to read an integer value x.
 * • Compute x++ and store the result in y.
 * • Display x and y clearly labeled.
 * • Compute ++x and store the result in z.
 * • Display x and z clearly labeled.
 * Try your program with positive and negative values of x. What can you
 * conclude about pre- and post-increment?
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_03
{
    public static void main(String[] args)
    {
        /*
        * Enter an integer value x: 12
        * X = 13
        * Y = 12
        * X = 14
        * Z = 14
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value x: ");
        int x = scanner.nextInt();

        int y = x++;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        int z = ++x;
        System.out.println("X = " + x);
        System.out.println("Z = " + z);
    }
}
