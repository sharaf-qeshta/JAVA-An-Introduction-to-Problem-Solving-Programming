package chapter_06;

import java.util.Scanner;

/**
 * 3. Using the class Pet from Listing 6.1, write a program to read data for five
 * pets and display the following data: name of smallest pet, name of largest
 * pet, name of oldest pet, name of youngest pet, average weight of the five
 * pets, and average age of the five pets.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_06_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pet1 name: ");
        String name = scanner.nextLine();

        System.out.print("Enter pet1 age: ");
        int age = scanner.nextInt();

        System.out.print("Enter pet1 weight: ");
        double weight = scanner.nextDouble();

        Pet pet1 = new Pet(name, age, weight);

        Pet smallest = pet1;
        Pet largest = pet1;
        Pet youngest = pet1;
        Pet oldest = pet1;
        double weightsSum = pet1.getWeight();
        int ageSum = pet1.getAge();

        for (int i = 2; i < 6; i++)
        {
            scanner.nextLine();
            System.out.print("Enter pet1 name: ");
            name = scanner.nextLine();

            System.out.print("Enter pet1 age: ");
            age = scanner.nextInt();

            System.out.print("Enter pet1 weight: ");
            weight = scanner.nextDouble();

            Pet pet2 = new Pet(name, age, weight);

            if (smallest.getWeight() > pet2.getWeight())
                smallest = pet2;
            if (largest.getWeight() < pet2.getWeight())
                largest = pet2;
            if (youngest.getAge() > pet2.getAge())
                youngest = pet2;
            if (oldest.getAge() < pet2.getAge())
                oldest = pet2;
            weightsSum += weight; ageSum += age;
        }

        System.out.println("The smallest pet name " + smallest.getName());
        System.out.println("The largest pet name " + largest.getName());
        System.out.println("The youngest pet name " + youngest.getName());
        System.out.println("The oldest pet name " + oldest.getName());
        System.out.println("The average weight is " + weightsSum/5);
        System.out.println("The average age is " + ageSum/5);
    }
}
