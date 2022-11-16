package chapter_09;

public class InvalidFrequencyException extends Exception
{
    public InvalidFrequencyException(int frequency)
    {
        super(frequency + " is an invalid frequency");
    }
}
