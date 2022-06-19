package chapter_03;

import java.util.Scanner;

/**
 * 3. Suppose you are writing a program that asks the user to give a yes-or-no
 * response. Assume that the program reads the user’s response into the
 * String variable response.
 * a. If response is yes or y, set the boolean variable accept to true;
 * otherwise, set it to false.
 * b. How would you change the code so that it will also accept Yes and Y?
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter response: ");
        String answer = scanner.next();

        // simply by converting the answer ot lowercase we can ensure
        // that our programme will deal with yes, y, YES, Y, Yes, YeS, YEs...
        // in the way that we need
        answer = answer.toLowerCase();
        boolean accept = answer.equals("y") || answer.equals("yes");
        System.out.println(accept);
    }
}
