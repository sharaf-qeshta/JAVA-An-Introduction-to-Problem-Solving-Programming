package chapter_03;

import java.util.Scanner;

/**
 * 13. Imagine a program that displays a menu of five possible choices, lettered a
 * through e. Suppose the user’s selection is read into the character variable
 * choice. Write a switch statement that reacts to this choice by displaying a
 * message that indicates the choice. Display an error message if the user
 * makes an invalid choice.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_13
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
        switch (choice)
        {
            case 'a' : System.out.println("You Choose A"); break;
            case 'b' : System.out.println("You Choose B"); break;
            case 'c' : System.out.println("You Choose C"); break;
            case 'd' : System.out.println("You Choose D"); break;
            case 'e' : System.out.println("You Choose E"); break;
            default:
                System.out.println("Invalid Choice!!");
        }
    }
}
