package chapter_02;


import java.util.Scanner;

/**
 * 1. Write a program that converts degrees from Fahrenheit to Celsius, using
 * the formula
 * DegreesC = 5(DegreesF −32)/9
 * Prompt the user to enter a temperature in degrees Fahrenheit as a whole
 * number without a fractional part. Then have the program display the
 * equivalent Celsius temperature, including the fractional part to at least
 * one decimal point. A possible dialogue with the user might be
 * Enter a temperature in degrees Fahrenheit: 72
 * 72 degrees Fahrenheit is 22.2 degrees Celsius.
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in degrees Fahrenheit: ");
        int fahrenheit = scanner.nextInt();

        double celsius = 5 * (fahrenheit - 32.0) / 9;
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
    }
}
