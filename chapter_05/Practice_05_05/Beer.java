package chapter_05;

public class Beer
{
    String name;
    double alcohol;

    public double intoxicated(double weight)
    {
        double numDrinks;
        // This is a simplification of the Widmark formula
        numDrinks = (0.08 + 0.015) * weight / (12 * 7.5 *
                alcohol);
        return numDrinks;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getAlcohol()
    {
        return alcohol;
    }

    public void setAlcohol(double alcohol)
    {
        this.alcohol = alcohol;
    }
}
