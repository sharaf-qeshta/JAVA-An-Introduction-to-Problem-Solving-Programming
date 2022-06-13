package chapter_01;

import java.util.Scanner;

/**
 * 10. Write statements that can be used in a Java program to read two integers and
 * display the number of integers that lie between them, including the integers
 * themselves. For example, four integers are between 3 and 6: 3, 4, 5, and 6.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_01_10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int x = scanner.nextInt(), y = scanner.nextInt();

        int integersCount = y - x + 1;

        System.out.println("Integers count lie between " + x + " and " + y + " is " + integersCount);
    }
}
