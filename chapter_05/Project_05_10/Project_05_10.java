package chapter_05;


/**
 * 10. Consider a class Movie that contains information about a movie. The class
 * has the following attributes:
 * • The movie name
 * • The MPAA rating (e.g., G, PG, PG-13, R)
 * • The number of people who have rated this movie as a 1 (Terrible)
 * • The number of people who have rated this movie as a 2 (Bad)
 * • The number of people who have rated this movie as a 3 (OK)
 * • The number of people who have rated this movie as a 4 (Good)
 * • The number of people who have rated this movie as a 5 (Great)
 * Implement the class with accessors and mutators for the movie name and
 * MPAA rating. Write a method addRating that takes an integer as an input
 * parameter. The method should verify that the parameter is a number
 * between 1 and 5, and if so, increment by one the number of people rating
 * the movie that matches the input parameter. For example, if 3 is the input
 * parameter, then the number of people who rated the movie as a 3 should
 * be incremented by one. Write another method, getAverage, that returns
 * the average value for all of the movie ratings.
 * Test the class by writing a main method that creates at least two movie
 * objects, adds at least five ratings for each movie, and outputs the movie
 * name, MPAA rating, and average rating for each movie object.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_10
{
    public static void main(String[] args)
    {
        Movie movie1 = new Movie();
        movie1.setMovieName("the godfather");
        movie1.setRating("NC-17");
        movie1.addRating(1);
        movie1.addRating(2);
        movie1.addRating(3);
        movie1.addRating(4);
        movie1.addRating(5);
        movie1.addRating(5);
        movie1.addRating(5);
        movie1.addRating(5);
        movie1.addRating(5);
        movie1.addRating(5);
        System.out.println(movie1.getAverage()); // 4.0

        Movie movie2 = new Movie();
        movie2.setMovieName("Good Will Hunting");
        movie2.setRating("PG-13");
        movie2.addRating(1);
        movie2.addRating(1);
        movie2.addRating(1);
        movie2.addRating(3);
        movie2.addRating(3);
        movie2.addRating(3);
        System.out.println(movie2.getAverage()); // 2.0
    }
}
