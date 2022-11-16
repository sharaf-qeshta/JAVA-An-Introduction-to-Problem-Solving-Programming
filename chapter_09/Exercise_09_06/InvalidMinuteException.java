package chapter_09;

public class InvalidMinuteException extends InvalidTimeException
{
    public InvalidMinuteException(int value)
    {
        super("minute: " + value +
                " exceeds the allowed range for minutes which is from 0 to 60 exclusive");
    }
}
