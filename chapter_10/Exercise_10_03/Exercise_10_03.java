package chapter_10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 3. Write some code that asks the user to enter either of the words append or
 * new. According to the user response, open either an existing text file to
 * which data can be appended or a new, empty text file to which data can be
 * written. In either case, the file’s name is a string given by the variable
 * fileName.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_03
{
    private static final String FILE_NAME = "Exercise_10_03.txt";

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        String data = scanner.nextLine();
        System.out.println("append or new? ");

        if (scanner.nextLine().trim().toLowerCase().equals("append"))
            appendData(data);
        else
            newData(data);
        scanner.close();
    }

    public static void appendData(String data)
    {
        try (PrintWriter writer = new PrintWriter(new File(FILE_NAME)))
        {
            writer.append(data).append("\n");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static void newData(String data)
    {
        try (PrintWriter writer = new PrintWriter(new File(FILE_NAME)))
        {
            writer.write(data + "\n");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
