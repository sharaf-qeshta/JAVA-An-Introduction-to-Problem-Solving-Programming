package chapter_07;

public class Family
{
    double income;
    int size;

    public Family(double income, int size)
    {
        this.income = income;
        this.size = size;
    }

    public boolean isRich(double expenditure, double saving)
    {
        double sixtyPercent = income * 0.6;
        return expenditure + saving * size > sixtyPercent;
    }

    public String toString()
    {
        return "Family Income: $" + income + " || Family Size " + size + " Members";
    }
}
