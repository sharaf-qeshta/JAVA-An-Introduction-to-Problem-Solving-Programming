package chapter_09;

import java.util.Scanner;

/**
 * 6. Write code that reads a string from the keyboard and uses it to set the
 * variable myTime of type TimeOfDay from the previous exercise.
 * Use try-catch blocks to guarantee that myTime is set to a valid time.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_09_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TimeOfDay myTime = new TimeOfDay();

        System.out.print("Enter Time in the form of hours:minutes : ");
        String stringTime = scanner.next();

        try
        {
            myTime.setTimeTo(stringTime);
        }
        catch (InvalidTimeException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
