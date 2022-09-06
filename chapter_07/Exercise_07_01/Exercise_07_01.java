package chapter_07;

import java.util.Scanner;

/**
 * 1. Write a program in a class EvensOddsAvg that counts the integers that are
 * below the average. Read 15 integers from the keyboard and place them in
 * an array. Compute the sum and count of the evens and the odds separately.
 * Find the average of the integers, and count and display the integers that
 * are below average.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 15 integers: ");
        int[] integers = new int[15];

        int evenSum = 0, evenCount = 0;
        int oddSum = 0, oddCount = 0;
        for (int i = 0; i < 15; i++)
        {
            integers[i] = scanner.nextInt();

            if (integers[i] % 2 == 0)
            {
                evenCount++;
                evenSum += integers[i];
            }
            else
            {
                oddCount++;
                oddSum += integers[i];
            }
        }

        double average = (oddSum + 0.0 + evenSum) / (oddCount + evenCount);
        int belowAverageCount = 0;
        System.out.println("Below Average : ");
        for (int i = 0; i < 15; i++)
        {
            if (integers[i] < average)
            {
                System.out.print(integers[i] + " ");
                belowAverageCount++;
            }
        }

        System.out.println("\nnumber of integers below average in the array is " + belowAverageCount);
    }
}
