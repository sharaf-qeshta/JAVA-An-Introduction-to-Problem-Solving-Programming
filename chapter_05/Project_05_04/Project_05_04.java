package chapter_05;

/**
 * 4. Write a program that uses the Purchase class in Listing 5.13 to set the
 * following prices:
 * Oranges: 10 for $2.99
 * Eggs: 12 for $1.69
 * Apples: 3 for $1.00
 * Watermelons: $4.39 each
 * Bagels: 6 for $3.50
 * Then calculate the cost of each of the following five items and the total bill:
 * 2 dozen oranges
 * 3 dozen eggs
 * 20 apples
 * 2 watermelons
 * 1 dozen bagels
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_04
{
    public static void main(String[] args)
    {
        Purchase oranges = new Purchase();
        /* Oranges: 10 for $2.99 */
        oranges.setPrice(10, 2.99);
        /* 2 dozen oranges */
        oranges.setNumberBought(20);

        Purchase eggs = new Purchase();
        /* Eggs: 12 for $1.69 */
        eggs.setPrice(12, 1.69);
        /* 3 dozen eggs */
        eggs.setNumberBought(36);

        Purchase apples = new Purchase();
        /* Apples: 3 for $1.00 */
        apples.setPrice(3, 1);
        /* 20 apples */
        apples.setNumberBought(20);

        Purchase watermelons = new Purchase();
        /* Watermelons: $4.39 each */
        watermelons.setPrice(1, 4.39);
        /* 2 watermelons */
        watermelons.setNumberBought(2);

        Purchase bagels = new Purchase();
        /* Bagels: 6 for $3.50 */
        bagels.setPrice(6, 3.5);
        /* 1 dozen bagels */
        bagels.setNumberBought(6);

        /* 2 dozen oranges cost $5.98 */
        System.out.println("2 dozen oranges cost $" + oranges.getTotalCost());

        /* 3 dozen eggs cost $5.07 */
        System.out.println("3 dozen eggs cost $" + eggs.getTotalCost());

        /* 20 apples cost $6.666666666666666 */
        System.out.println("20 apples cost $" + apples.getTotalCost());

        /* 2 watermelons cost $8.78 */
        System.out.println("2 watermelons cost $" + watermelons.getTotalCost());

        /* 1 dozen bagels cost $3.5 */
        System.out.println("1 dozen bagels cost $" + bagels.getTotalCost());

        /* Total cost of all purchased items: $29.99666666666667 */
        System.out.println("Total cost of all purchased items: $"
                + (oranges.getTotalCost() + eggs.getTotalCost()
                    + apples.getTotalCost() + watermelons.getTotalCost()
                    + bagels.getTotalCost() ));
    }
}
