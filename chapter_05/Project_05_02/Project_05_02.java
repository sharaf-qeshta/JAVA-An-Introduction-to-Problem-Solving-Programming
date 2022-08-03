package chapter_05;

/**
 * 2. Add methods to the Person class from Self-Test Question 16 to perform
 * the following tasks:
 * • Set the name attribute of a Person object.
 * • Set the age attribute of a Person object.
 * • Test whether two Person objects are equal (have the same name
 * and age).
 * • Test whether two Person objects have the same name.
 * • Test whether two Person objects are the same age.
 * • Test whether one Person object is older than another.
 * • Test whether one Person object is younger than another.
 * Write a driver (test) program that demonstrates each method, with at least
 * one true and one false case for each of the methods tested.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_02
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        person1.setName("Sharaf Qeshta"); person1.setAge(21);
        person2.setName("John Smith"); person2.setAge(25);
        person3.setName("someone"); person3.setAge(26);
        person4.setName("Sharaf Qeshta"); person4.setAge(21);

        System.out.println(person1.equals(person3)); // false
        System.out.println(person1.equals(person4)); // true

        System.out.println(person1.sameName(person3)); // false
        System.out.println(person1.sameName(person4)); // true

        System.out.println(person1.sameAge(person2)); // false
        System.out.println(person1.sameAge(person4)); // true

        System.out.println(person1.older(person2)); // false
        System.out.println(person3.older(person2)); // true

        System.out.println(person2.younger(person1)); // false
        System.out.println(person1.younger(person3)); // true
    }
}
