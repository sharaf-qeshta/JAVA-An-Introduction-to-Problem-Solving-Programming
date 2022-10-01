package chapter_07;

/**
 * 7. Repeat Programming Project 10 from Chapter 5 but use an array to store the
 * movie ratings instead of separate variables. All changes should be internal
 * to the class, so the main method to test the class should run identically with
 * either the old Movie class or the new Movie class using arrays.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_07
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
