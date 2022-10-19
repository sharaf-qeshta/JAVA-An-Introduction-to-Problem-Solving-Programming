package chapter_08;

/**
 * 5. Create a class Square derived from DrawableShape, as described in the
 * previous exercise. A Square object should know the length of its sides. The
 * class should have an accessor method and a mutator method for this length.
 * It should also have methods for computing the area and perimeter of the
 * square. Although characters are taller than they are wide—so the number of
 * characters in the vertical sides will differ from the number in the horizontal
 * sides—you need not worry about this detail when drawing the square.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_08_05
{
    public static void main(String[] args)
    {
        Square square = new Square();
        square.setX(10);
        square.setY(10);
        square.setSideLength(10);
        square.draw();
    }
}
