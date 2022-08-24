package chapter_06;

public class InterestCalculator
{
    private static double principal = 10_000;
    private static double interestRate = 0.07; // 7%

    public static double calculateSimpleInterest(int time)
    {
        return roundToNearestPenny(principal * (1 + interestRate * time));
    }


    public static double computeCompoundInterest(int time)
    {
        return roundToNearestPenny(principal * Math.pow(1 + interestRate, time));
    }


    public static void changePrincipalTo(double newPrincipal)
    {
        principal = newPrincipal;
    }


    public static void changeRateTo(double newRate)
    {
        interestRate = newRate;
    }


    private static double roundToNearestPenny(double amount)
    {
        int integer = (int) amount;
        String fractionalPartString = (amount + "").substring((amount + "").indexOf(".") + 1);
        if (fractionalPartString.length() >= 3)
        {
            int firstThreeDigits = Integer.parseInt(fractionalPartString.substring(0, 3));
            int thirdDigit = firstThreeDigits % 10;
            int twoDigit = firstThreeDigits / 10;
            if (thirdDigit >= 5)
                twoDigit++;
            return Double.parseDouble(integer + "." + twoDigit);

        }
        return amount;
    }
}
