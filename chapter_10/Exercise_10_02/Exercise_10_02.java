package chapter_10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 2. Modify the program in the previous exercise so that it reads the name of
 * the file entered by the user from the keyboard.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_02
{
    private static final String[] LINES =
            {
                    "Congratulate yourselves that you",
                    "have been happy during the greater part of your days; remember that your life of",
                    "sorrow will not last long, and be comforted by the glory of those who are gone."
            };


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.next();
        scanner.close();
        try (PrintWriter writer = new PrintWriter(new File(filePath)))
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
