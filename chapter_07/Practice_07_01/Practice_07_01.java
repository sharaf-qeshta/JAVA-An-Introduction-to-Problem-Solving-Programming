package chapter_07;

import java.util.Scanner;

/**
 * 1. Write a program that reads integers, one per line, and displays their
 * product. Also, display all the numbers read, each with an annotation
 * giving its percentage contribution to the product. Use a method that takes
 * the entire array as one argument and returns the product of the numbers
 * in the array. (Hint: Ask the user for the number of integers to be entered,
 * create an array of that length, and then fill the array with the integers
 * read.) A possible dialogue between the program and the user follows:
 *
 * How many numbers will you enter?
 * 4
 * Enter 4 integers, one per line:
 * 2
 * 1
 * 1
 * 2
 * The product is 4.
 * The numbers are:
 * 2, which is 50% of the product.
 * 1, which is 25% of the product.
 * 1, which is 25% of the product.
 * 2, which is 50% of the product.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_07_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you enter? ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        System.out.println("Enter " +  length + " integers, one per line:");
        for (int i = 0; i < length; i++)
            array[i] = scanner.nextInt();

        int product = getProduct(array);
        System.out.println("The product is " + product + ".");
        for (int value: array)
        {
            int percentage = (int) (((value + 0.0) / product) * 100);
            System.out.println(value + ", which is " + percentage + "% of the product.");
        }
    }

    public static int getProduct(int[] array)
    {
        int product = 1;
        for (int value: array)
            product *= value;
        return product;
    }
}
