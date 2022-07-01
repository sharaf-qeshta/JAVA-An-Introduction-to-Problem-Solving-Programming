package chapter_04;

/**
 * 8. Write a loop that will count the number of blank characters in a given
 * string.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_08
{
    public static void main(String[] args)
    {
        String word = "     Sharaf Qeshta     ";
        int blanks = 0;
        for (int i = 0; i < word.length(); i++)
            blanks += ((word.charAt(i) + "").isBlank())? 1 : 0;

        System.out.println("The number of blanks in " + word + " is " + blanks);
    }
}
