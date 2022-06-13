package chapter_01;

import java.util.Scanner;

/**
 * 1. Obtain a copy of the Java program shown in Listing 1.1 from the Web at
 * the location given in the preface. Name the file FirstProgram.java.
 * Compile the program so that you receive no compiler error messages.
 * Then run the program.
 *
 * @author Sharaf Qeshta
 * */

public class Practice_01_01
{
    public static void main(String[] args)
    {
        System.out.println("Hello out there.");
        System.out.println("I will add two numbers for you.");
        System.out.println("Enter two whole numbers on a line:");

        int n1, n2;

        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        System.out.println("The sum of those two numbers is");
        System.out.println(n1 + n2);
    }
}
