package chapter_02;

import java.util.Scanner;

/**
 * 7. Many private water wells produce only 1 or 2 gallons of water per minute.
 * One way to avoid running out of water with these low-yield wells is to use
 * a holding tank. A family of 4 will use about 250 gallons of water per day.
 * However, there is a “natural” water holding tank in the casing (i.e., the
 * hole) of the well itself. The deeper the well, the more water that will be
 * stored that can be pumped out for household use. But how much water
 * will be available?
 * Write a program that allows the user to input the radius of the well
 * casing in inches (a typical well will have a 3-inch radius) and the depth of
 * the well in feet (assume water will fill this entire depth, although in
 * practice that will not be true since the static water level will generally be 50
 * feet or more below the ground surface). The program should output the
 * number of gallons stored in the well casing. For your reference:
 * The volume of a cylinder is πr
 * 2h , where r is the radius and h is the height.
 * 1 cubic foot = 7.48 gallons of water.
 * For example, a 300-foot well full of water with a radius of 3 inches for the
 * casing holds about 441 gallons of water—plenty for a family of 4 and no
 * need to install a separate holding tank.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the well (in inches) : ");
        double radius = scanner.nextDouble() / 12.0;

        System.out.print("Enter the depth of the well: ");
        double depth = scanner.nextDouble();

        int contains = (int) ((Math.PI * (radius * radius) * depth) * 7.48);
        System.out.println("The well contains " + contains + " gallons");
    }
}
