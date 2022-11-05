package chapter_08;

public class RightTriangle extends ShapeBasics
{
    private int height, width;

    public RightTriangle(int height, int width)
    {
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
