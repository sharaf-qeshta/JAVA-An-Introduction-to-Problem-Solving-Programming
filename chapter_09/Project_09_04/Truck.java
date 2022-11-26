package chapter_09;

public class Truck extends Vehicle
{
    private double loadCapacity;
    private double towingCapacity;

    public Truck() { }

    public Truck(String manufacturer, int cylindersInEngine,
                 Person owner, double loadCapacity, double towingCapacity)
            throws CylinderException, LoadException, TowingException
    {
        super(manufacturer, cylindersInEngine, owner);
        setLoadCapacity(loadCapacity);
        setTowingCapacity(towingCapacity);
    }

    public double getLoadCapacity()
    {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) throws LoadException
    {
        if (loadCapacity < 1 || loadCapacity > 10)
            throw new LoadException("Load must be in the range of 1 to 10");
        this.loadCapacity = loadCapacity;
    }

    public double getTowingCapacity()
    {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) throws TowingException
    {
        if (towingCapacity < 1 || towingCapacity > 20)
            throw new TowingException("Towing Capacity must be in the range 1 to 20");
        this.towingCapacity = towingCapacity;
    }


    public boolean equals(Truck truck)
    {
        return super.equals(truck)
                && truck.getLoadCapacity() == getLoadCapacity()
                && truck.getTowingCapacity() == getTowingCapacity();
    }
}
