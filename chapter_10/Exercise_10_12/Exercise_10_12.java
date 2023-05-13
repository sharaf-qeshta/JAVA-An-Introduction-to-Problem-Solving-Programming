package chapter_10;

import java.io.*;

/**
 * 12. Suppose that you have a binary file that contains numbers whose type is
 * either int or double. You don’t know the order of the numbers in the file,
 * but their order is recorded in a string at the beginning of the file. The
 * string is composed of the letters i (for int) and d (for double) in the order
 * of the types of the subsequent numbers. The string is written using the
 * method writeUTF.
 * For example, the string "iddiiddd" indicates that the file contains eight
 * values, as follows: one integer, followed by two doubles, followed by two
 * integers, followed by three doubles. Read this binary file and create a new
 * text file of the values, written one to a line.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_12
{
    public static final String BINARY_FILE_NAME = "Exercise_10_11.dat";
    public static final String TEXT_FILE_NAME = "Exercise_10_11.txt";
    public static void main(String[] args)
    {
        try (
                ObjectInputStream reader =
                        new ObjectInputStream(new FileInputStream(BINARY_FILE_NAME));
                PrintWriter writer = new PrintWriter(new File(TEXT_FILE_NAME)))
        {
            String order = reader.readUTF();
            for (int i = 0; i < order.length(); i++)
            {
                if (order.charAt(i) == 'i')
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
