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
}
