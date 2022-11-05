package chapter_08;

/**
 * 4. Create the classes RightTriangle and Rectangle, each of which is derived
 * from the abstract class ShapeBase in Listing 8.19. Then derive a class
 * Square from the class Rectangle. Each of these three derived classes will
 * have two additional methods to calculate area and circumference, as well
 * as the inherited methods. Do not forget to override the method drawHere.
 * Give your classes a reasonable complement of constructors and accessor
 * methods. The Square class should include only one dimension, the side,
 * and should automatically set the height and width to the length of the
 * side. You can use dimensions in terms of the character width and line
 * spacing even though they are undoubtedly unequal, so a square will not
 * look square (just as a Rectangle object, as discussed in this chapter, won’t
 * look square). Write a driver program that tests all your methods.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_04
{
    public static void main(String[] args)
    {
        /*
         * *
         * * *
         * *  *
         * *   *
         * *    *
         * *     *
         * *      *
         * *       *
         * *        *
         * *         *
         * *          *
         * *           *
         * *            *
         * *             *
         * ****************
         * */
        RightTriangle rightTriangle = new RightTriangle(15, 15);
        rightTriangle.drawHere();

        /*
         * ****************************************************
         * *                                                  *
         * *                                                  *
         * *                                                  *
         * *                                                  *
         * *                                                  *
         * *                                                  *
         * *                                                  *
         * *                                                  *
         * ****************************************************
         * */
        Rectangle rectangle = new Rectangle(10, 50);
        rectangle.drawHere();

        /*
         * **********************
         * *                    *
         * *                    *
         * *                    *
         * *                    *
         * *                    *
         * *                    *
         * *                    *
         * *                    *
         * **********************
         * */
        Square square = new Square(10);
        square.drawHere();
    }
}
