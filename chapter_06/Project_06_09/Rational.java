package chapter_06;

public class Rational
{
    private int a, b;

    public Rational()
    {
        a = 0;
        b = 1;
    }

    public Rational(int a, int b)
    {
        this.a = a;
        this.b = b;
        simplify();
    }

    private void simplify()
    {
        int gcd = getGCD(a, b);
        a = a/gcd;
        b = b/gcd;
    }

    private static int getGCD(int x, int y)
    {
        int min = (x < y)? x : y;
        for (int i = min; i > 0; i--)
            if (x % i == 0 && y % i == 0)
                return i;
        return 1;
    }

    public double getValue()
    {
        return (a + 0.0) / b;
    }

    public String toString()
    {
        return a + "/" + b;
    }
}
