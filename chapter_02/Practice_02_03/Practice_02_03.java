package chapter_02;

import java.util.Scanner;

/**
 * 3. Write a program that reads the amount of a monthly mortgage payment
 * and the amount still owed—the outstanding balance—and then displays
 * the amount of the payment that goes to interest and the amount that goes
 * to principal (i.e., the amount that goes to reducing the debt). Assume that
 * the annual interest rate is 7.49 percent. Use a named constant for the
 * interest rate. Note that payments are made monthly, so the interest is only
 * one twelfth of the annual interest of 7.49 percent.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_02_03
{
    public static final double INTEREST_RATE = 7.49;
    public static final double MONTHLY_INTEREST_RATE = INTEREST_RATE/12;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly mortgage payment: ");
        double mortgage = scanner.nextDouble();

        System.out.print("Enter the amount still owed: ");
        double owedAmount = scanner.nextDouble();

        double goesToInterest = mortgage * MONTHLY_INTEREST_RATE;
        double goesToPrincipal = mortgage - goesToInterest;

        System.out.println("goes to interest " + goesToInterest + "$");
        System.out.println("goes to principal " + goesToPrincipal + "$");
    }
}
