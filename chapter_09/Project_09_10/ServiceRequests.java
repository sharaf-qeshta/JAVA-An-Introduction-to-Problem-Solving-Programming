package chapter_09;

public class ServiceRequests
{
    public static final int NAMES_COUNT = 100;
    private String[] names = new String[NAMES_COUNT];
    private int currentIndex = 0;

    public ServiceRequests() { }

    public ServiceRequests(int namesCount)
    {
        names = new String[namesCount];
    }

    public void addName(String name) throws ServiceBackUpException
    {
        if (currentIndex > names.length-1)
            throw new ServiceBackUpException("there`s no enough space to record the current name");
        names[currentIndex++] = name;
    }

    public void removeName(String name) throws NoServiceRequestException
    {
        int index = -1;
        for (int i = 0; i < currentIndex; i++)
        {
            if (names[i].equals(name))
            {
                index = i;
                break;
            }
        }

        if (index == -1)
            throw new NoServiceRequestException("Name: " + name + " is not exist on the list");
        for (int i = index; i < currentIndex-1; i++)
            names[i] = names[i+1];
        names[--currentIndex] = null;
    }

    public String getName(int i)
    {
        return names[i];
    }

    public int getNumber()
    {
        return currentIndex+1;
    }

    public void printNames()
    {
        for (int i = 0; i < currentIndex; i++)
            System.out.print(names[i] + ", ");
        System.out.println();
    }
}

class ServiceBackUpException extends Exception
{
    public ServiceBackUpException(String message)
    {
        super(message);
    }
}

class NoServiceRequestException extends Exception
{
    public NoServiceRequestException(String message)
    {
        super(message);
    }
}
