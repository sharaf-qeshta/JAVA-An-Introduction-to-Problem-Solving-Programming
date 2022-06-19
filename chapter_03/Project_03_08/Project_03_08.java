package chapter_03;

import java.util.Scanner;

/**
 * 8. Write a program to play the rock-paper-scissor game. Each of two users
 * types in either P, R, or S. The program then announces the winner as
 * well as the basis for determining the winner: paper covers rock, rock
 * breaks scissors, scissors cuts paper, or nobody wins. Your program
 * should allow the users to use lowercase as well as uppercase letters.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Player 1 choice (p, r, s): ");
        char p1Choice = scanner.next().trim().toLowerCase().charAt(0);

        System.out.print("Player 2 choice (p, r, s): ");
        char p2Choice = scanner.next().trim().toLowerCase().charAt(0);

        if (p1Choice - p2Choice == 3)
            System.out.println("player 1 win");
        else if (p2Choice - p1Choice == 3)
            System.out.println("Player 2 win");
        else if (p1Choice < p2Choice)
            System.out.println("player 1 win");
        else if (p2Choice < p1Choice)
            System.out.println("Player 2 win");
        else
            System.out.println("It`s a draw");
    }
}
