package chapter_04;


/**
 * 10. Holy digits Batman! The Riddler is planning his next caper somewhere on
 * Pennsylvania Avenue. In his usual sporting fashion, he has left the address
 * in the form of a puzzle. The address on Pennsylvania is a four-digit
 * number where:
 * • All four digits are different
 * • The digit in the thousands place is three times the digit in the tens place
 * • The number is odd
 * • The sum of the digits is 27
 *
 * Write a program that uses a loop (or loops) to find the address where the
 * Riddler plans to strike.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_10
{
    public static void main(String[] args)
    {
        // The number is 9837
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                for (int k = 0; k < 10; k++)
                {
                    for (int l = 0; l < 10; l++)
                    {
                        // All four digits are different
                        if (i == j || i == k || i == l
                            || j == k || j == l || k == l)
                            continue;
                        // The digit in the thousands place is three times the digit in the tens place
                        if (i != 3*k)
                            continue;

                        // The number is odd
                        if (l % 2 == 0)
                            continue;

                        // The sum of the digits is 27
                        if (i+j+k+l != 27)
                            continue;

                        System.out.println("The number is " + i + "" + j + "" + k + "" + l);
                    }
                }
            }
        }
    }
}
