package chapter_10;

import java.io.*;

/**
 * 15. Even though a binary file is not a text file, it can contain embedded text.
 * To find out if this is the case, write a program that will open a binary file
 * and read it one byte at a time. Display the integer value of each byte as
 * well as the character, if any, that it represents in ASCII.
 * Technical details: To convert a byte to a character, use the following code:
 * char[] charArray = Character.toChars(byteValue);
 * The argument byteValue of the method toChars is an int whose value
 * equals that of the byte read from the file. The character represented by the
 * byte is charArray[0]. Since an integer is four bytes, byteValue can
 * represent four ASCII characters. The method toChars tries to convert each
 * of the four bytes to a character and places them into a char array. We are
 * interested in just the character at index 0. If a byte in the file does not
 * correspond to a character, the method will throw an
 * IllegalArgumentException. If the exception is thrown, display only the
 * byte value and continue on to the next byte.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_15
{
    public static String BINARY_FILE_NAME = "Exercise_10_15.dat";
    public static void main(String[] args)
    {
        // create the binary file
        try (ObjectOutputStream output
                     = new ObjectOutputStream(new FileOutputStream(BINARY_FILE_NAME)))
        {
            for (int i = -127; i < 128; i++)
                output.writeByte(i);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        try (ObjectInputStream input
                     = new ObjectInputStream(new FileInputStream(BINARY_FILE_NAME)))
        {
            while (true)
            {
                byte byteValue = input.readByte();
                try
                {
                    char[] charArray = Character.toChars(byteValue);
                    System.out.println(byteValue + "\t" + charArray[0]);
                }
                catch (IllegalArgumentException exception)
                {
                    System.out.println(byteValue);
                }
            }
        }
        catch (EOFException ignored){ }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
