package chapter_09;

public class TimeFormatException extends Exception
{
    public TimeFormatException()
    {
        super("Illegal Time Format");
    }

    public TimeFormatException(String wrongFormat)
    {
        super("There is no such time as " + wrongFormat);
    }
}
