package chapter_09;

public class Square extends Rectangle
{
    private int side;

    public Square(int side) throws DimensionException
    {
        super(side, side*2);
    }
}
