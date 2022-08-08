package chapter_05;

public class Movie
{
    private String movieName;
    private String rating;
    private int rate1Star, rate2Stars, rate3Stars, rate4Stars, rate5Stars;

    public double getAverage()
    {
        int sum = rate1Star + rate2Stars + rate3Stars  + rate4Stars + rate5Stars;
        int weight = rate1Star + rate2Stars * 2 + rate3Stars * 3 + rate4Stars * 4 + rate5Stars * 5;
        return weight / (sum + 0.0);
    }

    public void addRating(int rating)
    {
        if (rating == 1)
            rate1Star++;
        else if (rating == 2)
            rate2Stars++;
        else if (rating == 3)
            rate3Stars++;
        else if (rating == 4)
            rate4Stars++;
        else if (rating == 5)
            rate5Stars++;
    }

    public String getMovieName()
    {
        return movieName;
    }

    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }

    public String getRating()
    {
        return rating;
    }

    public void setRating(String rating)
    {
        this.rating = rating;
    }
}
