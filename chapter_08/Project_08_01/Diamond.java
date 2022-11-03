package chapter_08;

public class Diamond extends ShapeBasics
{
    @Override
    public void drawHere()
    {
        int v = offset/2;
        // draw V
        System.out.println(" ".repeat(v+1) + "*");
        for (int i = 1; i < v; i++)
        {
            String x = " ".repeat(v - i) + "*" + " ".repeat(i*2) + "*";
            System.out.println(x);
        }

        // draw inverted V
        for (int i = v-1; i > 0; i--)
        {
            String x = " ".repeat(v - i) + "*" + " ".repeat(i*2) + "*";
            System.out.println(x);
        }
        System.out.println(" ".repeat(v+1) + "*");
    }
}
