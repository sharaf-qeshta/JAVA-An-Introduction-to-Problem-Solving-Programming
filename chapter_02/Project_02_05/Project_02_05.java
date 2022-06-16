package chapter_02;

import java.util.Scanner;

/**
 * 5. Write a program that determines the change to be dispensed from a
 * vending machine. An item in the machine can cost between 25 cents and
 * a dollar, in 5-cent increments (25, 30, 35, … , 90, 95, or 100), and the
 * machine accepts only a single dollar bill to pay for the item. For example,
 * a possible dialogue with the user might be
 * Enter price of item
 * (from 25 cents to a dollar, in 5-cent increments): 45
 * You bought an item for 45 cents and gave me a dollar,
 * so your change is
 * 2 quarters,
 * 0 dimes, and
 * 1 nickel.
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of item\n" +
                "(from 25 cents to a dollar, in 5-cent increments):");
        int cents = scanner.nextInt();
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
