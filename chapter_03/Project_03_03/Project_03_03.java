package chapter_03;

import java.util.Scanner;

/**
 * 3. Suppose that we are working for an online service that provides a bulletin
 * board for its users. We would like to give our users the option of filtering
 * out profanity. Suppose that we consider the words cat, dog, and llama to be
 * profane. Write a program that reads a string from the keyboard and tests
 * whether the string contains one of our profane words. Your program
 * should find words like cAt that differ only in case. Option: As an extra
 * challenge, have your program reject only lines that contain a profane word
 * exactly. For example, Dogmatic concatenation is a small category should not
 * be considered profane.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();
        phrase = " " + phrase.toLowerCase() + " ";

        if (phrase.contains(" cat ") || phrase.contains(" dog ")
                || phrase.contains(" llama "))
            System.out.println("the phrase is profane");
        else
            System.out.println("the phrase is not profane");
    }
}
