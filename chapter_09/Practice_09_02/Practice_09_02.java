package chapter_09;

/**
 * 2. A method that returns a special error code can sometimes cause problems.
 * The caller might ignore the error code or treat the error code as a valid return
 * value. In this case it is better to throw an exception instead. The following
 * class maintains an account balance and returns a special error code.
 * public class Account
 * {
 *  private double balance;
 *  public Account()
 *  {
 *  balance = 0;
 *  }
 *  public Account(double initialDeposit)
 *  {
 *  balance = initialDeposit;
 *  }
 *  public double getBalance()
 *  {
 *  return balance;
 *  }
 *  // returns new balance or −1 if error
 *  public double deposit(double amount)
 *  {
 *  if (amount > 0)
 *  balance += amount;
 *  else
 *  return −1; // Code indicating error
 *  return balance;
 *  }
 *  // returns new balance or −1 if invalid amount
 *  public double withdraw(double amount)
 *  {
 *  if ((amount > balance) || (amount < 0))
 *  return −1;
 *  else
 *  balance −= amount;
 *  return balance;
 *  }
 * }
 * Rewrite the class so that it throws appropriate exceptions instead of
 * returning −1 as an error code. Write test code that attempts to withdraw
 * and deposit invalid amounts and catches the exceptions that are
 * thrown.
 *
 * @author Sharaf Qeshta
 * */
public class Practice_09_02
{
    public static void main(String[] args)
    {
        Account account = new Account(10_000);

        // You cannot deposit negative amount!
        try
        {
            account.deposit(-5);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }

        // You cannot withdraw an amount larger than the amount in your account!
        try
        {
            account.withdraw(10_001);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
