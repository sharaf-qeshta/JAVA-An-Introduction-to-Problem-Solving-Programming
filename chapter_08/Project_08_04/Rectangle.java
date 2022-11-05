package chapter_08;

public class Rectangle extends ShapeBasics
{
    private int width, height;

    public Rectangle(int height, int width)
    {
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
