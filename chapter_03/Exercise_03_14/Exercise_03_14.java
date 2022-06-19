package chapter_03;

import java.util.Scanner;

/**
 * 14. Repeat the previous exercise, but define an enumeration and use it within
 * the switch statement.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_14
{
    public enum choices {A, B, C, D, E};

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a.Choice " + choices.A);
        System.out.println("b.Choice " + choices.B);
        System.out.println("c.Choice " + choices.C);
        System.out.println("d.Choice " + choices.D);
        System.out.println("e.Choice " + choices.E);

        System.out.print("Enter choice: ");
        char choice = scanner.next().toLowerCase().charAt(0);
        switch (choice)
        {
            case 'a' : System.out.println("You Choose " + choices.A); break;
            case 'b' : System.out.println("You Choose " + choices.B); break;
            case 'c' : System.out.println("You Choose " + choices.C); break;
            case 'd' : System.out.println("You Choose " + choices.D); break;
            case 'e' : System.out.println("You Choose " + choices.E); break;
            default:
                System.out.println("Invalid Choice!!");
        }
    }
}
