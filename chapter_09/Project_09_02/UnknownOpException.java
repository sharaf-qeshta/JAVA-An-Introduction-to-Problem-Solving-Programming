package chapter_09;

public class UnknownOpException extends Exception
{
    public UnknownOpException()
    {
        super("UnknownOpException");
    }

    public UnknownOpException(char op)
    {
        super(op + " is an unknown operator.");
    }

    public UnknownOpException(String message)
    {
        super(message);
    }
}
