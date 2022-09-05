package chapter_06;

import java.util.Scanner;

/**
 * 13. Write a program that plays a simplified dice version of blackjack. Instead of
 * selecting from a deck of cards a 14-sided die is rolled to represent a card. The
 * rules of the game for one round, as played against the house, are as follows:
 * a. A roll randomly selects from the values 2–10 or Jack, Queen, King, or
 * Ace. An Ace always has the value of 11. Jack, Queen, and King all have
 * the value of 10. In other words, with equal probability, a roll selects
 * one of 2,3,4,5,6,7,8,9,10,10,10,10,11.
 * b. The human player enters a wager. The wager must be positive and
 * must not exceed the amount of money possessed by the player.
 * c. The player is given two rolls. The house, played by the computer, is
 * given one roll. The player is shown the value of the house’s roll.
 * d. If the total of the rolls is 22 or greater than the player “busts”, loses
 * the wager, and the round is over.
 * e. If the total of the rolls is 21 or less then the player has the option to
 * “hit” or “stand”. If the player opts to “hit” then the player is given
 * another roll. Return to step 4. If the player opts to “stand” then
 * continue to step 6.
 * f. It is now the house’s turn. The house is given an additional roll and the
 * values are summed. If the total is less than 17 then the house must
 * “hit”. If the house has a total of 22 or greater than the house “busts”,
 * the player wins the wager, and the round is over. The house must
 * continue to hit until it either “busts” or has a value between 17 and 21.
 * g. If the house did not “bust” then its value is compared to the player’s
 * total. If the totals are the same then it is a “push” and the player does
 * not win or lose anything. If the house’s total is greater than the
 * player’s, then the player loses the wager. If the player’s total is greater
 * than the house’s, then the player wins the wager.
 * Write a program that repeats a round until the player decides to quit or runs
 * out of money. Start the player with $100. Design your program using classes
 * and methods. Your entire program should not be in a single main method.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_13
{
    /*
    * Enter a wager: 10
    * (Player) your first roll => 10
    * (Player) your second roll => 10
    * (Computer) house roll => 10
    * (Player) hit or stand? stand
    * (Computer) house additional roll => 11
    * You busts (Lose) :<(
    * Your current Money is 90$
    * Do you want to continue yes/no? yes
    *
    * Enter a wager: 10
    * (Player) your first roll => 3
    * (Player) your second roll => 10
    * (Computer) house roll => 3
    * (Player) hit or stand? hit
    * (Player) your roll => 10
    * You busts (Lose) :<(
    * Your current Money is 80$
    * Do you want to continue yes/no? yes
    *
    * Enter a wager: 10
    * (Player) your first roll => 10
    * (Player) your second roll => 2
    * (Computer) house roll => 6
    * (Player) hit or stand? hit
    * (Player) your roll => 4
    * (Player) hit or stand? stand
    * (Computer) house additional roll => 7
    * (Computer) house additional roll => 8
    * You busts (Lose) :<(
    * Your current Money is 70$
    * Do you want to continue yes/no? yes
    *
    * Enter a wager: 10
    * (Player) your first roll => 11
    * (Player) your second roll => 10
    * (Computer) house roll => 10
    * (Player) hit or stand? stand
    * (Computer) house additional roll => 11
    * It`s Push no one wins
    * Your current Money is 70$
    * Do you want to continue yes/no? yes
    *
    * Enter a wager: 10
    * (Player) your first roll => 8
    * (Player) your second roll => 10
    * (Computer) house roll => 6
    * (Player) hit or stand? stand
    * (Computer) house additional roll => 11
    * (Computer) house busts (Lose) :<)
    * Your current Money is 80$
    * Do you want to continue yes/no? no
    * */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int playerMoney = 100;

        while (true)
        {
            while (true)
            {
                int wager = readWager(scanner, playerMoney);

                int roll1 = rollTheDice();
                System.out.println("(Player) your first roll => " + roll1);
                int roll2 = rollTheDice();
                System.out.println("(Player) your second roll => " + roll2);

                int houseRoll = rollTheDice();
                System.out.println("(Computer) house roll => " + houseRoll);

                int rollsSum = roll1 + roll2;
                if (rollsSum >= 22)
                {
                    playerMoney -= wager;
                    System.out.println("You busts (Lose) :<(");
                    break;
                }

                boolean stand = false;
                boolean finish = false;
                while (!stand)
                {
                    if (rollsSum >= 22)
                    {
                        playerMoney -= wager;
                        System.out.println("You busts (Lose) :<(");
                        finish = true;
                        break;
                    }
                    else
                    {
                        int choice = hitOrStand(scanner);
                        if (choice == 1)
                        {
                            int roll3 = rollTheDice();
                            System.out.println("(Player) your roll => " + roll3);
                            rollsSum += roll3;
                        }
                        else
                            stand = true;
                    }
                }

                if (finish)
                    break;
                int houseRoll2 = rollTheDice();
                System.out.println("(Computer) house additional roll => " + houseRoll2);
                int houseRollsSum = houseRoll + houseRoll2;

                boolean hit = true;
                if (houseRollsSum >= 22)
                {
                    System.out.println("(Computer) house busts (Lose) :<)");
                    playerMoney += wager;
                    break;
                }
                else if (houseRollsSum >= 17)
                    hit = false;


                boolean computerBusts = false;
                while (hit)
                {
                    houseRoll2 = rollTheDice();
                    System.out.println("(Computer) house additional roll => " + houseRoll2);
                    houseRollsSum += houseRoll2;

                    if (houseRollsSum >= 22)
                    {
                        System.out.println("(Computer) house busts (Lose) :<)");
                        playerMoney += wager;
                        computerBusts = true;
                        break;
                    }

                    if (houseRollsSum >= 17)
                        hit = false;
                }

                if (computerBusts)
                    break;

                if (houseRollsSum == rollsSum)
                {
                    System.out.println("It`s Push no one wins");
                    break;
                }

                if (houseRollsSum > rollsSum)
                {
                    playerMoney -= wager;
                    System.out.println("You busts (Lose) :<(");
                    break;
                }

                System.out.println("(Computer) house busts (Lose) :<)");
                playerMoney += wager;
                break;
            }

            System.out.println("Your current Money is " + playerMoney + "$");
            System.out.print("Do you want to continue yes/no? ");
            String choice = scanner.next();
            if (choice.toUpperCase().equals("NO"))
                break;
        }
    }


    public static int hitOrStand(Scanner scanner)
    {
        System.out.print("(Player) hit or stand? ");
        String choice = scanner.next();
        if (choice.toUpperCase().equals("HIT"))
            return 1;
        return 2;
    }

    public static int rollTheDice()
    {
        int diceResult = (int) ((Math.random() * 100) % 13) + 2;
        if (diceResult == 12 || diceResult == 13 || diceResult == 14)
            return 10;
        return diceResult;
    }

    public static int readWager(Scanner scanner, int playerMoney)
    {
        System.out.print("Enter a wager: " );
        int wager = scanner.nextInt();
        while (wager < 1 || wager > playerMoney)
        {
            System.out.println("Invalid wager!");
            System.out.print("Enter a wager: " );
            wager = scanner.nextInt();
        }
        return wager;
    }
}
