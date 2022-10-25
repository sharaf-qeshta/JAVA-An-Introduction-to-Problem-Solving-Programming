package chapter_08;

/**
 * 16. Create a class SubstitutionCipher that implements the interface
 * MessageEncoder, as described in the previous exercise. The constructor
 * should have one parameter called shift. Define the method encode so
 * that each letter is shifted by the value in shift. For example, if shift is 3,
 * a will be replaced by d, b will be replaced by e, c will be replaced by f, and
 * so on. (Hint: You may wish to define a private method that shifts a single
 * character.)
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_08_16
{
    public static void main(String[] args)
    {
        SubstitutionCipher substitutionCipher = new SubstitutionCipher(3);
        System.out.println(substitutionCipher.encode("abc")); // def
    }
}
