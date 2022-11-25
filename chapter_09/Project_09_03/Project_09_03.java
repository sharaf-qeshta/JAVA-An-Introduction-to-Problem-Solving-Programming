package chapter_09;


import java.util.Scanner;

/**
 * 3. Write a program that converts dates from numerical month-day format
 * to alphabetic month-day format. For example, input of 1/31 or 01/31
 * would produce January 31 as output. The dialogue with the user
 * should be similar to that shown in Programming Project 2. You should
 * define two exception classes, one called MonthException and another
 * called DayException. If the user enters anything other than a legal
 * month number (integers from 1 to 12), your program should throw
 * and catch a MonthException. Similarly, if the user enters anything
 * other than a valid day number (integers from 1 to either 29, 30, or 31,
 * depending on the month), your program should throw and catch a
 * DayException. To keep things simple, assume that February always has
 * 28 days.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_09_03
{
    public static final String[] MONTHS = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean done = false;
        while (!done)
        {
            System.out.println("Enter a numeric date");
            String date = scanner.nextLine();

            try
            {
                String convertedDate= convert(date);
                System.out.println(date + " Converted to " + convertedDate);
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }

            System.out.println("Again? (y/n)");
            done = scanner.nextLine().toLowerCase().trim().charAt(0) == 'n';
        }
    }

    public static String convert(String numericDate)
            throws Exception, MonthException, DayException
    {
        try
        {
            String[] data = numericDate.split("/");
            int month = Integer.parseInt(data[0]);
            int day = Integer.parseInt(data[1]);

            if (month < 1 || month > 12)
                throw new MonthException(month);
            if (day < 1 || day > getMonthDays(month))
                throw new DayException(day);
            return MONTHS[month-1] + " " + day;
        }
        catch (Exception exception)
        {
            throw new Exception();
        }
    }

    public static int getMonthDays(int month)
    {
        if (month == 1 || month == 3 || month == 5
                || month == 7 || month == 8 || month == 10
                || month == 12)
            return 31;
        if (month == 2)
            return 29;
        return 30;
    }
}
