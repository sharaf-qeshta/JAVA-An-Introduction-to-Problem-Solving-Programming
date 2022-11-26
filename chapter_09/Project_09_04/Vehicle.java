package chapter_09;

public class Vehicle
{
    private String manufacturer;
    private int cylindersInEngine;
    private Person owner;

    public Vehicle() { }

    public Vehicle(String manufacturer,
                   int cylindersInEngine, Person owner) throws CylinderException
    {
        this.manufacturer = manufacturer;
        setCylindersInEngine(cylindersInEngine);
        this.owner = owner;
    }


    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public int getCylindersInEngine()
    {
        return cylindersInEngine;
    }

    public void setCylindersInEngine(int cylindersInEngine) throws CylinderException
    {
        if (cylindersInEngine < 1 || cylindersInEngine > 12)
            throw new CylinderException("the cylinders in engine must be in the range 1 to 12");
        this.cylindersInEngine = cylindersInEngine;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }

    public boolean equals(Vehicle vehicle)
    {
        return vehicle.getManufacturer().equals(getManufacturer())
                && vehicle.getOwner().equals(getOwner())
                && vehicle.getCylindersInEngine() == getCylindersInEngine();
    }
}
