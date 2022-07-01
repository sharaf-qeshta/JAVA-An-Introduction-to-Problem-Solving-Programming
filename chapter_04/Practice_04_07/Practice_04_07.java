package chapter_04;

import java.util.Scanner;

/**
 * 7. Combine the programs from Programming Projects 5 and 6 to read
 * integer exam scores in the range 0 to 100 and to display the following
 * statistics:
 * Total number of scores
 * Total number of each letter grade
 * Percentage of total for each letter grade
 * Range of scores: lowest and highest
 * Average score
 * As before, enter a negative score as a sentinel value to end the data input
 * and display the statistics.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_04_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a score: ");
        double score = scanner.nextDouble();

        double max = score, min = score, sum = 0;
        double total = 0, numberOfAs = 0,
                numberOfBs = 0, numberOfCs = 0,
                numberOfDs = 0, numberOfFs = 0;

        while (score > -1)
        {
            sum += score;
            total++;

            if (score > 90)
                numberOfAs++;
            else if (score > 80)
                numberOfBs++;
            else if (score > 70)
                numberOfCs++;
            else if (score > 60)
                numberOfDs++;
            else
                numberOfFs++;

            if (score > max)
                max = score;
            if (score < min)
                min = score;

            System.out.print("Enter a score: ");
            score = scanner.nextDouble();
        }

        System.out.println("Total Number of scores is " + total);

        System.out.println("Number of Students how get A is " + numberOfAs);
        System.out.println("Number of Students how get B is " + numberOfBs);
        System.out.println("Number of Students how get C is " + numberOfCs);
        System.out.println("Number of Students how get D is " + numberOfDs);
        System.out.println("Number of Students how get F is " + numberOfFs);

        System.out.println("Percentage for Letter A " + numberOfAs/total * 100 + "%");
        System.out.println("Percentage for Letter B " + numberOfBs/total * 100 + "%");
        System.out.println("Percentage for Letter C " + numberOfCs/total * 100 + "%" );
        System.out.println("Percentage for Letter D " + numberOfDs/total * 100 + "%");
        System.out.println("Percentage for Letter F " + numberOfFs/total * 100 + "%");

        System.out.println("Scores range between " + min + " and " + max);

        System.out.println("The average is " + sum/total);

    }
}
