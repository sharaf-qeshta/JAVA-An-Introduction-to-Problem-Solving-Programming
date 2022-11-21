package chapter_09;

public class Rational
{
    private int numerator, denominator;

    public Rational(int numerator, int denominator)
    {
        assert denominator != 0;
        this.denominator = denominator;
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

    public void setDenominator(int denominator)
    {
        assert denominator != 0;
        this.denominator = denominator;
    }
}
