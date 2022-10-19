package chapter_08;

public class Square extends DrawableShape
{
    private int sideLength;

    @Override
    public void draw()
    {
        for (int i = 0; i < y; i++)
            System.out.println();
        String horizontalPadding = "";
        for (int i = 0; i < x; i++)
            horizontalPadding += " ";

        System.out.print(horizontalPadding);
        for (int i = 0; i < sideLength; i++)
            System.out.print("*");
        System.out.println();

        String wide = horizontalPadding.substring(0, horizontalPadding.length()-2);
        for (int i = 0; i < sideLength; i++)
            System.out.println(horizontalPadding + "*" + wide + "*");

        System.out.print(horizontalPadding);
        for (int i = 0; i < sideLength; i++)
            System.out.print("*");
        System.out.println();
    }

    public int getArea()
    {
        return sideLength * sideLength;
    }

    public int getPerimeter()
    {
        return 4 * sideLength;
    }

    public int getSideLength()
    {
        return sideLength;
    }

    public void setSideLength(int sideLength)
    {
        this.sideLength = sideLength;
    }

    @Override
    public int getX()
    {
        return x;
    }

    @Override
    public void setX(int x)
    {
        this.x = x;
    }

    @Override
    public int getY()
    {
        return y;
    }

    @Override
    public void setY(int y)
    {
        this.y = y;
    }

    @Override
    public String getColor()
    {
        return color;
    }

    @Override
    public void setColor(String color)
    {
        this.color = color;
    }
}
