package chapter_02;


/**
 * 8. Repeat the previous exercise, but find the second last word in the string
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_08
{
    public static void main(String[] args)
    {
        String phrase = "Hello, my good friend!";
        String lastWord = phrase.substring(phrase.lastIndexOf(" "));
        String newPhrase = phrase.replace(lastWord, "");
        lastWord = newPhrase.substring(newPhrase.lastIndexOf(" ")+1);

        /* The second last word in the phrase "Hello, my good friend!" is "good" */
        System.out.println("The second last word in the phrase \"" + phrase + "\" is \"" + lastWord + "\"" );
    }
}
