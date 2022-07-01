package chapter_04;


/**
 * 19. What does the following fragment of code display? What do you think the
 * programmer intended the code to do, and how would you fix it?
 * int sum = 0;
 * intproduct = 1;
 * int max = 20;
 * for (int i = 1; i <= max; i++)
 *  sum = sum + i;
 *  product = product * i;
 * System.out.println("The sum is " + sum +
 *  " and the product is " + product);
 *
 *
 *  @author Sharaf Qeshta
 *  */
public class Exercise_04_19
{
    // the programmer want to calculate the product and the sum of all positive
    // integers less than or equal to max

    // there are two problems the first one
    // is intproduct = 1; correction => int product = 1;
    // the second one is we using the i outside the loop
    // loop without curly braces will only take the next statement
    // hence sum = sum + i; (will be executed with the loop)
    // but product = product * i; will not be considered in the loop
    // to fix it for (int i = 1; i <= max; i++) { .... }
}
