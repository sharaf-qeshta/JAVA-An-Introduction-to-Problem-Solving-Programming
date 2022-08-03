package chapter_05;

import java.util.Scanner;

public class RatingScore
{
    String description;
    double maxRate;
    private double rating;

    /**
     * Precondition: the user must enter a valid rating
     * Postcondition: set the user rating to rating variable
     */
    public void getRatingFromKeyboard()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rating for " + description + ": ");
        double rate = scanner.nextDouble();

        while (rate > maxRate)
        {
            System.out.print("Enter rating for " + description + ": ");
            rate = scanner.nextDouble();
        }
        rating = rate;
    }

    /**
     * Precondition: the maxRate should be initialized
     * Postcondition: returns the maximum value the user can
     * enter for rating variable if the maxRate initialized otherwise
     * it will return 0
     */
    public double getMaxRate()
    {
        return  maxRate;
    }

    /**
     * Precondition: the rating should be initialized ( getRatingFromKeyboard
     *  should be invoked  )
     * Postcondition: returns rating read from the user
     */
    public double getRating()
    {
        return rating;
    }

    /**
     * Precondition: the description, rating and maxRate should be initialized
     * Postcondition: returns a description of the rating process
     */
    public String getFormattedRating()
    {
        return "the user rate " + description + " " + rating + " from " + maxRate + "\n";
    }
}
