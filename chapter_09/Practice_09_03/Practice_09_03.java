package chapter_09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 3. The following snippet of code inputs a double and outputs it:
 *  double num=0.0;
 *  Scanner kbd = new Scanner(System.in);
 *  num = kbd.nextDouble();
 *  System.out.println(num);
 * Run this program but enter text instead of a double. The program should
 * crash and tell you what kind of exception was thrown by the nextDouble
 * method. Wrap this code inside a try-catch block where you catch the
 * exception that is thrown.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_09_03
{
    public static void main(String[] args)
    {
        double num = 0.0;
        Scanner kbd = new Scanner(System.in);

        try
        {
            num = kbd.nextDouble();
        }
        catch (InputMismatchException exception)
        {
            System.out.println("Invalid Input");
        }

        System.out.println(num);
    }
}
