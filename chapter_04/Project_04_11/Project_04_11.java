package chapter_04;


import java.util.Scanner;

/**
 * 11. Your country is at war and your enemies are using a secret code to
 * communicate with one another. You have managed to intercept a message
 * that reads as follows:
 *  :mmZ\dxZmx]Zpgy
 * The message is obviously encrypted using the enemy’s secret code. You
 * have just learned that their encryption method is based upon the ASCII
 * code (see Appendix 7). Individual characters in a string are encoded using
 * this system. For example, the character ‘A’ is encoded using the number 65
 * and ‘B’ is encoded using the number 66. Your enemy’s secret code takes
 * each letter of the message and encrypts it as follows:
 *  if (OriginalChar + Key > 126) then
 *  EncryptedChar = 32 + ((OriginalChar + Key) − 127)
 *  else
 *  EncryptedChar = (OriginalChar + Key)
 * For example, if the enemy uses Key = 10 then the message “Hey” would
 * initially be represented as:
 * Character ASCII code
 * H 72
 * e 101
 * y 121
 * And “Hey” would be encrypted as:
 * Encrypted H = (72 + 10) = 82 = R in ASCII
 * Encrypted e = (101 + 10) = 111 = o in ASCII
 * Encrypted y = 32 + ((121 + 10) − 127) = 36 = $ in ASCII
 * Consequently, “Hey” would be transmitted as “Ro$.” Write a Java program
 * that decrypts the intercepted message. You only know that the key used is
 * a number between 1 and 100. You can assume that the original message
 * consists entirely of ASCII codes that represent only printable characters.
 * Your program should try to decode the message using all possible keys
 * between 1 and 100. When you try the valid key, the message will make
 * sense. For all other keys, the message will appear as gibberish. Since there
 * are only 100 keys this would obviously be a pretty crummy encryption
 * system. This Programming Project will require you to explore a bit on
 * your own how to convert from a char to a number, process the number,
 * then convert it back to a char. See Chapter 2 for String methods. You will
 * want to use charAt().
 * Important: Note that the secret code has a \ so you will need to escape
 * encode it by using \\ if you hard-code it in your program.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_11
{
    // :mmZ\dxZmx]Zpgy stands for !TTACK_AT_DAWN`
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the encrypted message: ");
        String encrypted = scanner.next();
        System.out.println(encrypted);

        System.out.println("Possible Decryption\n");
        for (int key = 1; key < 101; key++)
        {
            String decrypted = "";
            for (int j = 0; j < encrypted.length(); j++)
            {
                int intChar = (int) encrypted.charAt(j);

                if (intChar - key < 32)
                    decrypted += (char) (intChar + 95 - key);
                else
                    decrypted += (char) (intChar - key);

            }
            System.out.println(decrypted);
        }
    }
}
