package chapter_02;

import java.util.Scanner;

/**
 * 2. Write a program that demonstrates type casting of double values by
 * performing the following tasks:
 * • Use Scanner to read a floating-point value x.
 * • Type cast x to an int value and store the result in y.
 * • Display x and y clearly labeled.
 * • Type cast x to a byte value and store the result in z.
 * • Display x and z clearly labeled.
 * Try your program with positive and negative values of x that range in
 * magnitude from 2e-11 to 2e11. What can you conclude?
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_02
{
    public static void main(String[] args)
    {
        /*
        * Enter a double value x: 56.256
        * X = 56.256
        * Y = 56
        * X = 56.256
        * Z = 56
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value x: ");
        double x = scanner.nextDouble();

        int y = (int) x;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        byte z = (byte) x;
        System.out.println("X = " + x);
        System.out.println("Z = " + z);
    }
}
