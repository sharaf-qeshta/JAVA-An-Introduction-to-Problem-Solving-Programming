package chapter_04;

import javax.swing.*;

/**
 * 4. Repeat the previous project, but use JOptionPane windows for input and
 * output. Offer the user Yes and No buttons to end execution instead of
 * asking for character input of Q or q. JOptionPane is described in the
 * graphics supplements of Chapters 2 and 3.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_04_04
{
    public static void main(String[] args)
    {
        while (true)
        {
            double temperature = Double.parseDouble(JOptionPane
                    .showInputDialog(null, "Enter the temperature: "));

            char temp = JOptionPane.showInputDialog(null,
                    "Enter it`s notation (c => Celsius, f => Fahrenheit): ")
                    .trim().toLowerCase().charAt(0);


            while (temp != 'f' && temp != 'c')
                temp = JOptionPane.showInputDialog(null,
                        "Invalid notation Enter it`s notation (c => Celsius, f => Fahrenheit): ")
                        .trim().toLowerCase().charAt(0);

            double newTemp;
            if (temp == 'f')
                newTemp = (temperature - 32) * 5/9;
            else
                newTemp =  9 * (temperature/5) + 32;
            JOptionPane.showMessageDialog(null,
                    newTemp + ((temp == 'c')? "F" : "C"));

            int answer = JOptionPane.showConfirmDialog(null,
                    "Do you want to exit?", "Quit", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION)
                break;
        }
    }
}
