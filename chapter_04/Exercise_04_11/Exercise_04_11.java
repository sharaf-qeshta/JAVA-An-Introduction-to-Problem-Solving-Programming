package chapter_04;

/**
 * 11. Suppose we attend a party. To be sociable, we will shake hands with
 * everyone else. Write a fragment of code using a for statement that will
 * compute the total number of handshakes that occur. (Hint: Upon
 * arrival, each person shakes hands with everyone who is already there.
 * Use the loop to find the total number of handshakes as each person
 * arrives.)
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_11
{
    public static void main(String[] args)
    {
        int handShakes = 0;
        int numberOfPeople = 5;
        for (int i = 1; i <= numberOfPeople; i++)
            // everytime we simulating that a new person came
            // everyone came will shake hand with everyone in the party
            handShakes += (i-1);

        // there`s a simpler algorithm to calculate the handshakes
        // which is (numberOfPeople * (numberOfPeople - 1)) / 2

        System.out.println("If there`s " + numberOfPeople + " people then there`s " + handShakes + " handshakes");
    }
}
