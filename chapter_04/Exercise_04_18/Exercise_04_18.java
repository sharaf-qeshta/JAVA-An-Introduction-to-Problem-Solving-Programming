package chapter_04;


/**
 * 18. What does the following fragment of code display? What do you think the
 * programmer intended the code to do, and how would you fix it?
 * int sum = 0;
 * int num = 30;
 * for (int j = 0; j >= num; j+=2)
 *  sum += j;
 * System.out.println("The sum is " + sum);
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_18
{
    // the programmer want to calculate all the even integers less than or equal to num
    // j >= num (here`s the problem)
    // 0 >= 30 is false hence the loop will not execute
    // to fix it j <= num
}
