package chapter_03;


/**
 * 16. Given that the int variable temp contains a temperature that is not
 * negative, write a Java statement that uses the conditional operator to set
 * the String variable label to either "degree" or "degrees". We want to
 * use label to produce grammatically correct output, such as 0 degrees, 1
 * degree, 2 degrees, and so on. If you have not studied the conditional
 * operator, use an if-else statement instead.
 *
 * @author Sharaf Qeshta
 */
public class Exercise_03_16
{
    public static void main(String[] args)
    {
        int temp = 1;
        String formattedTemp = temp + " degree" + ((temp == 1) ? "" : "s");
        System.out.println(formattedTemp);
    }
}
