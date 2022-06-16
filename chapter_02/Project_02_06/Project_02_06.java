package chapter_02;

import java.util.Scanner;

/**
 * 6. Write a program that reads a 4-bit binary number from the keyboard as a
 * string and then converts it into decimal. For example, if the input is 1100,
 * the output should be 12. (Hint: Break the string into substrings and then
 * convert each substring to a value for a single bit. If the bits are b0, b1, b2,
 * and b3, the decimal equivalent is 8b0+ 4b1+ 2b2+ b3.)
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4 bits binary number: ");
        String binary = scanner.next();

        int decimal = 0;
        int start = 8;
        decimal += Integer.parseInt(binary.charAt(0) + "") * start;
        start /= 2;
        decimal += Integer.parseInt(binary.charAt(1) + "") * start;
        start /= 2;
        decimal += Integer.parseInt(binary.charAt(2) + "") * start;
        start /= 2;
        decimal += Integer.parseInt(binary.charAt(3) + "") * start;

        System.out.println("The decimal representation for " + binary + " is " + decimal);
    }
}
