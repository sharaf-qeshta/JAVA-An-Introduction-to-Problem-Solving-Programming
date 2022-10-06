package chapter_07;

import java.util.Scanner;

/**
 * 13. Practice Program 2 used two arrays to implement a simple phone book. A
 * more scalable solution is to make an array of an object that stores the
 * name and corresponding phone number. Modify the program to use a
 * single array of an object. The output should remain the same.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_13
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        PhoneBook[] phoneBooks =
                {
                    new PhoneBook("Michael Myers", "333-8000"),
                    new PhoneBook("Ash Williams", "333-2323"),
                    new PhoneBook("Jack Torrance", "333-6150"),
                    new PhoneBook("Freddy Krueger", "339-7970")
                };

        System.out.println("Enter name to look up.");
        String targetName = kbd.nextLine();
        String targetPhone = lookupName(targetName, phoneBooks);
        System.out.println("The phone number is " + targetPhone);
    }

    public static String lookupName(String targetName, PhoneBook[] phoneBooks)
    {
        for (int i = 0; i < phoneBooks.length; i++)
        {
            if (phoneBooks[i].name.equals(targetName))
                return phoneBooks[i].phoneNumber;
        }
        return "";
    }
}
