package chapter_02;


/**
 * 7. Write some Java statements that use the String methods lastIndexOf and
 * substring to find the last word in a string. We define word to be a string of
 * characters that does not include whitespace. For example, the last word of the
 * string
 * "Hello, my good friend!"
 * is the string "friend!"
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_07
{
    public static void main(String[] args)
    {
        String phrase = "Hello, my good friend!";
        String lastWord = phrase.substring(phrase.lastIndexOf(" ")+1);

        /* The last word in the phrase "Hello, my good friend!" is "friend!" */
        System.out.println("The last word in the phrase \"" + phrase + "\" is \"" + lastWord + "\"" );
    }
}
