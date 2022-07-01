package chapter_04;


import java.util.Scanner;

/**
 * 17. You have an augmented reality game in which you catch Edoc and acquire
 * Edoc candy. You need 12 candies to evolve an Edoc into a Margorp. An
 * evolution earns you back one candy. Each evolution also earns you 500
 * experience points. An Edoc or Margorp can each be transferred for one
 * Edoc candy. In support of the game’s players, write an Edoc calculator
 * program that inputs the number of Edoc you have caught and the
 * number of Edoc candies in your possession. You can assume the initial
 * number of Margorps is 0. The program should output the maximum
 * number of experience points you can earn through transfers and
 * evolutions. After Edocs evolve into Margorps, your program should
 * consider if transferring the Margorps will result in enough candy to
 * evolve even more Edoc.
 * For example, if you start with 71 candies and 53 Edoc, the program could
 * output the following. Note that there are many other sequences of transfers
 * and evolutions, with possibly a different final number of Edoc and
 * Margorp, but the total number of experience points should be the same
 * (the max possible):
 * Transfer 37 Edoc and 0 Margorp resulting in
 *  108 candy, 16 Edoc, and 0 Margorp
 * Evolve 9 Edoc to get 4500 experience points and resulting in
 *  9 candy, 7 Edoc, and 9 Margorp
 * Transfer 0 Edoc and 9 Margorp resulting in
 *  18 candy, 7 Edoc, and 0 Margorp
 * Evolve 1 Edoc to get 500 experience points and resulting in
 *  7 candy, 6 Edoc, and 1 Margorp
 * Transfer 4 Edoc and 1 Margorp resulting in
 *  12 candy, 2 Edoc, and 0 Margorp
 * Evolve 1 Edoc to get 500 experience points and resulting in
 *  1 candy, 1 Edoc, and 1 Margorp
 * Total experience points = 5500
 *
 *
 * @author Sharaf Qeshta
 * */

public class Project_04_17
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of candies: ");
        int candies = scanner.nextInt();

        System.out.print("Enter the number of edocs: ");
        int edocs = scanner.nextInt();

        int margorps = 0, experiencePoint = 0;

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
                System.out.println("Transfer " + convertedEdocs + " Edoc resulting in ");
                System.out.println(candies + " Candy, " + edocs + " Edoc, " + margorps + " Margorp");
            }

            // transfer margorps
            if (margorps >= 1)
            {
                System.out.println("Transfer " + margorps + " Margorps resulting in ");
                candies += margorps;
                margorps = 0;
                System.out.println(candies + " Candy, " + edocs + " Edoc, " + margorps + " Margorp");
            }

            // evolve candies to margorps
            if (candies >= 12)
            {
                int evolutions = candies/12;
                candies = candies % 12 + evolutions;
                experiencePoint += evolutions * 500;
                margorps += evolutions;
                edocs -= evolutions;
                System.out.println("Evolve " + evolutions + " Edocs to " + evolutions * 500
                        + " experience points and resulting in");
                System.out.println(candies + " Candy, " + edocs + " Edoc, " + margorps + " Margorp");
            }
        }

        System.out.println("Total experience points = " + experiencePoint);
    }
}
