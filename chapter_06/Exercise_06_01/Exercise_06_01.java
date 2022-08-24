package chapter_06;

/**
 * 1. Create a class that will bundle together several static methods for interest
 * calculations. This class should not have a constructor. Its attributes are
 * • principal—as a static double variable that starts at $10000
 * • rate—as a static double variable that starts at 7%
 * Its methods are
 * • calculateSimpleInterest(time)—a static method that returns the
 * amount calculated with the simple interest formula, rounded to the
 * nearest penny.
 * • computeCompoundInterest(time)—a static method that returns the
 * amount calculated with the compound interest formula, rounded to the
 * nearest penny.
 * • changePrincipalTo(newPrincipal)—a static method that changes the
 * value of the principal.
 * • changeRateTo(newRate)—a static method that changes the value of the
 * rate.
 * • roundToNearestPenny(amount)—a private static method that returns
 * the given amount rounded to the nearest penny. For example, if the
 * amount is 1023.659, the method will return 1023.66.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_06_01
{
    public static void main(String[] args)
    {
        System.out.println(InterestCalculator.calculateSimpleInterest(10)); // 17000.0
        System.out.println(InterestCalculator.computeCompoundInterest(10)); // 19671.51
    }
}
