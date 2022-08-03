package chapter_05;

/**
 * 10. Consider a class ScienceFairProjectRating that will be used to help
 * judge a science fair project. It will use the class RatingScore described in
 * the previous exercise. The attributes for the new class are
 * • The name of the project
 * • A unique identification string for the project
 * • The name of the person
 * • A rating for the creative ability (max. 30)
 * • A rating for the scientific thought (max. 30)
 * • A rating for thoroughness (max. 15)
 * • A rating for technical skills (max. 15)
 * • A rating for clarity (max. 10)
 * It will have methods to
 * • Get the number of judges
 * • Get all the ratings for a particular project
 * • Return the total of the ratings for a particular project
 * • Return the maximum total rating possible
 * • Return a string showing a project’s rating in a format suitable for display
 * a. Write a method heading for each method.
 * b. Write preconditions and postconditions for each method.
 * c. Write some Java statements that test the class.
 * d. Implement the class.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_05_10
{
    public static void main(String[] args)
    {
        ScienceFairProjectRating project = new ScienceFairProjectRating();
        project.projectName = "Earthquake Machine";
        project.projectID = "X45W";
        project.personName = "Nikola Tesla";
        project.createRatings();

        // start rating
        project.creativeAbility.getRatingFromKeyboard();
        project.scientificThought.getRatingFromKeyboard();
        project.thoroughness.getRatingFromKeyboard();
        project.technicalSkills.getRatingFromKeyboard();
        project.clarity.getRatingFromKeyboard();

        System.out.println(project.getNumberOfJudges()); // 5
        System.out.println(project.getTheMaximumTotalRating()); // 100.0
        System.out.println(project.getTotalRatings()); // 50.0

        /*
        * Project Name: Earthquake Machine
        * Project ID: X45W
        * Person Name: Nikola Tesla
        * Ratings:
        * Creative Ability the user rate Creative ability for Earthquake Machine 15.0 from 30.0
        * Scientific Thought the user rate Scientific Thought for Earthquake Machine 15.0 from 30.0
        * Thoroughness the user rate Thoroughness for Earthquake Machine 7.5 from 15.0
        * Technical Skills the user rate Technical Skills for Earthquake Machine 7.5 from 15.0
        * Clarity the user rate Clarity for Earthquake Machine 5.0 from 10.
        *
        * */
        System.out.println(project.getProjectDescription());
    }
}
