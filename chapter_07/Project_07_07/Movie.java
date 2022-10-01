package chapter_07;

public class Movie
{
    private String movieName;
    private String rating;
    private int[] ratings = new int[5];

    public double getAverage()
    {
        int sum = 0, weight = 0;
        for (int i = 0; i < ratings.length;
             sum += ratings[i], weight += ratings[i] * (i+1), i++);
        return weight / (sum + 0.0);
    }

    public void addRating(int rating)
    {
        if (rating > 0 && rating < 6)
            ratings[rating-1]++;
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
