package chapter_03;

import javax.swing.*;

/**
 * 2. Repeat any of the previous Practice Programs using JOptionPane, which is
 * described in the graphics supplement at the end of Chapter 2.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_02
{
    public static final double WEIGHT = 175;
    public static final int NUMBER_OF_DRINKS = 10;
    public static final double OUNCE_PER_CAN = 0.55;
    public static void main(String[] args)
    {
        double bac = (4.136 * NUMBER_OF_DRINKS * OUNCE_PER_CAN) / WEIGHT;

        // in texas the limit is 0.8%
        if (bac > 0.8)
            JOptionPane.showMessageDialog(null, "You will be intoxicated in texas",
                    "Project_03_01", JOptionPane.WARNING_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Everything fine!!", "Project_03_01",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
