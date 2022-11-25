package chapter_09;

import java.util.Scanner;

/**
 * 1. Write a program that converts a time from 24-hour notation to 12-hour
 * notation. The following is a sample interaction between the user and the
 * program:
 * Enter time in 24-hour notation:
 * 13:07
 * That is the same as
 * 1:07 PM
 * Again? (y/n)
 * y
 * Enter time in 24-hour notation:
 * 10:15
 * That is the same as
 * 10:15 AM
 * Again? (y/n)
 * y
 * Enter time in 24-hour notation:
 * 10:65
 * There is no such time as 10:65
 * Try Again:
 * Enter time in 24-hour notation:
 * 16:05
 * That is the same as
 * 4:05 PM
 * Again? (y/n)
 * n
 * End of program
 * Define an exception class called TimeFormatException. If the user enters
 * an illegal time, like 10:65, or even gibberish, like 8&*68, your program
 * should throw and handle a TimeFormatException.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_09_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter time in 24-hour notation: ");
            String time = scanner.nextLine();

            try
            {
                String time12 = get12Notation(time);
                System.out.println("That is the same as");
                System.out.println(time12);
            }
            catch (TimeFormatException exception)
            {
                System.out.println(exception.getMessage());
            }

            System.out.println("Again? (y/n)");
            char choice = scanner.nextLine().trim().toLowerCase().charAt(0);
            if (choice == 'n')
                break;
        }
    }

    public static String get12Notation(String time24) throws TimeFormatException
    {
        String time12 = "";
        try
        {
            String[] data = time24.split(":");
            int hours = Integer.parseInt(data[0]);
            int minutes = Integer.parseInt(data[1]);

            if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59)
                throw new TimeFormatException(time24);

            if (hours > 12)
                time12 = (hours % 12) + ":" + data[1] + " PM";
            else if (hours == 12)
                time12 = 12 + ":" + data[1] + "PM";
            else
                time12 = data[0] + ":" + data[1] + " AM";
        }
        catch (Exception exception)
        {
            throw new TimeFormatException(time24);
        }
        return time12;
    }
}
