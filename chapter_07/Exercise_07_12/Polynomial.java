package chapter_07;

public class Polynomial
{
    private int degree; // n
    private float[] coefficients; // ai

    public Polynomial(int max)
    {
        degree = max;
        coefficients = new float[max+1];
    }

    public void setConstant(int i, float value)
    {
        coefficients[i] = value;
    }

    public double evaluate(double x)
    {
        double total = 0;
        for (int i = 0; i < degree+1; i++)
            total += coefficients[i] * Math.pow(x, i);
        return total;
    }
}
