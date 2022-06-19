package chapter_03;

import java.util.Scanner;

/**
 * 1. Write a fragment of code that will test whether a double variable rate
 * contains a valid rate of interest. Valid rates of interest are in the range
 * 5.25% to 7.50%.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Interest Rate: ");
        double interest = scanner.nextDouble();

        if ( interest >= 5.25 && interest <= 7.50 )
            System.out.println("Valid Interest");
        else
            System.out.println("Invalid Interest");
    }
}
