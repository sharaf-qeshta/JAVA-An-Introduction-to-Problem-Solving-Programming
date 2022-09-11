package chapter_07;

/**
 * 11. Suppose we are selling bouquets of flowers for an event. We have six kinds
 * of flowers to sell: white rose, red rose, daisy, tulip, lily, and jasmine. We will
 * record a customer’s order as an array of six integers, representing the number
 * of bouquets of each kind of flower. Write a static method firstOrder that
 * takes a combined order and the second order and returns an array that
 * represents the first order. For example, if combinedOrder contains 10, 12,
 * 15, 20, 25, and 23, and secondOrder contains 8, 10, 5, 9, 13, and 15, then
 * the method should return an array containing 2, 2, 10, 11, 12, and 8.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_11
{
    public static void main(String[] args)
    {
        int[] combinedOrder = {10, 12, 15, 20, 25, 23};
        int[] secondOrder = {8, 10, 5, 9, 13, 15};
        int[] firstOrder = firstOrder(combinedOrder, secondOrder);

        /*
        * 2 2 10 11 12 8
        * */
        for (int i = 0; i < firstOrder.length; i++)
            System.out.print(firstOrder[i] + " ");
    }

    public static int[] firstOrder(int[] combinedOrder, int[] secondOrder)
    {
        int[] firstOrder = new int[combinedOrder.length];
        for (int i = 0; i < combinedOrder.length; i++)
            firstOrder[i] = combinedOrder[i] - secondOrder[i];
        return firstOrder;
    }
}
