package chapter_06;

public class Temperature
{
    private float degrees;
    private char scale;

    public Temperature(float degrees)
    {
        this.degrees = degrees;
        scale = 'C';
    }

    public Temperature(char scale)
    {
        this.scale = scale;
        degrees = 0;
    }

    public Temperature(float degrees, char scale)
    {
        this.degrees = degrees;
        this.scale = scale;
    }


    public Temperature()
    {
        degrees = 0;
        scale = 'C';
    }


    public float getCelsius()
    {
        if (scale == 'C')
            return degrees;
        return Float.parseFloat(round((degrees - 32)  * (5/9.0), 1));
    }

    public float getFahrenheit()
    {
        if (scale == 'F')
            return degrees;
        return Float.parseFloat(round((degrees * (9/5.0)) + 32, 1));
    }

    public static String round(double amount, int digits)
    {
        int mover = (int) Math.pow(10, digits);
        int all = (int) (amount * mover);
        int wholePart = all/mover;
        int afterPoint = all%mover;
        return wholePart + "." + afterPoint;
    }


    public void set(float degrees)
    {
        this.degrees = degrees;
    }

    public void set(char scale)
    {
        this.scale = scale;
    }

    public void set(float degrees, char scale)
    {
        this.degrees = degrees;
        this.scale = scale;
    }

    public boolean equals(Temperature otherTemperature)
    {
        return getCelsius() == otherTemperature.getCelsius();
    }

    public boolean lessThan(Temperature otherTemperature)
    {
        return getCelsius() < otherTemperature.getCelsius();
    }

    public boolean greaterThan(Temperature otherTemperature)
    {
        return getCelsius() > otherTemperature.getCelsius();
    }
}
