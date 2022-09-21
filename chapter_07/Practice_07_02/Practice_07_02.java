package chapter_07;

import java.util.Scanner;

/**
 * 2. The following code creates a small phone book. An array is used to store a
 * list of names and another array is used to store the phone numbers that go
 * with each name. For example, Michael Myers’ phone number is 333-8000
 * and Ash Williams’ phone number is 333-2323.
 * Write the method lookupName so the code properly looks up and returns
 * the phone number for the input target name. lookupName should return a
 * blank string if the name is not in the phone book.
 * Scanner kbd = new Scanner(System.in);
 * String[] names = {"Michael Myers", "Ash Williams",
 *  "Jack Torrance", "Freddy Krueger"};
 * String[] phoneNumbers = {"333-8000","333-2323",
 *  "333-6150","339-7970"};
 * System.out.println("Enter name to look up.");
 * String targetName = kbd.nextLine();
 * String targetPhone = lookupName(targetName, names,
 *  phoneNumbers);
 * System.out.println("The phone number is " + targetPhone);
 * Programming Project 13 asks you to rewrite this program using an array of
 * a single object. The object-based approach is more scalable than this
 * approach, which requires a separate array to be managed for every property
 * of the phone contact.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_07_02
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        String[] names = {"Michael Myers", "Ash Williams",
                "Jack Torrance", "Freddy Krueger"};
        String[] phoneNumbers = {"333-8000","333-2323",
                "333-6150","339-7970"};

        System.out.println("Enter name to look up.");
        String targetName = kbd.nextLine();
        String targetPhone = lookupName(targetName, names, phoneNumbers);
        System.out.println("The phone number is " + targetPhone);
    }

    public static String lookupName(String targetName, String[] names,
                                    String[] phoneNumbers)
    {
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equals(targetName))
                return phoneNumbers[i];
        }
        return "";
    }
}
