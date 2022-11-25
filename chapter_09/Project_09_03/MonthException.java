package chapter_09;

public class MonthException extends Exception
{
    public MonthException(int month)
    {
        super("Invalid month " + month);
    }
}
