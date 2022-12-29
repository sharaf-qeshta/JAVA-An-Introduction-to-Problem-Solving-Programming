package chapter_10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 7. Write a class ContactInfo to store contact information for a person. It
 * should have attributes for a person’s name, business phone, home phone,
 * cell phone, e-mail address, and home address. It should have a toString
 * method that returns this data as a string, making appropriate replacements
 * for any attributes that do not have values. It should have a constructor
 * ContactInfo(aString) that creates and returns a new instance of the
 * class, using data in the string aString. The constructor should use a format
 * consistent with what the toString method produces.
 * Using a text editor, create a text file of contact information, as described in
 * the previous paragraph, for several people. Write a program that reads this
 * file, displays the data on the screen, and creates an array whose base type
 * is ContactInfo. Allow the user to do one of the following: change some
 * data in one contact, add a contact, or delete a contact. Finally, write over
 * the file with the modified contacts.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_07
{
    private static final String FILE_NAME = "Exercise_10_07.txt";

    public static void main(String[] args)
    {
        ContactInfo[] contacts = new ContactInfo[100];
        int i = 0;

        try (Scanner scanner = new Scanner(new File(FILE_NAME)))
        {
            while (scanner.hasNext())
            {
                contacts[i++] = new ContactInfo(scanner.nextLine());
                System.out.println((i-1) + "- " + contacts[i-1].toString());
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("choose delete, modify or add: ");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("delete"))
        {
            System.out.println("Enter Index: ");
            int index = scanner.nextInt();
            contacts[index] = null;
        }
        else if (choice.equals("modify"))
        {
            System.out.println("Enter Index");
            int index = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter name: ");
            contacts[index].setName(scanner.nextLine());
            System.out.println("Enter business phone: ");
            contacts[index].setBusinessPhone(scanner.nextLine());
            System.out.println("Enter home phone: ");
            contacts[index].setHomePhone(scanner.nextLine());
            System.out.println("Enter cell phone: ");
            contacts[index].setCellPhone(scanner.nextLine());
            System.out.println("Enter email: ");
            contacts[index].setEmail(scanner.nextLine());
            System.out.println("Enter address: ");
            contacts[index].setAddress(scanner.nextLine());
        }
        else
        {
            ContactInfo contact = new ContactInfo();
            System.out.println("Enter name: ");
            contact.setName(scanner.nextLine());
            System.out.println("Enter business phone: ");
            contact.setBusinessPhone(scanner.nextLine());
            System.out.println("Enter home phone: ");
            contact.setHomePhone(scanner.nextLine());
            System.out.println("Enter cell phone: ");
            contact.setCellPhone(scanner.nextLine());
            System.out.println("Enter email: ");
            contact.setEmail(scanner.nextLine());
            System.out.println("Enter address: ");
            contact.setAddress(scanner.nextLine());
            contacts[i] = contact;
        }

        try (PrintWriter writer = new PrintWriter(new File(FILE_NAME)))
        {
            for (ContactInfo contact : contacts)
                if (contact != null)
                    writer.write(contact.toString() + "\n");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
