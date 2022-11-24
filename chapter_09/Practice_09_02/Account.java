package chapter_09;

public class Account
{
    private double balance;

    public Account()
    {
        balance = 0;
    }

    public Account(double initialDeposit)
    {
        balance = initialDeposit;
    }

    public double getBalance()
    {
        return balance;
    }


    public double deposit(double amount) throws Exception
    {
        if (amount > 0)
            balance += amount;
        else
            throw new Exception("You cannot deposit negative amount!");
        return balance;
    }


    public double withdraw(double amount) throws Exception
    {
        if ((amount > balance) || (amount < 0))
            throw new Exception("You cannot withdraw an amount larger than the amount in your account!");
        else
            balance -= amount;
        return balance;
    }
}
