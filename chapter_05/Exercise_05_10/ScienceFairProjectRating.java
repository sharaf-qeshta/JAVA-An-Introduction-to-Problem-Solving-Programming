package chapter_05;

public class ScienceFairProjectRating
{
    String projectName;
    String projectID;
    String personName;
    RatingScore creativeAbility;
    RatingScore scientificThought;
    RatingScore thoroughness;
    RatingScore technicalSkills;
    RatingScore clarity;

    /**
     * Precondition: there`s no restriction on using this method
     * Postcondition: return number of initialized rating objects
     * which is the number of judges
     */
    public int getNumberOfJudges()
    {
        int judges = 0;
        if (creativeAbility.getRating() != 0)
            judges++;
        if (scientificThought.getRating() != 0)
            judges++;
        if (thoroughness.getRating() != 0)
            judges++;
        if (technicalSkills.getRating() != 0)
            judges++;
        if (clarity.getRating() != 0)
            judges++;
        return judges;
    }

    /**
     * Precondition: all the ratings must be initialized
     * Postcondition: return an array that contains all rating objects
     */
    public RatingScore[] getAllRatings()
    {
        return new RatingScore[] {creativeAbility, scientificThought,
                thoroughness, technicalSkills, clarity};
    }

    /**
     * Precondition: all ratings rate should be initialized
     * Postcondition: return the total number of ratings
     */
    public double getTotalRatings()
    {
        double total = 0;
        if (creativeAbility != null)
            total += creativeAbility.getRating();
        if (scientificThought != null)
            total += scientificThought.getRating();
        if (thoroughness != null)
            total += thoroughness.getRating();
        if (technicalSkills != null)
            total += technicalSkills.getRating();
        if (clarity != null)
            total += clarity.getRating();
        return total;
    }

    /**
     * Precondition: all ratings maxRate should be initialized
     * Postcondition: return the maximum number of total ratings
     */
    public double getTheMaximumTotalRating()
    {
        double total = 0;
        if (creativeAbility != null)
            total += creativeAbility.getMaxRate();
        if (scientificThought != null)
            total += scientificThought.getMaxRate();
        if (thoroughness != null)
            total += thoroughness.getMaxRate();
        if (technicalSkills != null)
            total += technicalSkills.getMaxRate();
        if (clarity != null)
            total += clarity.getMaxRate();
        return total;
    }

    /**
     * Precondition: all the attributes should be initialized including
     * the ratings
     * Postcondition: returns a string describing the project
     */
    public String getProjectDescription()
    {
        return "Project Name: " + projectName + "\n"
                + "Project ID: " + projectID + "\n"
                + "Person Name: " + personName + "\n"
                + "Ratings: \n"
                + "Creative Ability " + creativeAbility.getFormattedRating()
                + "Scientific Thought " + scientificThought.getFormattedRating()
                + "Thoroughness " + thoroughness.getFormattedRating()
                + "Technical Skills " + technicalSkills.getFormattedRating()
                + "Clarity " + clarity.getFormattedRating();
    }

    /**
     * Precondition: you should call it after creating the object
     * Postcondition: create and initialize rating objects an their attributes
     */
    public void createRatings()
    {
        creativeAbility = new RatingScore();
        creativeAbility.maxRate = 30;
        creativeAbility.description = "Creative ability for " + projectName;

        scientificThought = new RatingScore();
        scientificThought.maxRate = 30;
        scientificThought.description = "Scientific Thought for " + projectName;

        thoroughness = new RatingScore();
        thoroughness.maxRate = 15;
        thoroughness.description = "Thoroughness for " + projectName;

        technicalSkills = new RatingScore();
        technicalSkills.maxRate = 15;
        technicalSkills.description = "Technical Skills for " + projectName;

        clarity = new RatingScore();
        clarity.maxRate = 10;
        clarity.description = "Clarity for " + projectName;
    }

}
