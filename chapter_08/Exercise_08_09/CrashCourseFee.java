package chapter_08;

public class CrashCourseFee extends FeeComputer
{
    @Override
    public double getFee(double hours)
    {
        return hourlyFee * hours + 2000;
    }
}
