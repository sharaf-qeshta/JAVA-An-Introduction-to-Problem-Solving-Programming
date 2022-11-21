package chapter_09;

public class SongCard
{
    private int songs;
    private boolean activated;


    public SongCard(int n)
    {
        this.songs = n;
    }

    public void activate() throws Exception
    {
        if (activated)
            throw new Exception("The card is already activated");
        else
            activated = true;
    }

    public void buyASong() throws Exception
    {
        if (!activated)
            throw new Exception("The card is not activated");
        else if (songs <= 0)
            throw new Exception("The card is fully used");
        else
            songs--;
    }

    public int songsRemaining()
    {
        return songs;
    }
}
