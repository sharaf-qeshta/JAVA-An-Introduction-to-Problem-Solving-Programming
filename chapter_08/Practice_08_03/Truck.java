package chapter_08;

public class Truck extends Vehicle
{
    private double loadCapacity;
    private double towingCapacity;

    public Truck() { }

    public Truck(String manufacturer, int cylindersInEngine,
                 Person owner, double loadCapacity, double towingCapacity)
    {
        super(manufacturer, cylindersInEngine, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public double getLoadCapacity()
    {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity)
    {
        this.loadCapacity = loadCapacity;
    }

    public double getTowingCapacity()
    {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity)
    {
        this.towingCapacity = towingCapacity;
    }


    public boolean equals(Truck truck)
    {
        return super.equals(truck)
                && truck.getLoadCapacity() == getLoadCapacity()
                && truck.getTowingCapacity() == getTowingCapacity();
    }
}
