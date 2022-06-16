package chapter_02;

import java.util.Scanner;

/**
 * 4. Write a program that asks the user to enter a favorite color, a favorite food,
 * a favorite animal, and the first name of a friend or relative. The program
 * should then print the following two lines, with the user’s input replacing
 * the items in italics:
 * I had a dream that Name ate a Color Animal
 * and said it tasted like Food!
 * For example, if the user entered blue for the color, hamburger for the food,
 * dog for the animal, and Jake for the person’s name, the output would be
 * I had a dream that Jake ate a blue dog
 * and said it tasted like hamburger!
 * Don’t forget to put the exclamation mark at the end.
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_04
{
    public static final String CONTEXT = "I had a dream that Name ate a Color Animal\n" +
                                            "and said it tasted like Food!";
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = "\033[3m" + scanner.nextLine() + "\033[0m";

        System.out.println("Enter Animal: ");
        String animal = "\033[3m" + scanner.nextLine() + "\033[0m";

        System.out.println("Enter Color: ");
        String color = "\033[3m" + scanner.nextLine() + "\033[0m";

        System.out.println("Enter Food: ");
        String food = "\033[3m" + scanner.nextLine() + "\033[0m";
        System.out.println("\033[3mText goes here\033[0m");

        String output = CONTEXT.replace("Name", name)
                .replace("Color", color)
                .replace("Animal", animal)
                .replace("Food", food);
        System.out.println(output);
    }
}
