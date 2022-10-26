package chapter_08;

/**
 * 1. Define a class named Employee whose objects are records for employees.
 * Derive this class from the class Person given in Listing 8.1. An employee
 * record inherits an employee’s name from the class Person. In addition, an
 * employee record contains an annual salary represented as a single value of
 * type double, a hire date that gives the year hired as a single value of type
 * int, and an identification number that is a value of type String. Give
 * your class a reasonable complement of constructors, accessor methods,
 * and mutator methods, as well as an equals method. Write a program to
 * fully test your class definition
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_08_01
{
    public static void main(String[] args)
    {
        Person person1 = new Employee("Sharaf Qeshta",
                120_000, 2023, "1");
        Person person2 = new Employee("John Smith",
                200_000, 2018, "2");

        System.out.println(person1.equals(person2)); // false
    }
}
