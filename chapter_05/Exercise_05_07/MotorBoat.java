package chapter_05;

public class MotorBoat
{
    private double tankCapacity = 120;
    private double currentFuel;
    private double maxSpeed = 80;
    private double currentSpeed;
    private double motorEfficiency = 0.5;
    private double distanceTraveled;

    /**
     * Precondition: newSpeed must be less than maxSpeed
     * <p>
     * Postcondition: the value of newSpeed will be the
     * currentSpeed
     */
    public void changeSpeed(double newSpeed)
    {
        currentSpeed = newSpeed;
    }


    /**
     * Precondition: the time should affordable by the
     * current capabilities of the object (currentSpeed,
     * currentFuel and motorEfficiency)
     * <p>
     * Postcondition: the distance traveled during this time
     * will be added to distance traveled and the fuel consumed
     * during the same period will be decremented from currentFuel
     */
    public void operate(double time)
    {
        distanceTraveled += time * currentSpeed;
        currentFuel -= motorEfficiency * currentSpeed * currentSpeed * time;
    }


    /**
     * Precondition: amount should fit in the tank
     * <p>
     * Postcondition: the amount of fuel will be added to the
     * current fuel
     */
    public void fill(double amount)
    {
        currentFuel += amount;
    }

    /**
     * Precondition: ?
     * <p>
     * Postcondition: returning the current fuel in the tank
     */
    public double getCurrentFuel()
    {
        return currentFuel;
    }

    /**
     * Precondition: ?
     * <p>
     * Postcondition: returning distance traveled by the boat
     */
    public double getDistanceTraveled()
    {
        return distanceTraveled;
    }

}
