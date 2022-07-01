package chapter_04;

import java.util.Scanner;

/**
 * 14. Suppose that you work for an ice cream company. The company wants to
 * know the optimal cost for an ice cream cone that holds a specified volume.
 * Write a fragment of code that uses an ask-before-iterating loop. During
 * each iteration of the loop, your code will ask the user to enter the volume
 * and the radius of the cone. Compute and display the height and cost of
 * the cone. Use the following formulas, where V is the volume, r is the
 * radius, h is the height, and C is the cost.
 *
 *      h = 3v/πr²     l = √r²+h²   C = πrl
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_14
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of cones: ");
        int cones = scanner.nextInt();

        for (int i = 0; i < cones; i++)
        {
            System.out.print("Enter the volume of the cone: ");
            double volume = scanner.nextDouble();

            System.out.print("Enter the radius of the cone: ");
            double radius = scanner.nextDouble();

            double height = (3 * volume) / (Math.PI * radius * radius);
            double l = Math.sqrt(radius * radius + height * height);
            double cost = Math.PI * radius * l;

            System.out.println("The height of the cone is " + height);
            System.out.println("The cost of the cone is $" + cost );
        }
    }
}
