package chapter_07;

import java.util.Scanner;

/**
 * 2. Write a program in a class StudentCount that counts the number of
 * students who obtained marks above 50% in a test. Read an integer i from
 * the keyboard and then create an array of double values of size i. Read i
 * values representing the students’ marks from the keyboard and place them
 * into the array. Find the highest and the lowest among these marks. Then
 * count the students who obtained more than 50% given as 500. Display
 * this count and the marks of those students.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_02
{
    public static void main(String[] args)
    {
        /*
        * Enter student count: 5
        * Enter 5 marks: 525 995 789 456 124
        * Students get 50% and above:
        * 1. 52.5%
        * 2. 99.5%
        * 3. 78.9%
        * The number of students who get 50% and above is 3
        * The lowest mark 12.4 %
        * The highest mark 99.5 %
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student count: ");
        int studentsCount = scanner.nextInt();

        System.out.print("Enter " + studentsCount + " marks: ");
        double[] marks = new double[studentsCount];
        double lowest = 1000, highest = 0;
        int above50Count = 0;
        for (int i = 0; i < studentsCount; i++)
        {
            marks[i] = scanner.nextDouble();

            if (marks[i] > highest)
                highest = marks[i];
            if (marks[i] < lowest)
                lowest = marks[i];

            if (marks[i] >= 500)
            {
                if (above50Count == 0)
                    System.out.println("Students get 50% and above: ");
                System.out.println((above50Count+1) + ". " + marks[i]/10 + "%");
                above50Count++;
            }
        }

        System.out.println("The number of students who get 50% and above is " + above50Count);
        System.out.println("The lowest mark " + lowest/10 + " %");
        System.out.println("The highest mark " + highest/10 + " %");
    }
}
