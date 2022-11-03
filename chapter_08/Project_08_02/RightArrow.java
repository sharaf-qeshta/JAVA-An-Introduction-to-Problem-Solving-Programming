package chapter_08;

public class RightArrow extends ShapeBasics
{
    private int width;
    private int length;

    public RightArrow(int width, int length)
    {
        if (width % 2 == 0)
        {
            System.out.println("Width cannot be even!");
            System.exit(-1);
        }
        if (width < 3)
        {
            System.out.println("Width must be at least 3");
            System.exit(-1);
        }

        this.width = width;
        this.length = length;
    }

    @Override
    public void drawHere()
    {
        String prefix = " ".repeat(length);
        System.out.println(prefix + "*");
        int j = 1;
        for (int i = 1; i < width-1; i++)
        {
            if (i == (width-1)/2)
                System.out.println("*".repeat(length) + "*" + " ".repeat(i*2) + "*");
            else
                System.out.println(prefix + "*" + " ".repeat(j*2) + "*");

            if (i < width/2)
                j++;
            else
                j--;
        }
        System.out.println(prefix + "*");
    }
}
