package chapter_09;

public class RightTriangle extends ShapeBasics
{
    private int height, width;

    public RightTriangle(int height, int width) throws DimensionException
    {
        if (height <= 0 || width <= 0)
            throw new DimensionException("dimensions must be greater than zero");
        this.height = height;
        this.width = width;
    }

    @Override
    public void drawHere()
    {
        String base = "*".repeat(width);
        System.out.println("*");
        for (int i = 1; i < height-1; i++)
            System.out.println("*" + " ".repeat(i) + "*");
        System.out.println("*"+base);
    }
}
