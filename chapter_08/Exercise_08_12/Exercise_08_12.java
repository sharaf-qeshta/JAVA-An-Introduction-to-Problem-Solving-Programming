package chapter_08;

/**
 * 12. Derive a class BuyNItemsGetOneFree from DiscountPolicy, as described
 * in Exercise 10. The class should have a constructor that has a single
 * parameter n. In addition, the class should define the method
 * computeDiscount so that every nth item is free. For example, the following
 * table gives the discount for the purchase of various counts of an item that
 * costs $10, when n is 3:
 * Count    1 2 3  4  5  6  7
 * Discount 0 0 10 10 10 20 20
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_08_12
{
    public static void main(String[] args)
    {
        BuyNItemsGetOneFree discountPolicy = new BuyNItemsGetOneFree(3);
        System.out.println(discountPolicy.computeDiscount(1, 10)); // 10
        System.out.println(discountPolicy.computeDiscount(2, 10)); // 20
        System.out.println(discountPolicy.computeDiscount(3, 10)); // 20
        System.out.println(discountPolicy.computeDiscount(4, 10)); // 30
        System.out.println(discountPolicy.computeDiscount(5, 10)); // 40
        System.out.println(discountPolicy.computeDiscount(6, 10)); // 40
        System.out.println(discountPolicy.computeDiscount(7, 10)); // 50
    }
}
