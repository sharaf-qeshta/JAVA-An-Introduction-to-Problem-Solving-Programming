package chapter_06;

public class Vehicle
{
    private static boolean disclaimer = false;
    public Vehicle()
    {
        if (!disclaimer)
        {
            System.out.println("You should not operate this vehicle under the");
            System.out.println("influence of alcohol!");
            disclaimer = true;
        }
    }
}
