package chapter_02;


import java.util.Scanner;

/**
 * 5. What changes to the ChangeMaker program in Listing 2.3 are necessary if it
 * also accepts coins for one dollar and half a dollar?
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_05
{
    public static void main(String[] args) {
        int amount, originalAmount,
                dollars, halves, quarters, dimes, nickels, pennies; // here

        System.out.println("Enter a whole number from 1 to 99.");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change.");
        Scanner keyboard = new Scanner(System.in);
        amount = keyboard.nextInt();
        originalAmount = amount;
        // here
        dollars = amount / 100;
        amount = amount % 100;
        halves = amount / 50;
        amount = amount % 50;

        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;
        System.out.println(originalAmount +
                " cents in coins can be given as:");

        // here
        System.out.println(dollars + " dollars");
        System.out.println(halves + " halves");

        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels and");
        System.out.println(pennies + " pennies");
    }
}
