package chapter_09;

public class DayException extends Exception
{
    public DayException(int day)
    {
        super("Invalid day: " + day);
    }
}
