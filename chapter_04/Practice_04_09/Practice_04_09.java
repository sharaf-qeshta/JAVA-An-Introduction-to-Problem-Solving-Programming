package chapter_04;

/**
 * 9. What’s the outcome of rolling a loaded die? Let the computer decide.
 * Write a program that generates a random number in the range 0.0 and 1.0
 * (see the previous Practice Program about generating a random number).
 * Use the random number in either a switch or an if statement that outputs
 * the result of rolling a loaded die such that the probability of getting a 1, 2,
 * 3, 4, or 5 is 1/8 and the probability of getting a 6 is 3/8.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_04_09
{
    public static void main(String[] args)
    {
        // it seems that the chance of getting 6 is 3 times
        // more than getting a 1, 2, 3, 4 or 5
        // 3 : 1
        // 1/4 = 0.25
        // so the chance of getting 6 is when the random generated number
        // is less than or equal to 0.75 otherwise it will be
        // 1, 2, 3, 4 or 5

        double randomNumber = Math.random();

        if (randomNumber <= 0.75)
            System.out.println("The dice result is 6");
        else
            System.out.println("the dice will output 1, 2, 3, 4 or 5");
    }
}
