package chapter_03;


import javax.swing.*;

/**
 * 17. Write Java statements that create an “OK” dialog box in response to the
 * message, “The error is found and corrected!”
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_17
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,
                "The error is found and corrected!", "Exercise_03_16", JOptionPane.INFORMATION_MESSAGE);
    }
}
