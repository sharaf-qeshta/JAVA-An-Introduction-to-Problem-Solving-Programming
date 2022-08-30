package chapter_06;

import java.util.Scanner;

/**
 * 2. Write a new class TruncatedDollarFormat that is the same as the class
 * DollarFormat from Listing 6.14, except that it truncates rather than
 * rounds to obtain two digits after the decimal point. When truncating, all
 * digits after the first two are discarded, so 1.229 becomes 1.22, not 1.23.
 * Repeat Programming Project 3 in Chapter 4 using this new class.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_02
{
    public static final int TIME = 10;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a negative balance or interest rate to quit");
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();


        while (balance >= 0 && interestRate >= 0)
        {
            double accountDailyInterestValue = balance,
                    accountMonthlyInterestValue = balance, accountAnnualInterestValue = balance;
            double dailyInterest = interestRate / 365, monthlyInterest = interestRate / 12;

            // each iteration represent a year
            for (int i = 0; i < TIME; i++)
            {
                // annual interest rate
                accountAnnualInterestValue = accountAnnualInterestValue
                        + accountAnnualInterestValue * interestRate;

                // monthly interest rate
                for (int j = 0; j < 12; j++)
                    accountMonthlyInterestValue = accountMonthlyInterestValue
                            + accountMonthlyInterestValue * monthlyInterest;

                // daily interest rate
                for (int j = 0; j < 365; j++)
                    accountDailyInterestValue = accountDailyInterestValue
                            + accountDailyInterestValue * dailyInterest;
            }

            System.out.print("The account value if we use the annual interest after "
                    + TIME + " years will be ");
            TruncatedDollarFormat.writeln(accountAnnualInterestValue, 2);

            System.out.print("The account value if we use the monthly interest after "
                    + TIME + " years will be ");
            TruncatedDollarFormat.writeln(accountMonthlyInterestValue, 2);

            System.out.print("The account value if we use the daily interest after "
                    + TIME + " years will be " );
            TruncatedDollarFormat.writeln(accountDailyInterestValue, 2);

            System.out.println();

            System.out.print("Enter balance: ");
            balance = scanner.nextDouble();

            System.out.print("Enter interest rate: ");
            interestRate = scanner.nextDouble();
        }
    }
}

