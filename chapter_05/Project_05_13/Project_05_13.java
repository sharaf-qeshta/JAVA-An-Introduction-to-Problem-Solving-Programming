package chapter_05;

import java.util.Scanner;

/**
 * 13. Do Programming Project 17 from Chapter 4, the Edoc calculator, except
 * write a method that takes the number of candy, Edoc, and Margorp as
 * input parameters and returns the amount of experience that can be earned.
 * Modify your program to give advice to the player using the following rules:
 * • Catching an additional Edoc gives you three Edoc candy.
 * • If you can’t get any experience points with the provided inputs then
 * output “You can’t evolve any Edoc, catch more.”
 * • If catching one or two additional Edoc will give you more experience
 * points compared to evolving right now then output “Catch more Edoc
 * before evolving.”
 * • Otherwise output “You should evolve now.”
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_13
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of candies: ");
        int candies = scanner.nextInt();

        System.out.print("Enter the number of edocs: ");
        int edocs = scanner.nextInt();

        System.out.print("Enter the number of margorps: ");
        int margorps = scanner.nextInt();

        System.out.println(calculate(candies, edocs, margorps) + " EXP");
    }

    public static int calculate(int candies, int edocs, int margorps)
    {
        int experiencePoint = 0;

        while ( (candies >= 12 && edocs >= 1)
                || (edocs + margorps + candies > 12 && edocs - margorps > 0))
        {
            // transfer edocs
            if (edocs > 1)
            {
                int convertedEdocs = 0;
                while ((candies + convertedEdocs++) % 12 != 0
                        && edocs - convertedEdocs > (candies + convertedEdocs) % 12);
                candies += convertedEdocs;
                edocs -= convertedEdocs;
            }

            // transfer margorps
            if (margorps >= 1)
            {
                candies += margorps;
                margorps = 0;
            }

            // evolve candies to margorps
            if (candies >= 12)
            {
                int evolutions = candies/12;
                candies = candies % 12 + evolutions;
                experiencePoint += evolutions * 500;
                margorps += evolutions;
                edocs -= evolutions;
            }
        }

        if (experiencePoint == 0)
            System.out.println("You can’t evolve any Edoc, catch more.");
        else if (candies + 1 == 12 || candies + 2 == 12)
            System.out.println("Catch more Edoc before evolving");
        else
            System.out.println("You should evolve now");
        return experiencePoint;
    }
}
