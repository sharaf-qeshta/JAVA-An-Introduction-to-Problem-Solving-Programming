package chapter_09;

import java.util.Scanner;

/**
 * 2. Write a program that allows the user to compute the subtracted value after
 * the subtraction of two integer values. The subtraction value of x − y is
 * stored in z. Catch any exception thrown and allow the user to enter new
 * values.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_09_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            try
            {
                System.out.print("Enter x and y: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                System.out.println("z = " + (x - y));
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                scanner.nextLine();
            }
        }
    }
}
