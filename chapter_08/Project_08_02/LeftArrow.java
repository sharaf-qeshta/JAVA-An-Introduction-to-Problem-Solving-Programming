package chapter_08;

public class LeftArrow extends ShapeBasics
{
    private int width;
    private int length;

    public LeftArrow(int width, int length)
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
        int j = width/2;
        int k = 1;
        System.out.println(" ".repeat(width+2) + "*");
        for (int i = 1; i < width-1; i++)
        {
            if (i == (width-1)/2)
                System.out.println(" ".repeat(j*2) + "*" + " ".repeat(k*2) + "*" + "*".repeat(length));
            else
                System.out.println(" ".repeat(j*2) + "*" + " ".repeat(k*2) + "*");

            if (i < width/2)
            {
                j--;
                k++;
            }
            else
            {
                j++;
                k--;
            }
        }
        System.out.println(" ".repeat(width+2) + "*");
    }
}
