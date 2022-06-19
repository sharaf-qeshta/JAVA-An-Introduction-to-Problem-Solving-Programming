package chapter_03;

import java.util.Scanner;

/**
 * 7. Repeat Programming Project 11 in Chapter 2, but if the displacement is
 * positive then output that “The (material name) will expand by” the
 * displacement in meters. If the displacement is negative then output that
 * “The (material name) will contract by” the displacement in meters. You
 * shouldn’t output the displacement as a negative number.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter material name: ");
        String name = scanner.nextLine();

        System.out.print("Enter linear expansion a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the initial length of the material L0: ");
        double l0 = scanner.nextDouble();

        System.out.print("Enter the change in temperature TΔ: ");
        double delta_t = scanner.nextDouble();

        double displacement = a * l0 * delta_t;

        if (displacement >= 0)
            System.out.println("The " + name + " will expand by " + displacement + " meters");
        else
            System.out.println("The " + name + " will contract by " + (displacement*-1) + " meters");
    }
}
