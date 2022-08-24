package chapter_06;

public class Person
{
    private String name;
    private int age;


    public Person()
    {
        name = "No name yet";
        age = 0;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static Person createAdult()
    {
        return new Person("An adult", 21);
    }
}
