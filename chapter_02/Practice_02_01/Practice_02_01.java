package chapter_02;

import java.util.Scanner;

/**
 * 1. Write a program that reads Principal, Rate and Time from the user. The
 * program then calculates and displays the Simple Interest and the Amount.
 *
 * @author Sharaf Qeshta
 * */
public class Practice_02_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time: ");
        int time = scanner.nextInt();

        double interest = principal * rate * time;
        double amount = principal * (1 + rate * time);

        System.out.println("The Interest: " + interest);
        System.out.println("The Amount: " + amount);
    }
}
