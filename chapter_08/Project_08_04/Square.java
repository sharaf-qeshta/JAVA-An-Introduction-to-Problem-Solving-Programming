package chapter_08;

public class Square extends Rectangle
{
    private int side;

    public Square(int side)
    {
        super(side, side*2);
    }
}
