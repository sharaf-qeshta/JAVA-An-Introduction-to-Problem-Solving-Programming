package chapter_02;

import javax.swing.*;

/**
 * 10. Write a program that reads a string for a date in the format month / day /
 * year and displays it in the format day . month . year, which is a typical
 * format used in Europe. For example, if the input is 06 /17/11, the output
 * should be 17.06.11.Your program should use JOptionPane for input and
 * output
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_10
{
    public static void main(String[] args)
    {
        String date = JOptionPane.showInputDialog("Enter date:");
        String month = date.substring(0, date.indexOf("/"));
        String day = date.substring(date.indexOf("/")+1, date.lastIndexOf("/"));
        String year = date.substring(date.lastIndexOf("/")+1);

        JOptionPane.showMessageDialog(null,
                day + " . " + month + " . " + year);
        System.exit(0);
    }
}
