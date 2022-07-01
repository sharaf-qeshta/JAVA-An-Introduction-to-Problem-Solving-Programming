package chapter_04;


import java.util.Scanner;

/**
 * 3. Write a program that reads a bank account balance and an interest rate
 * and displays the value of the account in ten years. The output should show
 * the value of the account for three different methods of compounding
 * interest: annually, monthly, and daily. When compounded annually, the
 * interest is added once per year at the end of the year. When compounded
 * monthly, the interest is added 12 times per year. When computed daily,
 * the interest is added 365 times per year. You do not have to worry about
 * leap years; assume that all years have 365 days. For annual interest, you
 * can assume that the interest is posted exactly one year from the date of
 * deposit. In other words, you do not have to worry about interest being
 * posted on a specific day of the year, such as December 31. Similarly, you
 * can assume that monthly interest is posted exactly one month after it is
 * deposited. Since the account earns interest on the interest, it should have
 * a higher balance when interest is posted more frequently. Be sure to adjust
 * the interest rate for the time period of the interest. If the rate is 5 percent,
 * you use 5/12 percent when posting monthly interest and 5/365 percent
 * when posting daily interest. Perform this calculation using a loop that
 * adds in the interest for each time period, that is, do not use some sort of
 * algebraic formula. Your program should have an outer loop that allows
 * the user to repeat this calculation for a new balance and interest rate. The
 * calculation is repeated until the user asks to end the program.
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_03
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


        while (balance > -1 && interestRate > -1)
        {
            double accountDailyInterestValue = balance, accountMonthlyInterestValue = balance
                    , accountAnnualInterestValue = balance;
            double dailyInterest = interestRate/365, monthlyInterest = interestRate/12;

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

            System.out.println("The account value if we use the annual interest after "
                    + TIME + " years will be " + accountAnnualInterestValue);
            System.out.println("The account value if we use the monthly interest after "
                    + TIME + " years will be " + accountMonthlyInterestValue);
            System.out.println("The account value if we use the daily interest after "
                    + TIME + " years will be " + accountDailyInterestValue);

            System.out.println();

            System.out.print("Enter balance: ");
            balance = scanner.nextDouble();

            System.out.print("Enter interest rate: ");
            interestRate = scanner.nextDouble();
        }
    }
}
