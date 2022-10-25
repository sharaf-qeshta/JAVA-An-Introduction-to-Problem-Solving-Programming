package chapter_08;

public class BulkDiscount extends DiscountPolicy
{
    private double minimum;
    private double percent;

    public BulkDiscount(double minimum, double percent)
    {
        this.minimum = minimum;
        this.percent = percent;
    }

    @Override
    public double computeDiscount(int count, double itemCost)
    {
        double cost = count * itemCost;
        if (cost >= minimum)
            return cost - (cost * percent);
        return cost;
    }
}
