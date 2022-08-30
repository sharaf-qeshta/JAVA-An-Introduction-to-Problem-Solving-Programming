package chapter_06;

import java.util.Scanner;

/**
 * 1. Define a utility class for displaying values of type double. Call the class
 * DoubleOut. Include all the methods from the class DollarFormat in Listing
 * 6.14, all the methods from the class OutputFormat of Self-Test Question
 * 30, and a method called scienceWrite that displays a value of type double
 * using e notation, such as 2.13e–12. (This e notation is also called scientific
 * notation, which explains the method name.) When displayed in e
 * notation, the number should appear with exactly one nonzero digit before
 * the decimal point—unless the number is exactly zero. The method
 * scienceWrite will not advance to the next line. Also add a method called
 * scienceWriteln that is the same as scienceWrite except that it does
 * advance to the next line. All but the last two method definitions can
 * simply be copied from the text (or more easily from the source code for
 * this book that is available on the Web.). Note that you will be overloading
 * the method names write and writeln.
 * Write a driver program to test your method scienceWriteln. This driver
 * program should use a stub for the method scienceWrite. (Note that this
 * means you can write and test scienceWriteln before you even write
 * scienceWrite.) Then write a driver program to test the method scienceWrite.
 * Finally, write a program that is a sort of super driver program that takes a
 * double value as input and then displays it using the two writeln methods
 * and the scienceWriteln method. Use the number 5 for the number of digits
 * after the decimal point when you need to specify such a number. This super
 * driver program should allow the user to repeat this testing with additional
 * numbers of type double until the user is ready to end the program.
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter 0 to exit from testing write()!");
            System.out.print("Enter a value: ");
            double value = scanner.nextDouble();
            if (value == 0)
                break;

            DoubleOut.write(value);
            System.out.println(" => write(double amount)");
            DoubleOut.write(value, 5);
            System.out.println(" => write(double number, int digitsAfterPoint)");
            DoubleOut.scienceWrite(value, 5);
            System.out.println(" => scienceWrite(double value, int digitsAfterPoint)");
        }
    }
}
