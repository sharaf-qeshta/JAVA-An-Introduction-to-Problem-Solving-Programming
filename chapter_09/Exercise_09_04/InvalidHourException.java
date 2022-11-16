package chapter_09;

public class InvalidHourException extends InvalidTimeException
{
    public InvalidHourException(int value)
    {
        super("hour: " + value +
                " exceeds the allowed range for hours which is from 0 to 24 exclusive");
    }
}
