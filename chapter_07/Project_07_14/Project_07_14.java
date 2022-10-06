package chapter_07;

import java.util.Scanner;

/**
 * 14. Practice Program 5.4 asked you to define a Trivia class that contained
 * strings representing a trivia question and answer to that question. Add an
 * integer for the number of points that the question is worth if the player gets
 * the question right. Create constructor, accessor, and mutator methods. Use
 * this class in a program that creates an array of 10 Trivia objects. You can
 * select questions, answers, and point values of your choice. Make a loop that
 * asks each trivia question to the player, input an answer, output whether the
 * answer is correct or incorrect (if incorrect also output the correct answer),
 * and after all questions have been asked output the user’s score.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_14
{
    public static void main(String[] args)
    {
        Trivia[] trivia =
                {
                    new Trivia("√169 ?", "13", 1),
                    new Trivia("What is the capital of texas ?", "Austin", 2),
                    new Trivia("the biggest democracy in the world ?", "India", 2),
                    new Trivia("{1, 1, 2, 3, 4, 5, 8, 13} is this series represent fibonacci series ? ",
                            "No", 3),
                    new Trivia("What year did the Berlin wall fall ?", "1989", 3),
                    new Trivia("What is the smallest planet in our solar system ?", "Mercury", 4),
                    new Trivia("What is the human body’s largest organ ?", "Skin", 5),
                    new Trivia("What was the first country to give women the right to vote?", "New Zealand", 5),
                    new Trivia("In what city were the first infections of COVID-19 discovered?", "Wuhan", 5),
                    new Trivia("What is the most commonly spoken language in Brazil? ", "Portuguese", 7)
                };

        Scanner scanner = new Scanner(System.in);
        int scores = 0;
        for (int i = 0; i < trivia.length; i++)
        {
            System.out.print(trivia[i].getQuestion());
            String answer = scanner.nextLine().trim();

            if (answer.equals(trivia[i].getAnswer()))
            {
                System.out.println("Correct!");
                scores += trivia[i].getScores();
            }
            else
            {
                System.out.println("Incorrect!");
                System.out.println("the right answer is " + trivia[i].getAnswer());
            }
        }

        System.out.println("Your final scores are " + scores);
    }
}
