package chapter_04;

import java.util.Scanner;

/**
 * 15. Suppose that we want to compute the geometric mean of a list of positive
 * values. To compute the geometric mean of k values, multiply them all
 * together and then compute the kth root of the value. For example, the
 * geometric mean of 2, 5, and 7 is ³√ 2 * 5 * 7
 *  Use a loop with a sentinel
 * value to allow a user to enter an arbitrary number of values. Compute and
 * display the geometric mean of all the values, excluding the sentinel. (Hint:
 * Math.pow(x, 1.0/k) will compute the kth root of x.)
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_15
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a negative integer to exit!");
        int product = 1;
        int k = 0;
        while (true)
        {
            k++;
            System.out.print("Enter a positive integer k: ");
            int n = scanner.nextInt();
            if (n < 0)
                break;
            product *= n;
        }

        System.out.println(product);

        double geometricMean = Math.pow(product, 1.0/k);
        System.out.println("the geometric mean is " + geometricMean);
    }
}
