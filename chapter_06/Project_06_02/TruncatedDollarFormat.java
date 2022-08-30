package chapter_06;

public class TruncatedDollarFormat
{
    public static void write(double amount, int digits)
    {
        int mover = (int) Math.pow(10, digits);
        int all = (int) (amount * mover);
        int wholePart = all/mover;
        int afterPoint = all%mover;
        System.out.print(wholePart + "." + afterPoint);
    }

    public static void writeln(double amount, int digits)
    {
        int mover = (int) Math.pow(10, digits);
        int all = (int) (amount * mover);
        int wholePart = all/mover;
        int afterPoint = all%mover;
        System.out.println(wholePart + "." + afterPoint);
    }
}
