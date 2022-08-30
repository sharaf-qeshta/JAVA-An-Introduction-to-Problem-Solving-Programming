package chapter_06;

public class Person
{
    private String name;
    private int age;

    public Person(String name)
    {
        this.name = name;
        age = 0;
    }

    public Person(int age)
    {
        this.age = age;
        name = "No name yet";
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Person()
    {
        name = "No name yet";
        age = 0;
    }

    public void setName(String newName)
    {
        name = newName;
    }


    public void setAge(int newAge)
    {
        if (newAge >= 0)
            age = newAge;
        else
        {
            System.out.println("ERROR: Age is " +
                    "negative.");
            System.exit(0);
        }
    }


    public void setPerson(String newName, int newAge)
    {
        setName(newName);
        setAge(newAge);
    }


    public String getName()
    {
        return name;
    }


    public int getAge()
    {
        return age;
    }

    public boolean equals(Person otherPerson)
    {
        return otherPerson.getAge() == getAge()
                && otherPerson.getName().equals(getName());
    }


    public boolean sameName(Person otherPerson)
    {
        return getName().equals(otherPerson.getName());
    }


    public boolean sameAge(Person otherPerson)
    {
        return getAge() == otherPerson.getAge();
    }


    public boolean older(Person otherPerson)
    {
        return getAge() > otherPerson.getAge();
    }


    public boolean younger(Person otherPerson)
    {
        return !older(otherPerson);
    }


    public static Person createToddler()
    {
        return new Person("A toddler", 2);
    }


    public static Person createPreschooler()
    {
        return new Person("A preschooler", 5);
    }


    public static Person createAdolescent()
    {
        return new Person("An createAdolescent", 9);
    }


    public static Person createTeenager()
    {
        return new Person("A teenager", 15);
    }
}
