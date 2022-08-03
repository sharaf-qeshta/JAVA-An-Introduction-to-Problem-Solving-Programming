package chapter_05;

public class Person
{
    private String name;
    private int age;

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
}
