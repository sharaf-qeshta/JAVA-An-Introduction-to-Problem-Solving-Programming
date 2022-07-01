package chapter_04;


import java.util.Scanner;

/**
 * 4. Modify Programming Project 5 from Chapter 2 to check the validity of
 * input data. Valid input is no less than 25 cents, no more than 100 cents,
 * and an integer multiple of 5 cents. Compute the change only if a valid
 * price is entered. Otherwise, print separate error messages for any of the
 * following invalid inputs: a price under 25 cents, a price that is not an
 * integer multiple of 5, and a price that is more than a dollar.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of item\n" +
                "(from 25 cents to a dollar, in 5-cent increments):");
        int cents = scanner.nextInt();

        if (cents < 25)
        {
            System.out.println("Enter a value greater than or equal to 25!!");
            System.exit(-1);
        }

        if (cents > 100)
        {
            System.out.println("Enter a value greater than or equal to 100!!");
            System.exit(-1);
        }

        if (cents % 5 != 0)
        {
            System.out.println("Enter a value in five cents increment");
            System.exit(-1);
        }


        int change = 100 - cents;

        int quarters = change / 25;
        change = change % 25;
        int dimes = change / 10;
        change %= 10;

        System.out.println("You bought an item for " + cents + " cents and gave me a dollar,\n" +
                "so your change is");
        System.out.println(quarters + " quarters,");
        System.out.println(dimes + " dimes, and");
        System.out.println(change/5 + " nickel");
    }
}
