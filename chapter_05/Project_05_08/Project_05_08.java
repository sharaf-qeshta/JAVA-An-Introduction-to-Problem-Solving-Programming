package chapter_05;

import java.util.Scanner;

/**
 * 8. Consider a class ConcertPromoter that records the tickets sold for a
 * performance. Before the day of the concert, tickets are sold only over the
 * phone. Sales on the day of the performance are made only in person at the
 * concert venue. The class has the following attributes:
 * • The name of the band
 * • The capacity of the venue
 * • The number of tickets sold
 * • The price of a ticket sold by phone
 * • The price of a ticket sold at the concert venue
 * • The total sales amount
 * It has methods to
 * • Record the sale of one or more tickets
 * • Change from phone sales to sales at the concert venue
 * • Return the number of tickets sold
 * • Return the number of tickets remaining
 * • Return the total sales for the concert
 * a. Write a method heading for each method.
 * b. Write preconditions and postconditions for each method.
 * c. Write some Java statements that test the class.
 * d. Implement the class.
 * e. List any additional methods and attributes needed in the
 * implementation that were not listed in the original design. List any
 * other changes made to the original design.
 * f. Write a program using the class you wrote for Part d that will be used
 * to record sales for a concert. Your program should record phone
 * sales, then sales at the venue. As tickets are sold, the number of seats
 * remaining should be displayed. At the end of the program, display
 * the number of tickets sold and the total sales amount for the concert.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ConcertPromoter promoter = new ConcertPromoter("Music", 30_000,
                45, 35);
        while (true)
        {
            System.out.println("enter -1 to quit");
            System.out.println("Enter a process (typeOfPurchase numberOfTickets): ");
            int method = scanner.nextInt();
            int tickets = scanner.nextInt();

            if (method == -1 || tickets == -1)
                break;
            promoter.recordSale(tickets, method);
        }

        System.out.println("Total Sales $" + promoter.getTotalSales());
        System.out.println("Tickets Sold: " + promoter.getTicketsSold() + " tickets");
        System.out.println("Tickets Remaining: " + promoter.getTicketsRemaining() + " tickets");

    }
}
