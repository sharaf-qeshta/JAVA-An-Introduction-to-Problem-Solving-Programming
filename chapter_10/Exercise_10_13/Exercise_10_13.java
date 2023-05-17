package chapter_10;

import com.sun.javafx.geom.AreaOp;

import java.io.*;

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
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_13
{
    public static final String BINARY_FILE_NAME = "Exercise_10_13.dat";
    public static final String TEXT_FILE_NAME = "Exercise_10_13.txt";

    public static void main(String[] args)
    {
        try (
                ObjectInputStream reader =
                        new ObjectInputStream(new FileInputStream(BINARY_FILE_NAME));
                PrintWriter writer = new PrintWriter(new File(TEXT_FILE_NAME)))
        {
            String order = reader.readUTF();
            for (char x : order.toCharArray())
            {
                if (x == 'i')
                    writer.write(reader.readInt() + "\n");
                else
                    writer.write(reader.readDouble() + "\n");
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
