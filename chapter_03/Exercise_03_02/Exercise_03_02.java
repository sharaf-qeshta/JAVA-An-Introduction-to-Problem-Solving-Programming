package chapter_03;

import java.util.Scanner;

/**
 * 2. Write a fragment of code that will check whether the year entered is a leap year
 * or not. If it is not, then display the number of years until the next leap year.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Year " + year + " is a leap year");
        // since the difference between leap years is 4
        // we need to check for the next 3 years
        else
        {
            int i = 0;
            if (!((++year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
                i++;
            if (!((++year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
                i++;
            if (!((++year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
                i++;
            System.out.println("You need to wait " + i + " years to encounter a leap year");
        }
    }
}
