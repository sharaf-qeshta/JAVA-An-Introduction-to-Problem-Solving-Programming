package chapter_07;

import java.util.Scanner;

/**
 * 8. Traditional password entry schemes are susceptible to “shoulder surfing”
 * in which an attacker watches an unsuspecting user enter his or her
 * password or PIN number and uses it later to gain access to the account.
 * One way to combat this problem is with a randomized challenge-response
 * system. In these systems the user enters different information every time
 * based on a secret in response to a randomly generated challenge. Consider
 * the following scheme in which the password consists of a five-digit PIN
 * number (00000 to 99999). Each digit is assigned a random number that is
 * 1, 2, or 3. The user enters the random numbers that correspond to their
 * PIN instead of their actual PIN numbers.
 * For example, consider an actual PIN number of 12345. To authenticate
 * the user would be presented with a screen such as:
 * PIN: 0 1 2 3 4 5 6 7 8 9
 * NUM: 3 2 3 1 1 3 2 2 1 3
 * The user would enter 23113 instead of 12345. This doesn’t divulge the
 * password even if an attacker intercepts the entry because 23113 could
 * correspond to other PIN numbers, such as 69440 or 70439. The next time
 * the user logs in, a different sequence of random numbers would be
 * generated, such as:
 * PIN: 0 1 2 3 4 5 6 7 8 9
 * NUM: 1 1 2 3 1 2 2 3 3 3
 * Write a program to simulate the authentication process. Store an actual
 * PIN number in your program. The program should use an array to assign
 * random numbers to the digits from 0 to 9. Output the random digits to
 * the screen, input the response from the user, and output whether or not
 * the user’s response correctly matches the PIN number.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_08
{
    /*
    * sample runs (password = 12345) =>
    * PIN: 0 1 2 3 4 5 6 7 8 9
    * Num: 0 3 2 2 0 2 3 0 1 5
    * Enter your password: 32202
    * Access granted
    *
    * PIN: 0 1 2 3 4 5 6 7 8 9
    * Num: 4 2 5 4 5 2 1 1 2 1
    * Enter your password: 42545
    * Access denied
    * */
    public static final int[] PASSWORD = {1, 2, 3, 4, 5};
    public static void main(String[] args)
    {
        int[] array = new int[10];
        for (int i = 0; i < array.length; array[i] = (int) (Math.random() * 9), i++);

        System.out.print("PIN: ");
        for (int i = 0; i < 10; i++)
            System.out.print(i + " ");


        System.out.print("\nNum: ");
        for (int i = 0; i < 10; i++)
            System.out.print(array[i] + " ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your password: ");
        String password = scanner.next();

        String expected = "";
        for (int i = 0; i < PASSWORD.length; i++)
            expected += array[PASSWORD[i]];

        if (expected.equals(password))
            System.out.println("Access granted");
        else
            System.out.println("Access denied");
    }
}
