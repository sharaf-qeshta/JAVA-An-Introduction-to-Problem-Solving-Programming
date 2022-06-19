package chapter_03;

import java.util.Scanner;

/**
 * 6. Repeat Programming Project 5 but in addition ask the user if he or she is
 * a. Sedentary
 * b. Somewhat active (exercise occasionally)
 * c. Active (exercise 3–4 days per week)
 * d. Highly active (exercise every day)
 * If the user answers “Sedentary,” then increase the calculated BMR by 20
 * percent. If the user answers “Somewhat active,” then increase the calculated
 * BMR by 30 percent. If the user answers “Active,” then increase the
 * calculated BMR by 40 percent. Finally, if the user answers “Highly active,”
 * then increase the calculated BMR by 50 percent. Output the number of
 * chocolate bars based on the new BMR value.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_06
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

        System.out.println("\na. Sedentary");
        System.out.println("b. Somewhat active (exercise occasionally)");
        System.out.println("c. Active (exercise 3–4 days per week)");
        System.out.println("d. Highly active (exercise every day)");
        System.out.print("Choose one: ");
        char choice = scanner.next().trim().charAt(0);

        double increaseRatio = 0;
        if (choice == 'a')
            increaseRatio = 0.2;
        else if (choice == 'b')
            increaseRatio = 0.3;
        else if (choice == 'c')
            increaseRatio = 0.4;
        else if (choice == 'd')
            increaseRatio = 0.5;


        double manBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8  * age);
        manBMR += manBMR * increaseRatio;
        double womenBMR = 655 + (4.3 * weight) + (4.7 * height) - (6.8 * age);
        womenBMR += womenBMR * increaseRatio;

        System.out.println("Man needs " + (manBMR/CALORIES_IN_CHOCOLATE_BAR) + " chocolate bars daily");
        System.out.println("Women needs " + (womenBMR/CALORIES_IN_CHOCOLATE_BAR) + " chocolate bars daily");
    }
}
