package chapter_04;

import java.util.Scanner;

/**
 * 6. Write a program to read the temperature of a particular location at a
 * particular time of day for each day of a week. Find and display the highest
 * and the lowest values among the temperatures recorded. Also, find the
 * average temperature of the location and display it. For example, if the
 * input is
 * 21 30 25.8 27.3 24 29 22.7
 * the output would be
 * Highest temperature is 30
 * Lowest temperature is 21
 * Average temperature is 26
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_04_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 7 temperatures: ");

        double min = Double.MAX_VALUE, max = Double.MIN_VALUE,
                sum = 0, temperature;

        for (int i = 0; i < 7; i++)
        {
            temperature = scanner.nextDouble();
            sum += temperature;

            if (temperature > max)
                max = temperature;
            if (temperature < min)
                min = temperature;
        }

        System.out.println("Highest temperature is " + max);
        System.out.println("Lowest temperature is " + min);
        System.out.println("Average temperature is " + sum/7.0);
    }
}
