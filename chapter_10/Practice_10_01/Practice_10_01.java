package chapter_10;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 * 1. Write a program that searches a file of numbers and displays the largest
 * number, the smallest number, and the average of all the numbers in the
 * file. Do not assume that the numbers in the file are in any special order.
 * Your program should obtain the file name from the user. Use either a text
 * file or a binary file. For the text-file version, assume one number per line.
 * For the binary-file version, use numbers of type double that are written
 * using writeDouble.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_10_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a binary file name: ");
        String fileName = scanner.nextLine();

        int numbersCount = 0;
        double sum = 0;
        double smallest = 0, largest = 0;
        try (ObjectInputStream inputStream
                     = new ObjectInputStream(new FileInputStream(fileName)))
        {
            double currentNumber = inputStream.readDouble();
            sum = currentNumber;
            smallest = currentNumber; largest = currentNumber;
            numbersCount++;
            while (true)
            {
                currentNumber = inputStream.readDouble();
                if (currentNumber < smallest)
                    smallest = currentNumber;
                else if (currentNumber > largest)
                    largest = currentNumber;
                numbersCount++;
                sum += currentNumber;
            }
        }
        catch (EOFException ignored) {}
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        System.out.println("the largest number in the file is : " + largest);
        System.out.println("the smallest number in the file is : " + smallest);
        System.out.println("the average of the numbers in the file is : " + sum/numbersCount);
    }
}
