package chapter_04;

/**
 * 9. Write a loop that will create a new string that is the reverse of a given
 * string.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_09
{
    public static void main(String[] args)
    {
        String word = "Sharaf Qeshta";
        String reverse = "";

        for (int i = word.length()-1; i > -1; i--)
            reverse += word.charAt(i);

        System.out.println(reverse); // athseQ farahS
    }
}
