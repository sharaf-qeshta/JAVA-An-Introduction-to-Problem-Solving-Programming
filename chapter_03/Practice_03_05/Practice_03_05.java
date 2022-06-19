package chapter_03;

import java.util.Scanner;

/**
 * 5. Write a program that allows the user to convert a temperature given in
 * degrees from either Celsius to Fahrenheit or Fahrenheit to Celsius. Use the
 * following formulas:
 * Degrees_C = 5(Degrees_F− 32)/9
 * Degrees_F = (9(Degrees_C)/5) + 32)
 * Prompt the user to enter a temperature and either a C or c for Celsius or an
 * F or f for Fahrenheit. Convert the temperature to Fahrenheit if Celsius is
 * entered, or to Celsius if Fahrenheit is entered. Display the result in a
 * readable format. If anything other than C, c, F, or f is entered, print an
 * error message and stop.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_03_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter it`s notation (c => Celsius, f => Fahrenheit): ");
        char temp = scanner.next().trim().toLowerCase().charAt(0);

        double newTemp = 0;
        if (temp == 'f')
            newTemp = (temperature - 32) * 5/9;
        else if (temp == 'c')
            newTemp =  9 * (temperature/5) + 32;
        else
        {
            System.out.println("Wrong Input");
            System.exit(-1);
        }
        System.out.println(newTemp + ((temp == 'c')? "F" : "C"));
    }
}
