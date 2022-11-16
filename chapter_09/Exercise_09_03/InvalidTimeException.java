package chapter_09;

public class InvalidTimeException extends Exception
{
    public InvalidTimeException(int value)
    {
        super("value : " + value + " is out of range");
    }
}
