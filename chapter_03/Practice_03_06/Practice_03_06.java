package chapter_03;

import java.util.Scanner;

/**
 * 6. Write a program that inputs a double value. If the double value is greater
 * than 150.45 or between 60.30 and 70.25 (inclusive), then output YES.
 * Otherwise, output NO. Your program should use an if-else statement
 * along with && (and) and || (or) relational operators.
 * Examples of numbers that would result in an output of YES: 151, 60.5,
 * 65.35, 65, 69, 68, 250
 * Examples of numbers that would result in an output of NO: 49, 76, 100,
 * 80, 10, 135, 0
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_03_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double value = scanner.nextDouble();

        if (value > 150.45 || (value >= 60.30 && value <= 70.25))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
