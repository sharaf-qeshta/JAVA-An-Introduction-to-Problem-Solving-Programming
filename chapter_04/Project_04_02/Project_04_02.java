package chapter_04;


import java.util.Scanner;

/**
 * 2. For all of the following words, if you move the first letter to the end of the
 * word, and then spell the result backwards, you will get the original word:
 * banana dresser grammar potato revive uneven assess
 * Write a program that reads a word and determines whether it has this
 * property. Continue reading and testing words until you encounter the
 * word quit. Treat uppercase letters as lowercase letters.
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next().trim().toLowerCase();

        while (!word.equals("quit"))
        {
            int i = 1;
            boolean hasTheProperty = true;
            for (int j = word.length()-1; j > 0; j--, i++)
            {
                if (word.charAt(i) != word.charAt(j))
                {
                    System.out.println("The word does not have the property!");
                    hasTheProperty = false;
                    break;
                }
            }

            if (hasTheProperty)
                System.out.println("The word " + word + " have the property!");
            System.out.print("Enter a word: ");
            word = scanner.next().trim().toLowerCase();
        }
    }
}
