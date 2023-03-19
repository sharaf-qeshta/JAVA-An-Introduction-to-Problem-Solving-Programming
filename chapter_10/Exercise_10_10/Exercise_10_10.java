package chapter_10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 10. Write a program that will make a copy of a text file, line by line. Read the
 * name of the existing file and the name of the new file—the copy—from
 * the keyboard. Use the methods of the class File to test whether the
 * original file exists and can be read. If not, display an error message and
 * abort the program. Similarly, see whether the name of the new file already
 * exists. If so, display a warning message and allow the user to either abort
 * the program, overwrite the existing file, or enter a new name for the file.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the original file: ");
        String originalFile = scanner.next();

        File originalFileObject = new File(originalFile);
        if (!originalFileObject.exists())
        {
            System.out.println("The original file is not exist !");
            System.exit(0);
        }

        System.out.print("Enter the name of the new file: ");
        String newFile = scanner.next();
        File newFileObject = new File(newFile);
        while (newFileObject.exists())
        {
            System.out.println("The new file already exist choose an option: ");
            System.out.println("1- abort the programme");
            System.out.println("2- overwrite the existing file");
            System.out.println("3- enter a new file name");
            int choice = scanner.nextInt();
            if (choice == 1)
                System.exit(0);
            else if (choice == 2)
                break;
            System.out.print("Enter the name of the new file: ");
            newFile = scanner.next();
            newFileObject = new File(newFile);
        }

        String content = "";
        try (Scanner reader = new Scanner(originalFileObject))
        {
            while (reader.hasNext())
                content += reader.nextLine() + "\n";
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        try (PrintWriter writer =  new PrintWriter(newFileObject))
        {
            String[] lines = content.split("\n");
            for (String line : lines)
                writer.write(line + "\n");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
