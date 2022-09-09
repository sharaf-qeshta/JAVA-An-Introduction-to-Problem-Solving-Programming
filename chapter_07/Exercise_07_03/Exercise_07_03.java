package chapter_07;

import java.util.Scanner;

/**
 * 3. Write a program in a class RichCount that counts the number of families
 * that are considered rich. Write and use a class Family that has the attributes
 * • income—a double value that is the income for the family
 * • size—the number of people in the family
 * and the following methods:
 * • Family(income, size)—a constructor that sets the attributes
 * • isRich(exp, sav)—a method that returns true if exp + sav * size is
 * greater than 60% of the family income (sav is the average savings of an
 * individual, while exp is the expenditure done on the family)
 * • toString—a method that returns a string containing the information
 * about the family
 * The program should read an integer k from the keyboard and then create an
 * array of size k whose base type is Family. It should then create k objects of
 * type Family and put them in the array, reading the income and size for each
 * family from the keyboard. After reading an average expenditure and average
 * savings from the keyboard, it should display the families that are rich.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of families: ");
        int familiesCount = scanner.nextInt();

        Family[] families = new Family[familiesCount];
        Boolean[] richFamilies = new Boolean[familiesCount];
        for (int i = 0; i < familiesCount; i++)
        {
            System.out.print("Enter Family " + (i+1) + " Income: ");
            double income = scanner.nextDouble();

            System.out.print("Enter Family " + (i+1) + " Size: ");
            int size = scanner.nextInt();

            System.out.print("Enter Family " + (i+1) + " Expenditure: ");
            double expenditure = scanner.nextDouble();

            System.out.print("Enter Family " + (i+1) + " Saving per member: ");
            double saving = scanner.nextDouble();

            families[i] = new Family(income, size);
            richFamilies[i] = families[i].isRich(expenditure, saving);
        }

        System.out.println("Families that are rich: ");
        for (int i = 0; i < familiesCount; i++)
            if (richFamilies[i])
                System.out.println(families[i]);
    }
}
