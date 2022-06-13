package chapter_01;

import java.util.Scanner;

/**
 * 8. Write statements that can be used in a Java program to read two numbers,
 * as entered at the keyboard, and display their difference on the screen.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_01_08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(), y = scanner.nextInt();

        System.out.println(x  + " - " + y + " = " + (x - y));
    }
}
