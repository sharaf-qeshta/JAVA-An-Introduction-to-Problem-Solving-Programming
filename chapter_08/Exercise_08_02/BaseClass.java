package chapter_08;

public class BaseClass
{
    private Category category;
    private boolean checkOut;
    private double cost;
    private double price;
    private int count;
    private int soldCount;


    public BaseClass(boolean checkOut)
    {
        this.checkOut = checkOut;
    }

    public BaseClass(boolean checkOut, double cost, double price)
    {
        this.checkOut = checkOut;
        this.cost = cost;
        this.price = price;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public int getSoldCount()
    {
        return soldCount;
    }
}
