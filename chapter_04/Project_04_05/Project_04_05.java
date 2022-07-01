package chapter_04;

import javax.swing.*;

/**
 * 5. Repeat Practice Program 7 using JOptionPane, which is described in the
 * graphics supplements of Chapters 2 and 3.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_05
{
    public static void main(String[] args)
    {
        double score = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Enter a score"));

        double max = score, min = score, sum = 0;
        double total = 0, numberOfAs = 0,
                numberOfBs = 0, numberOfCs = 0,
                numberOfDs = 0, numberOfFs = 0;

        while (score > -1)
        {
            sum += score;
            total++;

            if (score > 90)
                numberOfAs++;
            else if (score > 80)
                numberOfBs++;
            else if (score > 70)
                numberOfCs++;
            else if (score > 60)
                numberOfDs++;
            else
                numberOfFs++;

            if (score > max)
                max = score;
            if (score < min)
                min = score;

            score = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Enter a score"));
        }

        JOptionPane.showMessageDialog(null,
                "Total Number of scores is " + total);


        JOptionPane.showMessageDialog(null,
                "Number of Students how get A is " + numberOfAs);
        JOptionPane.showMessageDialog(null,
                "Number of Students how get B is " + numberOfBs );
        JOptionPane.showMessageDialog(null, "Number of Students how get C is " + numberOfCs);
        JOptionPane.showMessageDialog(null, "Number of Students how get D is " + numberOfDs);
        JOptionPane.showMessageDialog(null, "Number of Students how get F is " + numberOfFs);


        JOptionPane.showMessageDialog(null,
                "Percentage for Letter A " + numberOfAs/total * 100 + "%");
        JOptionPane.showMessageDialog(null,
                "Percentage for Letter B " + numberOfBs/total * 100 + "%");
        JOptionPane.showMessageDialog(null,
                "Percentage for Letter C " + numberOfCs/total * 100 + "%");
        JOptionPane.showMessageDialog(null,
                "Percentage for Letter D " + numberOfDs/total * 100 + "%");
        JOptionPane.showMessageDialog(null,
                "Percentage for Letter F " + numberOfFs/total * 100 + "%" );


        JOptionPane.showMessageDialog(null,
                "Scores range between " + min + " and " + max);

        JOptionPane.showMessageDialog(null,
                "The average is " + sum/total);
    }
}
