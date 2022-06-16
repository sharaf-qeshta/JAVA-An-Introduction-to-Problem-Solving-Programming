package chapter_02;

import java.util.Scanner;

/**
 * 1. Write a program that demonstrates the approximate nature of double
 * values by performing the following tasks:
 * • Use Scanner to read a double value x.
 * • Compute 5.0 * x and store the result in y.
 * • Display x, y, and the sum of x and y.
 * • Divide 5.0 from x and store the result in z. Display the value of z.
 * Try your program with values of x that range from 2e-11 to 2e11.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_01
{
    public static void main(String[] args)
    {
        /*
        * Enter a double value x: 2e11
        * X = 2.0E11
        * Y = 1.0E12
        * X + Y = 1.2E12
        * Z = 4.0E10
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value x: ");
        double x = scanner.nextDouble();

        double y = x * 5.0;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("X + Y = " + (x + y));

        double z = x/5.0;
        System.out.println("Z = " + z);
    }
}
