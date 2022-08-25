package chapter_06;

/**
 * 7. We can improve the Beer class from the previous Practice Program by using
 * principles of information hiding. The instance variable percent holds the
 * percent of alcohol in the beer. If this variable is public then someone might
 * enter the alcohol percentage the wrong way. For example, if the alcohol
 * percentage is 5% then someone might set the variable to 5.0 instead of 0.05
 * that the program expects. As a result, the program would compute that
 * someone would be legally intoxicated after a miniscule sip of beer.
 * Address this problem by adding or modifying the mutator method,
 * setAlcohol. If the variable that is being set is over 1 then set the alcohol
 * variable to the incoming value divided by 100. Otherwise set the alcohol
 * variable to the incoming value. You should also do this check for the
 * percentage set by the constructor. Test your program by setting the percent
 * alcohol to 5.0 and to 0.05. The results should be unchanged.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_06_07
{
    public static void main(String[] args)
    {
        Beer beer1 = new Beer("Bud Light", 0.05);
        Beer beer2 = new Beer("Bud Light", 5.0);

        System.out.println(beer1.getAlcohol()); // 0.05
        System.out.println(beer2.getAlcohol()); // 0.05
    }
}
