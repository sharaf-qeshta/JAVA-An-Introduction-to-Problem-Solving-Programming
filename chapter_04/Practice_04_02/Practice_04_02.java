package chapter_04;

/**
 * 2. Write a program that implements your algorithm from Exercise 2
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_04_02
{
    public static void main(String[] args)
    {
        double annualInterestRate = 0.07;
        double x = annualInterestRate/4;
        double equity = 1000; // initial equity
        double changeRate = 0.001; // fixed change rate

        for (int i = 0; i < 4; i++)
        {
            equity += (equity * x) + (equity * changeRate);
            System.out.println("Equity for Q" + (i+1) + " is " + equity);
        }
    }
}
