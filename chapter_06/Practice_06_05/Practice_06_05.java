package chapter_06;

/**
 * 5. The following class displays a disclaimer every time an instance is created
 * using the default constructor. However, we would like the disclaimer to
 * appear only once when the very first Vehicle object is created. Any future
 * Vehicle objects that are created should display no disclaimer. Modify the
 * code to use a static boolean variable that is initialized to false when it is
 * defined. Once the disclaimer is displayed the variable should be set to
 * true, and an if statement added around the display so the disclaimer is
 * only output if the variable has the value false. This should force the
 * program to display the disclaimer only once. Add a main method and test
 * code to verify that the disclaimer is only displayed once.
 * public class Vehicle
 * {
 * public Vehicle()
 *  {
 *  System.out.println("You should not operate this vehicle
 *  under the");
 *  System.out.println("influence of alcohol!");
 *  }
 * }
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_06_05
{
    public static void main(String[] args)
    {
        /*
        * You should not operate this vehicle under the
        * influence of alcohol!
        * */
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3 = new Vehicle();
        Vehicle vehicle4 = new Vehicle();
    }
}
