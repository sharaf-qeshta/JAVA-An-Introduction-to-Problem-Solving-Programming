package chapter_09;

public class TripComputer
{
    private double totalTime;
    private boolean restStopTaken;


    public TripComputer()
    {
        totalTime = 0.0;
        restStopTaken =  true;
    }

    public void computeLegTime(double distance, double speed)
            throws TripComputerException
    {
        if(distance <=0)
            throw new TripComputerException("Negative distance not allowed");

        if(speed <=0)
            throw new TripComputerException("Negative speed not allowed");

        double legTime = distance / speed;

        totalTime += legTime;
        restStopTaken = false;
    }

    public void takeRestStop(double time)
            throws TripComputerException
    {
        if(time <=0)
            throw new TripComputerException("Negative time not allowed");
        if(restStopTaken)
            throw new TripComputerException("Can not take another rest stop");
        totalTime += time;
        restStopTaken = true;
    }

    public double getTripTime()
    {
        return totalTime;
    }
}
