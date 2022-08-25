package chapter_06;

import java.util.Scanner;

/**
 * 4. Do Practice Program 4 from Chapter 5 except define and use a constructor
 * to initialize the Trivia object with a question and answer.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_06_04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Trivia trivia1 = new Trivia("√169 ?", "13");
        Trivia trivia2 = new Trivia("What is the capital of texas ?", "Austin");

        System.out.print(trivia1.getQuestion());
        String trivia1Answer = scanner.nextLine();

        if (trivia1Answer.equals(trivia1.getAnswer()))
            System.out.println("Correct");
        else
            System.out.println("Incorrect the right answer is " + trivia1.getAnswer());

        System.out.print(trivia2.getQuestion());
        String trivia2Answer = scanner.nextLine();

        if (trivia2Answer.equals(trivia2.getAnswer()))
            System.out.println("Correct");
        else
            System.out.println("Incorrect the right answer is " + trivia2.getAnswer());
    }
}
