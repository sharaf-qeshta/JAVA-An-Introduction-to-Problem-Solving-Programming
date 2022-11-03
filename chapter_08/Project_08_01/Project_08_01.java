package chapter_08;

/**
 * 1. Define a class called Diamond that is derived from either the class
 * ShapeBasics (Listing 8.12) or the abstract class ShapeBase (Listing 8.19).
 * A diamond has the same sort of top half as a Triangle object, and its
 * bottom half is an inverted version of its top half. Define a utility class
 * having public static methods, such as the method skipSpaces and other
 * methods that draw horizontal lines, big V’s, and inverted big V’s. Recall
 * that Self-Test Question 31 asked you to describe one method in this class.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_01
{
    public static void main(String[] args)
    {
        Diamond diamond = new Diamond();
        diamond.setOffset(20);
        diamond.drawHere();
    }
}
