package chapter_07;

import java.util.Scanner;

/**
 * 5. Write a program in a class VowelFrequency that counts the number of
 * times a vowel appears in a word. Your program should create an array of
 * size 5 that will hold the count for each of the five vowels. Read a word
 * from the keyboard as a string. Examine each vowel in the word and
 * increment the appropriate count in the array. Display the contents of the
 * array. Ignore the case while making checks.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_05
{
    public static void main(String[] args)
    {
        /*
        * Enter a word: Welcome
        * A : 0
        * E : 2
        * I : 0
        * O : 1
        * U : 0
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next().toUpperCase();

        // better method
        int[] count = new int[256]; // Ascii characters
        for (int i = 0; i < word.length(); i++)
            count[word.charAt(i)] += 1;

        System.out.println("A : " + count['A']);
        System.out.println("E : " + count['E']);
        System.out.println("I : " + count['I']);
        System.out.println("O : " + count['O']);
        System.out.println("U : " + count['U']);
    }
}