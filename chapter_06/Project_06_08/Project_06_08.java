package chapter_06;

import java.util.Scanner;

/**
 * 8. Repeat Programming Project 8 of the previous chapter, but include
 * constructors.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_08
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
