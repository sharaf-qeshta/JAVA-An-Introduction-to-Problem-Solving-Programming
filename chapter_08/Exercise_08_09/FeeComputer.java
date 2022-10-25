package chapter_08;

public abstract class FeeComputer
{
    protected double hourlyFee;

    public double getFee(double hours)
    {
        return hours * hourlyFee;
    }
}
