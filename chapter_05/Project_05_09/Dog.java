package chapter_05;

public class Dog
{
    private String name;
    private String breed;
    private int age;

    public void writeOutput()
    {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age in calendar years: " +
                age);
        System.out.println("Age in human years: " +
                getAgeInHumanYears());
        System.out.println();
    }


    public int getAgeInHumanYears()
    {
        int humanAge;
        if (age <= 2)
            humanAge = age * 11;
        else
            humanAge = 22 + ((age-2) * 5);
        return humanAge;
    }

    public boolean equals(Dog dog)
    {
        return getAge() == dog.getAge()
                && getName().equals(dog.getName())
                && getBreed().equals(dog.getBreed());
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

