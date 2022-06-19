package chapter_03;

import java.util.Scanner;

/**
 * 1. Repeat Programming Project 5 of Chapter 2, but include input checking.
 * Display the change only if a valid price is entered (no less than 25 cents,
 * no more than 100 cents, and an integer multiple of 5 cents). Otherwise,
 * display separate error messages for any of the following invalid inputs: a
 * cost under 25 cents, a cost that is not an integer multiple of 5, and a cost
 * that is more than a dollar.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of item\n" +
                "(from 25 cents to a dollar, in 5-cent increments):");
        int cents = scanner.nextInt();

        if (cents < 25)
            System.out.println("cost under 25 cents");
        else if (cents % 5 == 0)
            System.out.println("cost is not an integer multiple of 5");
        else if (cents > 100)
            System.out.println("cost is more than a dollar");
        else
        {
            int change = 100 - cents;

            int quarters = change / 25;
            change = change % 25;
            int dimes = change / 10;
            // since we only accept cents in 5-cent increment the
            // rest will be one nickel
            change %= 10;

            System.out.println("You bought an item for " + cents + " cents and gave me a dollar,\n" +
                    "so your change is");
            System.out.println(quarters + " quarters,");
            System.out.println(dimes + " dimes, and");
            System.out.println(change/5 + " nickel");
        }
    }
}
