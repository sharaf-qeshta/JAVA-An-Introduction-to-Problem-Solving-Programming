package chapter_03;

import java.util.Scanner;

/**
 * 15. Repeat Exercise 13, but use a multibranch if-else statement instead of a
 * switch statement.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_15
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a.Choice A");
        System.out.println("b.Choice B");
        System.out.println("c.Choice C");
        System.out.println("d.Choice D");
        System.out.println("e.Choice E");

        System.out.print("Enter choice: ");
        char choice = scanner.next().toLowerCase().charAt(0);

        if (choice == 'a')
            System.out.println("You Choose A");
        else if (choice == 'b')
            System.out.println("You Choose B");
        else if (choice == 'c')
            System.out.println("You Choose C");
        else if (choice == 'd')
            System.out.println("You Choose A");
        else if (choice == 'e')
            System.out.println("You Choose E");
        else
            System.out.println("Invalid Choice");
    }
}
