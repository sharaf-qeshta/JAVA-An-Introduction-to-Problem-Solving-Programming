package chapter_02;

import java.util.Scanner;

/**
 * 11. It is important to consider the effect of thermal expansion when building
 * a structure that must withstand changes in temperature. For example, a
 * metal beam will expand in hot temperatures. The additional stress could
 * cause the structure to fail. Similarly, a material will contract in cold
 * temperatures. The linear change in length of a material if it is allowed to
 * freely expand is described by the following equation:
 * LΔ = aL0TΔ
 * Here, L0 is the initial length of the material in meters, LΔ is the displacement
 * in meters, TΔ is the change in temperature in Celsius, and a is a coefficient
 * for linear expansion.
 * Write a program that inputs a, LΔ, TΔ, and the name of the material, then
 * calculates and outputs the material’s name and the amount of linear
 * displacement. Here are some values for a for different materials.
 * Aluminum 2.31 × 10−5
 * Copper 1.70 × 10−5
 * Glass 8.50 × 10−6
 * Steel 1.20 × 10−5
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter linear expansion a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the initial length of the material L0: ");
        double l0 = scanner.nextDouble();

        System.out.print("Enter the change in temperature TΔ: ");
        double delta_t = scanner.nextDouble();

        System.out.println("after these effects the material length will be "
                + (a * l0 * delta_t) + " meters");
    }
}
