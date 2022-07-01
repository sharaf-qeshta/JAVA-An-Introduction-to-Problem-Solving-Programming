package chapter_04;

/**
 * 6. Write a for statement to compute the sum 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_06
{
    public static void main(String[] args)
    {
       int n = 100;
       double sum = 0;
       for (int i = n; i > 0; i--)
           sum += 1.0 / i;
       System.out.println("The sum is " + sum);
    }
}
