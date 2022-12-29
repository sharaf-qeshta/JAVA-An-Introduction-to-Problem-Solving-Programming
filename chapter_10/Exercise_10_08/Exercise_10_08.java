package chapter_10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 8. Write a program that reads every line in a text file, removes the first word
 * from each line, and then writes the resulting lines to a new text file.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_08
{
    private static final String FILE_NAME = "Exercise_10_08.txt";

    public static void main(String[] args)
    {
        String content = "";
        try (Scanner reader = new Scanner(new File(FILE_NAME)))
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

        try (PrintWriter writer = new PrintWriter(new File(FILE_NAME)))
        {
            String[] lines = content.split("\n");
            for (String line: lines)
                writer.write(line + "\n");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
