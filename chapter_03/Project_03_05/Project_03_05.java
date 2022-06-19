package chapter_03;

import java.util.Scanner;

/**
 * 5. Repeat the calorie-counting program described in Programming Project 8
 * from Chapter 2. This time ask the user to input the string “M” if the user is
 * a man and “W” if the user is a woman. Use only the male formula to
 * calculate calories if “M” is entered and use only the female formula to
 * calculate calories if “W” is entered. Output the number of chocolate bars
 * to consume as before
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_05
{
    public static final double CALORIES_IN_CHOCOLATE_BAR = 230;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        System.out.print("Enter age in years: ");
        int age = scanner.nextInt();

        System.out.print("Enter gender: ");
        String gender = scanner.next();

        if (gender.equals("M"))
        {
            double manBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8  * age);
            System.out.println("Man needs " + (manBMR/CALORIES_IN_CHOCOLATE_BAR) + " chocolate bars daily");
        }
        else
        {
            double womenBMR = 655 + (4.3 * weight) + (4.7 * height) - (6.8 * age);
            System.out.println("Women needs " + (womenBMR/CALORIES_IN_CHOCOLATE_BAR) + " chocolate bars daily");
        }
    }
}
