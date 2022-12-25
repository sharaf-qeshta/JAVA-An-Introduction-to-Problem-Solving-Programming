package chapter_10;

import java.io.File;
import java.io.PrintWriter;

/**
 * 1. Write a program that will write Pericles’ Funeral Oration to a text file.
 * Place each sentence on a separate line as a tabbed paragraph in the file.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_01
{
    private static final String[] LINES =
    {
            "Congratulate yourselves that you",
            "have been happy during the greater part of your days; remember that your life of",
            "sorrow will not last long, and be comforted by the glory of those who are gone."
    };

    private static final String FILE_PATH = "src/chapter_10/PericlesFuneralOration.txt";

    public static void main(String[] args)
    {
        try (PrintWriter writer = new PrintWriter(new File(FILE_PATH)))
        {
            for (String line: LINES)
                writer.write(line + "\n");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
