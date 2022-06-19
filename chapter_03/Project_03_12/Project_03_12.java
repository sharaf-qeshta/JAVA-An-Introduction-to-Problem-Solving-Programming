package chapter_03;

import java.util.Scanner;

/**
 * 12. Write a program that inputs two strings that represents a time of day using
 * the format HH:MM:SS AM or PM and then outputs the time elapsed from
 * the first to the second time in minutes and seconds.
 * For example, given the strings:
 * 11:58:10 PM
 * 12:02:15 AM
 * The program should output that the time elapsed is 4 minutes and 5 seconds.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first time ( HH:MM:SS AM or PM ): ");
        String time1 = scanner.nextLine();

        System.out.print("Enter the second time ( HH:MM:SS AM or PM ): ");
        String time2 = scanner.nextLine();

        int time1Hours = Integer.parseInt(time1.substring(0, time1.indexOf(":")));
        int time1Minutes = Integer.parseInt(time1.substring(time1.indexOf(":")+1, time1.lastIndexOf(":")));
        int time1Seconds = Integer.parseInt(time1.substring(time1.lastIndexOf(":")+1, time1.lastIndexOf(" ")));

        int time2Hours = Integer.parseInt(time2.substring(0, time2.indexOf(":")));
        int time2Minutes = Integer.parseInt(time2.substring(time2.indexOf(":")+1, time2.lastIndexOf(":")));
        int time2Seconds = Integer.parseInt(time2.substring(time2.lastIndexOf(":")+1, time2.lastIndexOf(" ")));

        if (time1.contains("AM"))
            time1Hours = (time1Hours == 12)? 0 : time1Hours;
        else
            time1Hours += 12;

        if (time2.contains("AM"))
            time2Hours = (time2Hours == 12)? 0 : time2Hours;
        else
            time2Hours += 12;

        int hoursDifference = 24 - Math.abs(time2Hours - time1Hours);
        int minutesElapsed = (hoursDifference * 60 + time2Minutes) - time1Minutes;
        int secondsElapsed = time2Seconds - time1Seconds;

        System.out.println("time elapsed is " + minutesElapsed
                + " minutes and " + secondsElapsed + " seconds.");
    }
}
