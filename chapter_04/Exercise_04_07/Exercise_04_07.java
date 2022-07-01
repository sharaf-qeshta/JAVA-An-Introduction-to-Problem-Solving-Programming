package chapter_04;

/**
 * 7. Repeat the previous question, but use the comma operator and omit the
 * for statement’s body
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_07
{
    public static void main(String[] args)
    {
       int n = 100;
       double sum = 0;
       for (int i = n; i > 0; sum += 1.0/i--);
       System.out.println("The sum is " + sum);
    }
}
