package chapter_09;

public class ZeroOrNegativeCounterException extends Exception
{
    public ZeroOrNegativeCounterException()
    {
        super("Count must be at least one");
    }
}
