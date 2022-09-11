package chapter_07;

public class Book
{
    private double[] booksPrices;
    private int booksPurchased;
    private int maxNumberBP;


    public Book(int max)
    {
        maxNumberBP = max;
        booksPrices = new double[max];
        booksPurchased = 0;
    }

    public void addPrice(double price)
    {
        booksPrices[booksPurchased++] = price;
    }

    public int getNumberOfBooksPurchased()
    {
        return booksPurchased;
    }

    public double getTotalBooksPrice()
    {
        double total = 0;
        for (int i = 0; i < booksPurchased; i++)
            total += booksPrices[i];
        return total;
    }
}
