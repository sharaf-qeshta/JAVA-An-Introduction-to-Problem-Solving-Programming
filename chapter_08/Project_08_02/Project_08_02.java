package chapter_08;

/**
 * 2. Define two derived classes of the abstract class ShapeBase in Listing 8.19.
 * Your two classes will be called RightArrow and LeftArrow. These classes
 * will be like the classes Rectangle and Triangle, but they will draw arrows
 * that point right and left, respectively. For example, the following arrow
 * points to the right:
 * The size of the arrow is determined by two numbers, one for the length of
 * the “tail” and one for the width of the arrowhead. (The width is the length
 * of the vertical base.) The arrow shown here has a length of 16 and a width
 * of 7. The width of the arrowhead cannot be an even number, so your
 * constructors and mutator methods should check to make sure that it is
 * always odd. Write a test program for each class that tests all the methods
 * in the class. You can assume that the width of the base of the arrowhead is
 * at least 3.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_02
{
    public static void main(String[] args)
    {
        RightArrow rightArrow = new RightArrow(7, 16);
        /*
         *                 *
         *                 *  *
         *                 *    *
         * *****************      *
         *                 *    *
         *                 *  *
         *                 *
         **/
        rightArrow.drawHere();

        LeftArrow leftArrow = new LeftArrow(7, 16);
        /*
         *          *
         *       *  *
         *     *    *
         *   *      *****************
         *     *    *
         *       *  *
         *          *
         * */
        leftArrow.drawHere();
    }
}
