package chapter_09;

/**
 * 13. Write a class LapTimer that can be used to time the laps in a race. The class
 * should have the following private attributes:
 * • running—a boolean indication of whether the timer is running
 * • startTime—the time when the timer started
 * • lapStart—the timer’s value when the current lap started
 * • lapTime—the elapsed time for the last lap
 * • totalTime—the total time from the start of the race through the last
 * completed lap
 * • lapsCompleted—the number of laps completed so far
 * • lapsInRace—the number of laps in the race
 * The class should have the following methods:
 * • LapTimer(n)—a constructor for a race having n laps.
 * • start—starts the timer. Throws an exception if the race has already
 * started.
 * • markLap—marks the end of the current lap and the start of a new lap.
 * Throws an exception if the race is finished.
 * • getLapTime—returns the time of the last lap. Throws an exception if the
 * first lap has not yet been completed.
 * • getTotalTime—returns the total time from the start of the race through
 * the last completed lap. Throws an exception if the first lap has not yet
 * been completed.
 * • getLapsRemaining—returns the number of laps yet to be completed,
 * including the current one.
 * Express all times in seconds.
 * To get the current time in milliseconds from some baseline date, invoke
 * Calendar.getInstance().getTimeInMillis()
 * This invocation returns a primitive value of type long. By taking the
 * difference between the returned values of two invocations at two different
 * times, you will know the elapsed time in milliseconds between the
 * invocations. Note that the class Calendar is in the package java.util.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_09_13
{
    // see LapTimer.java
}

