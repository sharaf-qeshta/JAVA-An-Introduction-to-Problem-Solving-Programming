package chapter_04;

/**
 * 4. Write a fragment of code that will compute the product of the first n
 * positive even integers. For example, if n is 6, you should compute 2 × 4 ×
 * 6 × 8 × 10 × 12.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_04
{
    public static void main(String[] args)
    {
        int n = 6, j = 0, product = 1;
        for (int i = 2; j < n; i+=2, j++)
            product *= i;

        System.out.println(product);
    }
}
