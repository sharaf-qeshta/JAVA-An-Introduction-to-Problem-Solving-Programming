package chapter_09;

public class Rectangle extends ShapeBasics
{
    private int width, height;

    public Rectangle(int height, int width) throws DimensionException
    {
        if (height <= 0 || width <= 0)
            throw new DimensionException("dimensions must be greater than zero");
        this.height = height;
        this.width = width;
    }

    @Override
    public void drawHere()
    {
        String widthPattern = "*".repeat(width);
        System.out.println("*" + widthPattern + "*");
        for (int i = 1; i < height-1; i++)
            System.out.println("*" + " ".repeat(width) + "*");
        System.out.println("*" + widthPattern + "*");
    }
}
