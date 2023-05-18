package chapter_10;


import java.io.*;

import java.util.*;

/**
 * 13. Suppose that we want to store digitized audio information in a binary file.
 * An audio signal typically does not change much from one sample to the
 * next. In this case, less memory is used if we record the change in the data
 * values instead of the actual data values. We will use this idea in the
 * following program.
 * Write a program StoreSignal that will read positive integers, each of
 * which must be within 127 of the previous integer, from the keyboard
 * (or from a text file, if you prefer). Write the first integer to a binary file.
 * For each subsequent integer, compute the difference between it and the
 * integer before it, cast the difference to a byte, and write the result to
 * the binary file. When a negative integer is encountered, stop writing
 * the file.
 *
 * @author Sharaf Qeshta
 */
public class Exercise_10_13
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the binary file name to create: ");
        String name = x.next();
        try
        {
            ObjectOutputStream out_File = new ObjectOutputStream(new FileOutputStream(name));
            System.out.println("Enter the integer data:");
            int n = x.nextInt();
            while (n < 0)
            {
                System.out.println("Please enter a positive value.");
                n = x.nextInt();
            }
            out_File.writeInt(n);
            int Min = Math.max(n - 127, 0);
            int Max = Math.min(n + 127, Integer.MAX_VALUE);
            int nextData = x.nextInt();
            while (nextData >= 0)
            {
                if (nextData >= Min && nextData <= Max)
                {
                    byte difference = (byte) (nextData - n);
                    out_File.writeByte(difference);
                    System.out.println("The difference is " + difference);
                    n = nextData;
                    Min = Math.max(n - 127, 0);
                    Max = Math.min(n + 127, Integer.MAX_VALUE);
                }
                else
                    System.out.println("The data value must be in the range of " + Min + " to " + Max);
                nextData = x.nextInt();
            }
            out_File.close();
        }
        catch (Exception e)
        {
            System.out.println("We had a problem:" + e.getMessage());
        }

    }

}
