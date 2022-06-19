package chapter_03;

import java.util.Scanner;

/**
 * 11. The following flowchart contains a series of questions to determine what
 * kind of haircut to get. Write a program that asks the questions to the user
 * and outputs the recommended haircut based on the user’s input.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Male (M) or Female (F) : ");
        char gender = scanner.next().trim().toUpperCase().charAt(0);

        System.out.print("Superhero (1) or Super villain (2) ? ");
        char answer = scanner.next().trim().charAt(0);

        if (gender == 'M')
        {
            if (answer == '1')
            {
                System.out.print("Steak (1) or Sushi (2) ? ");
                answer = scanner.next().trim().charAt(0);
                if (answer == '1')
                    System.out.println("You should get a flat top");
                else
                    System.out.println("You should get a pompadour");
            }
            else
                System.out.println("You should get a mohawk");
        }
        else
        {
            if (answer == '1')
            {
                System.out.print("Anime (1) or Sitcom (2) ?");
                answer = scanner.next().trim().charAt(0);
                if (answer == '1')
                    System.out.println("You should go with bangs");
                else
                    System.out.println("You should get a bob");
            }
            else
                System.out.println("You should get a mohawk");
        }
    }
}
