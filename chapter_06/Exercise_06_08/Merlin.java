package chapter_06;

public class Merlin
{
    private static Merlin theWizard;

    private Merlin() { }

    public static Merlin summon()
    {
        if (theWizard == null)
            theWizard = new Merlin();
        return theWizard;
    }

    public String consult()
    {
        return "Pull the sword from the stone";
    }
}
