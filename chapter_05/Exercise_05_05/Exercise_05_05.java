package chapter_05;

/**
 * 5. Consider a Java class that you could use to get an acceptable integer value
 * from the user. An object of this class will have the attributes
 * • Minimum accepted value
 * • Maximum accepted value
 * • Prompt string
 * and the following method:
 * • getValue displays the prompt and reads a value using the class Scanner.
 * If the value read is not within the allowed range, the method should
 * display an error message and ask the user for a new value, repeating
 * these actions until an acceptable value is entered. The method then
 * returns the value read.
 * a. Write preconditions and postconditions for the method getValue.
 * b. Implement the class in Java.
 * c. Write some Java statements that test the class.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_05_05
{
    public static void main(String[] args)
    {
        Reader reader = new Reader();
        System.out.println(reader.getValue());
    }
}
