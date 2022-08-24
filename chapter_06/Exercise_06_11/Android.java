package chapter_06;

public class Android
{
    private static int tag = 1;
    private String name;

    public Android()
    {
        name = "Bob" + tag;
        changeTage();
    }

    public String getName()
    {
        return name;
    }

    private static boolean isPrime(int n)
    {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    private static void changeTage()
    {
        boolean prime = false;
        int start = tag+1;
        while (!prime)
        {
            prime = isPrime(start);
            if (prime)
                tag = start;
            start++;
        }
    }

}
