package chapter_05;

import java.util.Scanner;

/**
 * 7. Consider a class BasketballGame that represents the state of a basketball
 * game. Its attributes are
 * • The name of the first team
 * • The name of the second team
 * • The score of the first team
 * • The score of the second team
 * • The status of the game (finished or in progress)
 * BasketballGame has methods to
 * • Record one point scored for a team
 * • Record two points scored for a team
 * • Record three points scored for a team
 * • Change the status of the game to finished
 * • Return the score of a team
 * • Return the name of the team that is currently winning
 * a. Write a method heading for each method.
 * b. Write preconditions and postconditions for each method.
 * c. Write some Java statements that test the class.
 * d. Implement the class.
 * e. List any additional methods and attributes needed in the
 * implementation that were not listed in the original design. List any
 * other changes made to the original design.
 * f. Write a program that uses the class BasketballGame to keep track of the
 * score of a basketball game. Use a loop that reads input each time a
 * basket is scored. (You will need to indicate the scoring team and the
 * number of points scored for each basket: 1, 2, or 3.) After each input is
 * read, display the current score of the game. For example, a portion of
 * the interaction with the program might be as follows:
 *
 *          Enter a score:
 *          a 1
 *          Cats 1, Dogs 0; Cats are winning.
 *          Enter a score:
 *          a 2
 *          Cats 3, Dogs 0; Cats are winning.
 *          Enter a score:
 *          b 2
 *          Cats 3, Dogs 2; Cats are winning.
 *          Enter a score:
 *          b 3
 *          Cats 3, Dogs 5; Dogs are winning.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        BasketballGame game = new BasketballGame("Cats", "Dogs");

        System.out.println("Enter a score: ");
        char team = scanner.next().charAt(0);
        int points = scanner.nextInt();

        while (true)
        {
            game.record(points, team);
            System.out.println(game);
            System.out.println("Enter a score: ");
            team = scanner.next().charAt(0);
            points = scanner.nextInt();
        }
    }
}
