package chapter_02;

import java.util.Scanner;

/**
 * 8. The Harris-Benedict equation estimates the number of calories your body
 * needs to maintain your weight if you do no exercise. This is called your
 * basal metabolic rate, or BMR.
 * The calories needed for a woman to maintain her weight is:
 * BMR = 655 + (4.3 × weight in pounds) + (4.7 × height in inches)
 * − (4.7× age in years)
 * The calories needed for a man to maintain his weight is:
 * BMR = 66 + (6.3 × weight in pounds) + (12.9 × height in inches)
 * − (6.8 × age in years)
 * A typical chocolate bar will contain around 230 calories. Write a program
 * that allows the user to input his or her weight in pounds, height in inches,
 * and age in years. The program should then output the number of chocolate
 * bars that should be consumed to maintain one’s weight for both a woman
 * and a man of the input weight, height, and age
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_08
{
    public static final double CALORIES_IN_CHOCOLATE_BAR = 230;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter height in inches: ");
        double height = scanner.nextDouble();

        System.out.println("Enter age in years: ");
        int age = scanner.nextInt();

        double manBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8  * age);
        double womenBMR = 655 + (4.3 * weight) + (4.7 * height) - (6.8 * age);

        System.out.println("Women needs " + (womenBMR/CALORIES_IN_CHOCOLATE_BAR) + " chocolate bars daily");
        System.out.println("Man needs " + (manBMR/CALORIES_IN_CHOCOLATE_BAR) + " chocolate bars daily");
    }
}
