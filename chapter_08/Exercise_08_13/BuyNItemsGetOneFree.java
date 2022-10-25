package chapter_08;

public class BuyNItemsGetOneFree extends DiscountPolicy
{
    private int n;

    public BuyNItemsGetOneFree(int n)
    {
        this.n = n;
    }

    @Override
    public double computeDiscount(int count, double itemCost)
    {
        double discount = (count/n) * itemCost;
        return count * itemCost - discount;
    }
}
