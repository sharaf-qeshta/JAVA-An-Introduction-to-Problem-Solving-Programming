package chapter_08;

/**
 * 17. Create a class ShuffleCipher that implements the interface
 * MessageEncoder, as described in Exercise 15. The constructor should have
 * one parameter called n. Define the method encode so that the message is
 * shuffled n times. To perform one shuffle, split the message in half and
 * then take characters from each half alternately. For example, if the message
 * is abcdefghi, the halves are abcde and fghi. The shuffled message is
 * afbgchdie. (Hint: You may wish to define a private method that performs
 * one shuffle.)
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_08_17
{
    public static void main(String[] args)
    {
        ShuffleCipher shuffleCipher1 = new ShuffleCipher(1);
        System.out.println(shuffleCipher1.encode("abcdefghi")); // afbgchdie

        ShuffleCipher shuffleCipher2 = new ShuffleCipher(5);
        System.out.println(shuffleCipher2.encode("abcdefghi")); // acegibdfh
    }
}
