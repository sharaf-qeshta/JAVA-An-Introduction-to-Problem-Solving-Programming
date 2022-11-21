package chapter_09;

public class Rational
{
    private int numerator, denominator;

    public Rational(int numerator, int denominator)
            throws Exception
    {
        setDenominator(denominator);
        this.numerator = numerator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setDenominator(int denominator) throws Exception
    {
        if (denominator == 0)
            throw new Exception("Denominator cannot be zero!");
        this.denominator = denominator;
    }
}
