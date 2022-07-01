package chapter_04;

import java.util.Scanner;

/**
 * 3. Repeat Practice Program 5 of Chapter 3, but use a loop so the user can
 * convert other temperatures. If the user enters a letter other than C or F—in
 * either uppercase or lowercase—after a temperature, print an error message
 * and ask the user to reenter a valid selection. Do not ask the user to reenter
 * the numeric portion of the temperature again, however. After each
 * conversion, ask the user to type Q or q to quit or to press any other key to
 * repeat the loop and perform another conversion.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_04_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter q or Q to quit");
            System.out.print("Enter temperature: ");
            double temperature = scanner.nextDouble();
            System.out.print("Enter it`s notation (c => Celsius, f => Fahrenheit): ");
            char temp = scanner.next().trim().toLowerCase().charAt(0);

            if (temp == 'q')
                break;

            while (temp != 'f' && temp != 'c')
            {
                System.out.print("Enter it`s notation (c => Celsius, f => Fahrenheit): ");
                temp = scanner.next().trim().toLowerCase().charAt(0);
                if (temp == 'q')
                    System.exit(0);
            }
            double newTemp;
            if (temp == 'f')
                newTemp = (temperature - 32) * 5/9;
            else
                newTemp =  9 * (temperature/5) + 32;
            System.out.println(newTemp + ((temp == 'c')? "F" : "C"));
        }
    }
}
