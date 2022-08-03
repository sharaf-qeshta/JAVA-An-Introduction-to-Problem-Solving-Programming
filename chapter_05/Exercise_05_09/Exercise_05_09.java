package chapter_05;

/**
 * 9. Consider a class RatingScore that represents a numeric rating for
 * something such as a movie. Its attributes are
 * • A description of what is being rated
 * • The maximum possible rating
 * • The rating
 * It will have methods to
 * • Get the rating from a user
 * • Return the maximum rating possible
 * • Return the rating
 * • Return a string showing the rating in a format suitable for display
 * a. Write a method heading for each method.
 * b. Write preconditions and postconditions for each method.
 * c. Write some Java statements that test the class.
 * d. Implement the class.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_05_09
{
    public static void main(String[] args)
    {
        RatingScore ratingScore = new RatingScore();
        ratingScore.maxRate = 5;
        ratingScore.description = "Top Gun: Maverick";
        ratingScore.getRatingFromKeyboard();

        /* the user rate Top Gun: Maverick 4.0 from 5.0 */
        System.out.println(ratingScore.getFormattedRating());
    }
}
