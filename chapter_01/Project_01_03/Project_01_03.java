package chapter_01;

import java.util.Scanner;

/**
 * 3. Write a complete program for the problem described in Exercise 10.
 *
 * @author Sharaf Qeshta
 * */
public class Project_01_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int x = scanner.nextInt(), y = scanner.nextInt();

        int integersCount = y - x + 1;

        System.out.println("Integers count lie between " + x + " and "
                + y + " is " + integersCount);
    }
}
