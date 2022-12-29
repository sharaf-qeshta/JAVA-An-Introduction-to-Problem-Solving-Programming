package chapter_10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 6. Write a class TelephoneNumber that will hold a telephone number. An
 * object of this class will have the attributes
 * • areaCode—a three-digit integer
 * • exchangeCode—a three-digit integer
 * • number—a four-digit integer
 * and the methods
 * • TelephoneNumber(aString)—a constructor that creates and returns a
 * new instance of its class, given a string in the form xxx–xxx–xxxx or, if
 * the area code is missing, xxx–xxxx. Throw an exception if the format is
 * not valid. (Hint: To simplify the constructor, you can replace each
 * hyphen in the telephone number with a blank. To accept a telephone
 * number containing hyphens, you could process the string one character
 * at a time or learn how to use Scanner to read words separated by a
 * character—such as a hyphen—other than whitespace.)
 * • toString—returns a string in either of the two formats shown previously
 * for the constructor.
 * Using a text editor, create a text file of several telephone numbers, using
 * the two formats described previously. Write a program that reads this
 * file, displays the data on the screen, and creates an array whose base
 * type is TelephoneNumber. Allow the user to either add or delete one
 * telephone number. Write the modified data on the text file, replacing
 * its original contents. Then read and display the numbers in the
 * modified file.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_06
{
    private static final String FILE_NAME = "Exercise_10_06.txt";

    public static void main(String[] args)
    {
        TelephoneNumber[] telephoneNumbers = new TelephoneNumber[100];

        int j = 0;
        try (Scanner reader = new Scanner(new File(FILE_NAME)))
        {
            while (reader.hasNext())
                telephoneNumbers[j++] = new TelephoneNumber(reader.nextLine().trim());
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        for (int i = 0; i < 100 && telephoneNumbers[i] != null; i++)
            System.out.println(telephoneNumbers[i]);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Delete or Add? ");
        if (scanner.next().toLowerCase().equals("add"))
        {
            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.next();
            try
            {
                telephoneNumbers[j] = new TelephoneNumber(phoneNumber);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        else
        {
            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.next();
            int index = -1;
            for (int i = 0;
                 i < telephoneNumbers.length
                         && telephoneNumbers[i] != null; i++)
                if (phoneNumber.equals(telephoneNumbers[i].toString()))
                {
                    index = i;
                    break;
                }
            if (index != -1)
                telephoneNumbers[index] = null;
        }

        try (PrintWriter writer = new PrintWriter(new File(FILE_NAME)))
        {
            for (TelephoneNumber number: telephoneNumbers)
                if (number != null)
                    writer.write(number.toString() + "\n");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
