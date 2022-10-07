package chapter_07;

import java.util.Scanner;

/**
 * 16. Do Programming Project 15 except use a class named Player to store a
 * player’s name and score. Use a single array of type Player. Be sure to
 * include a constructor with this class that sets the name and score.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_16
{
    private static Player[] players = new Player[10];
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
            if (players[i] == null)
                break;

            if (players[i].name.equals(playerName))
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


        for (int i = index; i < players.length-1; i++)
            players[i] = players[i+1];

        players[players.length-1] = null;
    }

    public static void search()
    {
        System.out.print("Enter player name: ");
        String playerName = scanner.next();

        for (int i = 0; i < 10; i++)
        {
            if (players[i] == null)
            {
                System.out.println(playerName + " is not exist");
                break;
            }

            if (players[i].name.equals(playerName))
            {
                System.out.println(playerName + " highest score : " + players[i].score);
                return;
            }
        }
        System.out.println(playerName + " is not on the top ten");
    }

    public static void printTop10()
    {
        for (int i = 0; i < 10; i++)
        {
            if (players[i] == null)
                break;
            System.out.println(players[i].name + " : " + players[i].score);
        }
    }

    public static void addPlayer()
    {
        System.out.print("Enter player name: ");
        String playerName = scanner.next();

        System.out.print("Enter player score: ");
        int score = scanner.nextInt();

        int index = 0;
        for (int i = players.length-1; i > -1; i--)
        {
            if (players[i] == null)
                continue;

            if (score <= players[i].score)
            {
                index = i + 1;
                break;
            }
        }

        for (int i = index; i < players.length-1; i++)
        {
            Player indexPlayer = players[i+1];

            players[i+1] = players[index];

            players[index] = indexPlayer;
        }

        if (index < players.length)
        {
            players[index] = new Player(playerName, score);
        }
    }
}
