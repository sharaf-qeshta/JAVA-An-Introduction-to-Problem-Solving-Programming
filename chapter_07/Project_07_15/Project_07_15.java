package chapter_07;

import java.util.Scanner;

/**
 * 15. Write a program that manages a list of up to 10 players and their high
 * scores in the computer’s memory. Use two arrays to manage the list. One
 * array should store the player’s name and the other array should store the
 * player’s high score. Use the index of the arrays to correlate the name with
 * the score. In the next Programming Project, we ask you to do the same
 * thing, but using an array of a class. Your program should start with zero
 * players in the list and support the following features:
 * a. Add a new player and score. If it is one of the top 10 scores then add it
 * to the list of scores. The same name and score can appear multiple
 * times. For example, if Bill played 3 times and scored 100,100, and 99,
 * and Bob played once and scored 50, then the top scores would be Bill
 * 100, Bill 100, Bill 99, Bob 50.
 * b. Print the top 10 names and scores to the screen sorted by score (highest
 * at the top).
 * c. Allow the user to enter a player name and output that player’s highest
 * score if it is on the top 10 list or a message if the player’s name has not
 * been input or is not in the top 10.
 * d. Allow the user to enter a player name and remove the highest score for
 * that player from the list.
 * Create a menu system that allows the user to select which option to
 * invoke.
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_15
{
    private static String[] names = new String[10];
    private static int[] scores = new int[10];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        while (true)
            start();
    }

    public static void start()
    {
        printOptions();
        System.out.println("\nEnter a choice: ");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1 : addPlayer(); break;
            case 2 : printTop10(); break;
            case 3 : search(); break;
            case 4 : remove(); break;
            case 5 : System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void printOptions()
    {
        System.out.println("1. Add new player");
        System.out.println("2. Print top 10 players");
        System.out.println("3. Search for a player");
        System.out.println("4. Remove a player");
        System.out.println("5. Exit");
    }

    public static void remove()
    {
        System.out.print("Enter player name: ");
        String playerName = scanner.next();

        int index = -1;
        for (int i = 0; i < 10; i++)
        {
            if (names[i] == null)
                break;

            if (names[i].equals(playerName))
            {
                index = i;
                break;
            }
        }

        if (index == -1)
        {
            System.out.println("the name is not exist");
            return;
        }


        for (int i = index; i < scores.length-1; i++)
        {
            names[i] = names[i+1];
            scores[i] = scores[i+1];
        }

        names[names.length-1] = null;
        scores[scores.length-1] = 0;
    }

    public static void search()
    {
        System.out.print("Enter player name: ");
        String playerName = scanner.next();

        for (int i = 0; i < 10; i++)
        {
            if (names[i] == null)
            {
                System.out.println(playerName + " is not exist");
                break;
            }

            if (names[i].equals(playerName))
            {
                System.out.println(playerName + " highest score : " + scores[i]);
                return;
            }
        }
        System.out.println(playerName + " is not on the top ten");
    }

    public static void printTop10()
    {
        for (int i = 0; i < 10; i++)
        {
            if (names[i] == null)
                break;
            System.out.println(names[i] + " : " + scores[i]);
        }
    }

    public static void addPlayer()
    {
        System.out.print("Enter player name: ");
        String playerName = scanner.next();

        System.out.print("Enter player score: ");
        int score = scanner.nextInt();

        int index = 0;
        for (int i = scores.length-1; i > -1; i--)
        {
            if (score <= scores[i])
            {
                index = i + 1;
                break;
            }
        }


        for (int i = index; i < scores.length-1; i++)
        {
            String indexName = names[i+1];
            int indexScore = scores[i+1];

            names[i+1] = names[index];
            scores[i+1] = scores[index];

            names[index] = indexName;
            scores[index] = indexScore;
        }

        if (index < scores.length)
        {
            names[index] = playerName;
            scores[index] = score;
        }
    }
}
