package chapter_08;

/**
 * 5. Create an interface MessageDecoder that has a single abstract method
 * decode(cipherText), where cipherText is the message to be decoded.
 * The method will return the decoded message. Modify the classes
 * SubstitutionCipher and ShuffleCipher, as described in Exercises 16
 * and 17, so that they implement MessageDecoder as well as the interface
 * MessageEncoder that Exercise 15 describes. Finally, write a program that
 * allows a user to encode and decode messages entered on the keyboard.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_05
{
    public static void main(String[] args)
    {
        SubstitutionCipher substitutionCipher = new SubstitutionCipher(3);
        String cipher = substitutionCipher.encode("Sharaf Qeshta");
        System.out.println(cipher); // Vkdudi#Thvkwd
        System.out.println(substitutionCipher.decode(cipher)); // Sharaf Qeshta

        ShuffleCipher shuffleCipher = new ShuffleCipher(3);
        String cipher2 = shuffleCipher.encode("Sharaf Qeshta");
        System.out.println(cipher2); // SfhaQaash tre
        System.out.println(shuffleCipher.decode(cipher2)); // Sharaf Qeshta
    }
}
