package chapter_06;

/**
 * 2. Repeat Programming Project 2 in Chapter 5. This time, add the following
 * four constructor methods: one for each instance variable, one with two
 * parameters for the two instance variables, and a default constructor. Be
 * sure that each constructor sets all of the instance variables. Write a driver
 * program to test each of the methods, including each of the four constructors
 * and at least one true and one false case for each of the test methods.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_06_02
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Sharaf Qeshta");
        person1.setAge(21);

        Person person2 = new Person(22);
        person2.setName("John Smith");

        Person person3 = new Person("Nikola Tesla", 86);

        Person person4 = new Person();
        Person person5 = new Person();


        System.out.println(person1.equals(person2)); // false
        System.out.println(person4.equals(person5)); // true

        System.out.println(person1.younger(person2)); // true
        System.out.println(person3.younger(person2)); // false

        System.out.println(person1.older(person2)); // false
        System.out.println(person3.older(person2)); // true
    }
}
