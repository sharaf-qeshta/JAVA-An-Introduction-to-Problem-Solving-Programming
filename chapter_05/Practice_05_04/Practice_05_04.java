package chapter_05;

import java.util.Scanner;

/**
 * 4. Define a Trivia class that contains information about a single trivia
 * question. The question and answer should be defined as instance variables
 * of type String. Create accessor and mutator methods. In your main method
 * create two Trivia objects with questions and answers of your choice. Then
 * for each Trivia object have your program ask the question, input an
 * answer, compare the typed answer to the actual answer, and output if the
 * user’s answer was correct or incorrect
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_05_04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Trivia trivia1 = new Trivia();
        trivia1.setQuestion("√169 ?");
        trivia1.setAnswer("13");
        Trivia trivia2 = new Trivia();
        trivia2.setQuestion("What is the capital of texas ?");
        trivia2.setAnswer("Austin");

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
