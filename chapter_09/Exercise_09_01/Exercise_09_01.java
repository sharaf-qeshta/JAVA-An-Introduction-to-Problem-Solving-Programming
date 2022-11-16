package chapter_09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Write a program that allows owners to allot their frequency bands at 92, 93,
 * 94, 95, 96, 97, or 98 Hz. Use an array of appropriate number of strings to
 * store the names for the frequency bands. Write a loop that iterates as long
 * as the array has a free space. Within a try block, allow the user to enter a
 * frequency and a band name. If the frequency band is free, put the name in
 * the array. If the band is not free, throw a FrequencyInUseException. If the
 * frequency band is not valid, throw an InvalidFrequencyException. Use a
 * catch block for each different kind of exception.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_09_01
{
    public static final String[] BAND_NAMES = new String[7];

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int assigns = 0;
        while (assigns < 7)
        {
            System.out.print("Enter band name: ");
            String name = scanner.nextLine();
            System.out.print("Enter frequency: ");
            int frequency = scanner.nextInt();
            scanner.nextLine();

            try
            {
                addBand(frequency, name);
                assigns++;
            }
            catch (InvalidFrequencyException exception)
            {
                System.out.println(exception.getMessage());
            }
            catch (FrequencyInUseException exception)
            {
                System.out.println(exception.getMessage());
            }
        }

        System.out.println(Arrays.toString(BAND_NAMES));
    }

    public static void addBand(int frequency, String name)
            throws FrequencyInUseException, InvalidFrequencyException
    {
        int index = frequency - 92;
        if (index < 0 || index >= BAND_NAMES.length)
            throw new InvalidFrequencyException(frequency);
        if (BAND_NAMES[index] != null)
            throw new FrequencyInUseException(frequency);
        BAND_NAMES[index] = name;
    }
}
