package chapter_03;

import java.util.Scanner;

/**
 * 4. Write a program that reads a string from the keyboard and tests whether it
 * contains a valid date. Display the date and a message that indicates
 * whether it is valid. If it is not valid, also display a message explaining why
 * it is not valid.
 * The input date will have the format mm/dd/yyyy. A valid month value mm
 * must be from 1 to 12 (January is 1). The day value dd must be from 1 to a
 * value that is appropriate for the given month. September, April, June, and
 * November each have 30 days. February has 28 days except for leap years when
 * it has 29. The remaining months all have 31 days each. A leap year is any year
 * that is divisible by 4 but not divisible by 100 unless it is also divisible by 400.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (mm/dd/yyyy) : ");
        String date = scanner.next().trim();

        int year = Integer.parseInt(date.substring(date.lastIndexOf("/")+1));
        int day = Integer.parseInt(date.substring(date.indexOf("/")+1, date.lastIndexOf("/")));
        int month = Integer.parseInt(date.substring(0, date.indexOf("/")));

        if (month < 1 || month > 12)
        {
            System.out.println("Wrong month number " + month);
            System.exit(-1);
        }

        int daysInMonth = 0;
        if (month == 9 || month == 4 || month == 6 || month == 11)
            daysInMonth = 30;
        else if (month == 2) // February
        {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                daysInMonth = 29;
            else
                daysInMonth = 28;
        }
        else
            daysInMonth = 31;

        if (day < 1 || day > daysInMonth)
        {
            System.out.println("Wrong day number " + day);
            System.exit(-1);
        }

        System.out.println(date + " is a valid date");
    }
}
