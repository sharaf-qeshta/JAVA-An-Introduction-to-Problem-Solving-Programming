package chapter_06;

/**
 * 12. Create a program that tests the class Android described in the previous
 * exercise.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_06_12
{
    public static void main(String[] args)
    {
        /* Bob1 Bob2 Bob3 Bob5 Bob7 Bob11 Bob13 Bob17 Bob19 Bob23  */
        for (int i = 0; i < 10; i++)
        {
            Android android = new Android();
            System.out.print(android.getName() + " ");
        }
    }
}
