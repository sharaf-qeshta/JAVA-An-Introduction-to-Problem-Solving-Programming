package chapter_09;

/**
 * 5. Define an exception class called DimensionException to use in the driver
 * program from Programming Project 4 in Chapter 8. Modify that driver
 * program to throw and catch a DimensionException if the user enters
 * something less than or equal to zero for a dimension.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_09_05
{
    public static void main(String[] args)
    {
        try
        {
            RightTriangle rightTriangle = new RightTriangle(15, 15);
            rightTriangle.drawHere();
        }
        catch (DimensionException exception)
        {
            System.out.println(exception.getMessage());
        }

        try
        {
            Rectangle rectangle = new Rectangle(10, 50);
            rectangle.drawHere();
        }
        catch (DimensionException exception)
        {
            System.out.println(exception.getMessage());
        }

        try
        {
            Square square = new Square(10);
            square.drawHere();
        }
        catch (DimensionException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
