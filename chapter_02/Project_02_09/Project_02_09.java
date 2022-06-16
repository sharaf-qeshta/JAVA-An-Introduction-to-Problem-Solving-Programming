package chapter_02;

import javax.swing.*;

/**
 * 9. Repeat any of the previous programming projects using JOptionPane,
 * which is described in the graphics supplement.
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_09
{
    public static final double CALORIES_IN_CHOCOLATE_BAR = 230;
    public static void main(String[] args)
    {
        double weight = Double.parseDouble(
                JOptionPane.showInputDialog("Enter weight in pounds: "));

        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter height in inches: "));

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age in years: "));

        double manBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8  * age);
        double womenBMR = 655 + (4.3 * weight) + (4.7 * height) - (6.8 * age);

        JOptionPane.showMessageDialog(null,
                "Women needs " + (womenBMR/CALORIES_IN_CHOCOLATE_BAR) + " chocolate bars daily\n"
        + "Man needs " + (manBMR/CALORIES_IN_CHOCOLATE_BAR) + " chocolate bars daily");

        System.exit(0);
    }
}
