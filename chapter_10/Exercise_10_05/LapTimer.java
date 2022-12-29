package chapter_10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Calendar;

public class LapTimer
{
    private boolean running;
    private long startTime, lapStart, lapTime, totalTime;
    private int lapsCompleted;
    private int lapsInRace;
    private PrintWriter writer;

    public LapTimer(int n, String person, String fileName)
            throws Exception
    {
        writer = new PrintWriter(new File(fileName));
        lapsInRace = n;
        writer.write(person + "\n");
    }

    public LapTimer(int n)
    {
        lapsInRace = n;
    }

    public void start() throws Exception
    {
        if (running)
            throw new Exception("The race is already starting");

        startTime = Calendar.getInstance().getTimeInMillis() / 1000;
        lapStart = startTime;
        running = true;
    }

    public void markLap() throws Exception
    {
        if (lapsInRace == 0)
            throw new Exception("The race is finished");

        lapTime = Calendar.getInstance().getTimeInMillis() - lapStart;
        totalTime += lapTime;
        lapStart = Calendar.getInstance().getTimeInMillis() / 1000;
        lapsInRace--; lapsCompleted++;
    }

    public long getLapTime() throws Exception
    {
        if (lapsCompleted == 0)
            throw new Exception("The first lab not finished yet");
        return lapTime;
    }

    public long getTotalTime() throws Exception
    {
        if (lapsCompleted == 0)
            throw new Exception("The first lab not finished yet");
        return totalTime;
    }

    public int getLapsRemaining()
    {
        return lapsInRace - lapsCompleted;
    }
}
