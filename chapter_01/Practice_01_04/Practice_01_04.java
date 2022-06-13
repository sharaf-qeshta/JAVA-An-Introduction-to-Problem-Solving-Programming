package chapter_01;

import java.util.Scanner;

/**
 * 4. The following program will compile but it has run-time errors. Find and
 * fix the errors.
 * import java.util.Scanner;
 * public class SemanticErrorRev
 * {
 *  public static void main(String[] args)
 *  {
 *      int subject1, subject2, subject3, subject4;
 *      System.out.println("Enter the marks in four subjects as
 *          whole numbers ");
 *      System.out.println(" so as to compute the sum and the
 *          average of the student ");
 *      Scanner keyboard = new Scanner(System.in);
 *      subject1 = keyboard.nextInt();
 *      subject2 = keyboard.nextInt();
 *      subject3 = keyboard.nextInt();
 *      subject4 = keyboard.nextInt();
 *      int sum = subject1 + subject2 + subject3 + subject4;
 *      System.out.println("The total marks in four subjects are "
 *          + sum);
 *      int avg = subject1 + subject2 + subject3 + subject4; // average calculation is wrong the correction below
 *      System.out.println("The average marks of the student is
 *      " + avg);
 *  }
 * }
 *
 * @author Sharaf Qeshta
 * */

public class Practice_01_04
{
    public static void main(String[] args)
    {
        int subject1, subject2, subject3, subject4;
        System.out.println("Enter the marks in four subjects as whole numbers ");
                System.out.println(" so as to compute the sum and the average of the student ");

                Scanner keyboard = new Scanner(System.in);
        subject1 = keyboard.nextInt();
        subject2 = keyboard.nextInt();
        subject3 = keyboard.nextInt();
        subject4 = keyboard.nextInt();
        int sum = subject1 + subject2 + subject3 + subject4;
        System.out.println("The total marks in four subjects are "
                + sum);
        int avg = sum/4;
        System.out.println("The average marks of the student is " + avg);
    }
}
