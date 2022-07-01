package chapter_04;

import java.util.Scanner;

/**
 * 10. Write a program that will compute statistics for eight coin tosses. The user
 * will enter either an h for heads or a t for tails for the eight tosses. The program
 * will then display the total number and percentages of heads and tails. Use
 * the increment operator to count each h and t that is entered. For example, a
 * possible sample dialogue between the program and the user might be
 * For each coin toss enter either h for heads or t for tails.
 * First toss: h
 * Second toss: t
 * Third toss: t
 * Fourth toss: h
 * Fifth toss: t
 * Sixth toss: h
 * Seventh toss: t
 * Eighth toss: t
 * Number of heads: 3
 * Number of tails: 5
 * Percent heads: 37.5
 * Percent tails: 62.5
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For each coin toss enter either h for heads or t for tails.");
        int temp = 0, heads = 0, tails = 0;

        System.out.print("First toss: ");
        temp = (scanner.next().charAt(0) == 'h')? heads++ : tails++;

        System.out.print("Second toss: ");
        temp = (scanner.next().charAt(0) == 'h')? heads++ : tails++;

        System.out.print("Third toss: ");
        temp = (scanner.next().charAt(0) == 'h')? heads++ : tails++;

        System.out.print("Fourth toss: ");
        temp = (scanner.next().charAt(0) == 'h')? heads++ : tails++;

        System.out.print("Fifth toss: ");
        temp = (scanner.next().charAt(0) == 'h')? heads++ : tails++;

        System.out.print("Sixth toss: ");
        temp = (scanner.next().charAt(0) == 'h')? heads++ : tails++;

        System.out.print("Seventh toss: ");
        temp = (scanner.next().charAt(0) == 'h')? heads++ : tails++;

        System.out.print("Eighth toss: ");
        temp = (scanner.next().charAt(0) == 'h')? heads++ : tails++;

        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
        System.out.println("Percent heads: " + (heads/8.0) * 100);
        System.out.println("Percent tails: " + (tails/8.0) * 100);
    }
}
