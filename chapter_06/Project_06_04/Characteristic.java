package chapter_06;

import java.util.Scanner;

public class Characteristic
{
    private String description;
    private int rating;

    public Characteristic(String description)
    {
        this.description = description;
        rating = 0;
    }

    public boolean isValid(int aRating)
    {
        return aRating > 0 && aRating < 11;
    }

    public void setRating(int aRating)
    {
        if (isValid(aRating))
            rating = aRating;
    }

    public void setRating()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rating: ");
        int aRating = scanner.nextInt();
        setRating(aRating);
    }

    public String getDescription()
    {
        return description;
    }

    public int getRating()
    {
        return rating;
    }

    public boolean isMatch(Characteristic otherRating)
    {
        return description.equals(otherRating.getDescription());
    }

    public int getCompatibility(Characteristic otherRating)
    {
        if (isMatch(otherRating))
            return getCompatibilityMeasure(otherRating);
        return 0;
    }

    private int getCompatibilityMeasure(Characteristic otherRating)
    {
        return (int) (1 - Math.pow(rating-otherRating.getRating(), 2)/81);
    }
}
