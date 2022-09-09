package chapter_07;

import java.util.Scanner;

/**
 * 4. Write a program in a class PastryCounter that calculates the cost of pastries
 * sold at a bakery shop. Five flavors of pastries—pineapple, mango, chocolate,
 * strawberry, and black forest—are stocked and cost, respectively, $1.25, $3.25,
 * $2.50, $2.50, and $3.75 per pastry. Create an array of strings that holds the
 * names of these pastries. Create another array that holds the cost of each
 * corresponding pastry. Your program should read the name of a pastry and
 * the quantity desired by a customer. Locate the pastry in the name array and
 * use that index to find the cost per piece in the cost array. Compute and print
 * the total cost of the pastry sale.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_04
{
    public static void main(String[] args)
    {
        String[] names = {"pineapple", "mango", "chocolate", "strawberry", "black forest"};
        double[] prices = {1.25, 3.25, 2.5, 2.5, 3.75};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter q or -1 to exit: ");
        double totalSales = 0;
        while (true)
        {
            System.out.print("Enter a flavor: ");
            String flavor = scanner.nextLine();
            if (flavor.equals("q"))
                break;

            System.out.print("Enter the count: ");
            int count = scanner.nextInt();



            if (count == -1)
                break;

            int index = -1;
            for (int i = 0; i < names.length; i++)
            {
                if (names[i].equals(flavor))
                {
                    index = i;
                    break;
                }
            }

            if (index == -1)
            {
                System.out.println("Flavor is not available");
                scanner.nextLine();
                continue;
            }

            double currentCost = count * prices[index];
            System.out.println("Your order cost $" + currentCost);
            totalSales += currentCost;
            scanner.nextLine();
        }

        System.out.println("Total cost: $" + totalSales);
    }
}
