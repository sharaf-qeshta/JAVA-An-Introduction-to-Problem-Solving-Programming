package chapter_01;

import java.util.Scanner;

/**
 * 2. Write a complete program for the problem described in Exercise 9.
 *
 * @author Sharaf Qeshta
 * */
public class Project_01_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();

        System.out.println("Your age is " + (2022 - year) + " the eligible age is " + 18);
    }
}
