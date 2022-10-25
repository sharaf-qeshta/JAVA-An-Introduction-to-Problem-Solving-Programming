package chapter_08;

public class CombinedDiscount extends DiscountPolicy
{
    private DiscountPolicy policy1;
    private DiscountPolicy policy2;

    public CombinedDiscount(DiscountPolicy policy1, DiscountPolicy policy2)
    {
        this.policy1 = policy1;
        this.policy2 = policy2;
    }

    @Override
    public double computeDiscount(int count, double itemCost)
    {
        return Math.max(policy1.computeDiscount(count, itemCost),
                policy2.computeDiscount(count, itemCost));
    }
}
