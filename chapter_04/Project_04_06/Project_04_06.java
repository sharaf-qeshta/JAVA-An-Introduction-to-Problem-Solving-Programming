package chapter_04;


import java.util.Scanner;

/**
 * 6. Write a program that asks the user to enter the size of a triangle (an integer
 * from 1 to 50). Display the triangle by writing lines of asterisks. The first
 * line will have one asterisk, the next two, and so on, with each line having
 * one more asterisk than the previous line, up to the number entered by the
 * user. On the next line write one fewer asterisk and continue by decreasing
 * the number of asterisks by 1 for each successive line until only one asterisk
 * is displayed. (Hint: Use nested for loops; the outside loop controls the
 * number of lines to write, and the inside loop controls the number of
 * asterisks to display on a line.) For example, if the user enters 3, the output
 * would be
 * *
 * **
 * ***
 * **
 * *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        int lines = n*2;
        for (int i = 1; i < lines; i++)
        {
            int asterisks = (i <= n)? i : lines - i;
            for (int j = 0; j < asterisks; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
