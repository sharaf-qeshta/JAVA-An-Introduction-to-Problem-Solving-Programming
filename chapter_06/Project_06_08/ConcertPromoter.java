package chapter_06;

public class ConcertPromoter
{
    private String bandName;
    private int venueCapacity, ticketsSold;
    private double priceOfTicketOnPhone, priceOfTicketOnConcertVenue;
    private double totalSales;


    public ConcertPromoter(String bandName, int venueCapacity,
                           double priceOfTicketOnPhone,
                           double priceOfTicketOnConcertVenue)
    {
        this.bandName = bandName;
        this.venueCapacity = venueCapacity;
        this.priceOfTicketOnPhone = priceOfTicketOnPhone;
        this.priceOfTicketOnConcertVenue = priceOfTicketOnConcertVenue;
    }

    /**
     * Record the sale of one or more tickets
     * */
    public void recordSale(int tickets, int method)
    {
        ticketsSold += tickets;
        if (method == 1) // phone
        {
            totalSales += tickets * priceOfTicketOnPhone;
        }
        else // venue
        {
            totalSales += tickets * priceOfTicketOnConcertVenue;
        }
    }

    /**
     *  Change from phone sales to sales at the concert venue
     *  */
    public void changeToConcertVenue(int tickets)
    {
        totalSales -= tickets * priceOfTicketOnPhone;
        totalSales += tickets * priceOfTicketOnConcertVenue;
    }


    /**
     * Return the number of tickets sold
     * */
    public int getTicketsSold()
    {
        return ticketsSold;
    }

    /**
     * Return the number of tickets remaining
     * */

    public int getTicketsRemaining()
    {
        return venueCapacity - ticketsSold;
    }

    /**
     * Return the total sales for the concert
     * */
    public double getTotalSales()
    {
        return totalSales;
    }
}
