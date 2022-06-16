package chapter_02;

import java.util.Scanner;

/**
 * 5. Repeat the previous project, but read the input in string and display the
 * alternate characters from last.
 *
 * @author Sharaf Qeshta
 * */
public class Practice_02_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of length four: ");
        String x = scanner.next();

        System.out.println(x.charAt(3));
        System.out.println(x.charAt(2));
        System.out.println(x.charAt(1));
        System.out.println(x.charAt(0));
    }
}
