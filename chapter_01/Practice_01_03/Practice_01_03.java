package chapter_01;

import java.util.Scanner;

/**
 * 3. The following program has syntax errors that prevent the program from
 * compiling. Find and fix the errors.
 * import java.util.Scanner;
 * public class SyntaxErrorRev
 * {
 *  public static void main(String[] args)
 *  {
 *      System.out.println("Enter the length and width of rectangle");
 *      System.out.println(-to calculate its area); // this need to be quoted
 *      Scanner keyboard = Scanner(System.in); // you miss the new keyword
 *      int l = keyboard.nextInt();
 *      int w = keyboard.nextInt();
 *      area = l * w; // you don`t declare variable area
 *      System.out.println("The area of the rectangle is " area); // you miss concatenation in here
 *  }
 * }
 *
 * @author Sharaf Qeshta
 * */

public class Practice_01_03
{
    public static void main(String[] args)
    {
        System.out.println("Enter the length and width of rectangle");
        System.out.println("-to calculate its area");
        Scanner keyboard = new Scanner(System.in);
        int l = keyboard.nextInt();
        int w = keyboard.nextInt();
        int area = l * w;
        System.out.println("The area of the rectangle is " + area);
    }
}
