package chapter_08;

public class Dog extends Pet
{
    private String breed;
    private boolean boosterShot;

    public Dog(String initialName,
               int initialAge, double initialWeight,
               String breed, boolean boosterShot)
    {
        super(initialName, initialAge, initialWeight);
        this.breed = breed;
        this.boosterShot = boosterShot;
    }

    public Dog() { }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public boolean isBoosterShot()
    {
        return boosterShot;
    }

    public void setBoosterShot(boolean boosterShot)
    {
        this.boosterShot = boosterShot;
    }

    public boolean equals(Dog dog)
    {
        return super.equals(dog)
                && dog.getBreed().equals(getBreed())
                && dog.isBoosterShot() == isBoosterShot();
    }
}
