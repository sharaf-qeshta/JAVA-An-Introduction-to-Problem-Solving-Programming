package chapter_04;


/**
 * 8. You have three identical prizes to give away and a pool of ten finalists. The
 * finalists are assigned numbers from 1 to 10. Write a program to randomly
 * select the numbers of three finalists to receive a prize. Make sure not to
 * pick the same number twice. For example, picking finalists 3, 6, 2 would be
 * valid but picking 3, 3, 11 would be invalid because finalist number 3 is
 * listed twice and 11 is not a valid finalist number. Random number
 * generation is discussed in Chapter 6, but for this problem you can insert
 * the following line of code to generate a random number between 1 and 10:
 * int num = (int) (Math.random() * 10) +1;
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_08
{
    public static void main(String[] args)
    {
        int finalist1 = (int) (Math.random() * 10) +1;
        int finalist2 = (int) (Math.random() * 10) +1;
        int finalist3 = (int) (Math.random() * 10) +1;

        while (finalist1 == finalist2
                || finalist2 == finalist3
                || finalist1 == finalist3)
        {
            finalist1 = (int) (Math.random() * 10) +1;
            finalist2 = (int) (Math.random() * 10) +1;
            finalist3 = (int) (Math.random() * 10) +1;
        }

        System.out.println(finalist1 + ", " + finalist2 + ", " + finalist3);
    }
}
