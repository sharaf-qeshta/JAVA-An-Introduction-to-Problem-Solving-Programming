package chapter_10;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 9. Repeat the previous exercise, but write the new lines to a new binary file
 * instead of a text file.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_09
{
    private static final String TEXT_FILE_NAME = "Exercise_10_09.txt";
    private static final String BINARY_FILE_NAME = "Exercise_10_09.dat";

    public static void main(String[] args)
    {
        String content = "";
        try (Scanner reader = new Scanner(new File(TEXT_FILE_NAME)))
        {
            while (reader.hasNext())
            {
                String currentLine = reader.nextLine();
                currentLine = currentLine.substring(currentLine.indexOf(" "));
                content += currentLine + "\n";
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        try (RandomAccessFile file = new RandomAccessFile(new File(BINARY_FILE_NAME), "rw"))
        {
            String[] lines = content.split("\n");
            for (String line: lines)
                file.writeUTF(line + "\n");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
