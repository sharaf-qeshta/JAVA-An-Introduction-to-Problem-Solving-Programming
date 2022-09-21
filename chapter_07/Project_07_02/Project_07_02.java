package chapter_07;

import java.util.Scanner;

/**
 * 2. A palindrome is a word or phrase that reads the same forward and
 * backward, ignoring blanks and considering uppercase and lowercase
 * versions of the same letter to be equal. For example, the following are
 * palindromes:
 * • warts n straw
 * • radar
 * • Able was I ere I saw Elba
 * • tacocat
 * Write a program that will accept a sequence of characters terminated by a
 * period and will decide whether the string—without the period—is a
 * palindrome. You may assume that the input contains only letters and
 * blanks and is at most 80 characters long. Include a loop that allows the
 * user to check additional strings until she or he requests that the program
 * end. (Hint: Define a static method called isPalindrome that begins as
 * follows.)
 *
 * public static boolean isPalindrome(char[] a, int used)
 * Your program should read the input characters into an array whose base
 * type is char and then call the preceding method. The int variable used
 * keeps track of how much of the array is used, as described in the section
 * entitled “Partially Filled Arrays.”
 *
 *
 * @author Sharaf Qeshta
 */
public class Project_07_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter -1 to exit!");
        System.out.println("Enter a line: ");
        String line = scanner.nextLine();

        while (!line.equals("-1"))
        {
            System.out.println("Palindrome: "
                    + isPalindrome(line.toLowerCase().toCharArray(), line.length()));

            System.out.println("Enter a line: ");
            line = scanner.nextLine();
        }
    }

    /**
     * Precondition: The array a contains letters and blanks in
     * positions a[0] through a[used − 1]. Returns true if the string
     * is a palindrome and false otherwise.
     */
    public static boolean isPalindrome(char[] a, int used)
    {
        int j = used-1;
        for (int i = 0; i < used; i++, j--)
            if (a[i] != a[j])
                return false;
        return true;
    }
}
