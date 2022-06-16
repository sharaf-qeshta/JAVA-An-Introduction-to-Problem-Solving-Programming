package chapter_02;

import java.util.Scanner;

/**
 * 3. Write a program that will read a line of text as input and then display the
 * line with the first word moved to the end of the line. For example, a
 * possible sample interaction with the user might be
 * Enter a line of text. No punctuation please.
 * Java is the language
 * I have rephrased that line to read:
 * Is the language Java
 * Assume that there is no space before the first word and that the end of the
 * first word is indicated by a blank, not by a comma or other punctuation.
 * Note that the new first word must begin with a capital letter.
 *
 * @author Sharaf Qeshta
 * */
public class Project_02_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text. No punctuation please.");
        String line = scanner.nextLine();

        String firstWord = line.substring(0, line.indexOf(' ')+1);
        line = line.replaceFirst(firstWord, "");
        line = line.replaceFirst(line.charAt(0) + "",
                Character.toUpperCase(line.charAt(0))+ "");
        System.out.println("I have rephrased that line to read:");
        System.out.println(line + " " + firstWord);
    }
}
