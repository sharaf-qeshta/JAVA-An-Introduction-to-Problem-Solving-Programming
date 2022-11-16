package chapter_09;

public class FrequencyInUseException extends Exception
{
    public FrequencyInUseException(int frequency)
    {
        super("Frequency " + frequency + " is in use");
    }
}
