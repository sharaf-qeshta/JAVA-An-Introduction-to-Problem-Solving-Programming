package chapter_05;

/**
 * 3. Redo or do Practice Program 8 from Chapter 4, except write a class for the
 * Magic 8 Ball. Write a program that simulates the Magic 8 Ball game. The
 * class should have a method that returns an answer at random. Test your
 * class by outputting the answer several times.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_05_03
{
    public static void main(String[] args)
    {
        Magic8Ball magic8Ball = new Magic8Ball();
        System.out.println(magic8Ball.getAnswer()); // Most likely
        System.out.println(magic8Ball.getAnswer()); // Ask again later
        System.out.println(magic8Ball.getAnswer()); // Most likely
        System.out.println(magic8Ball.getAnswer()); // Reply hazy, try again
        System.out.println(magic8Ball.getAnswer()); // Reply hazy, try again
    }
}
