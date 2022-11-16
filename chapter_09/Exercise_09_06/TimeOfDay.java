package chapter_09;

public class TimeOfDay
{
    int minutes, hours;

    public void setTimeTo(String timeString) throws InvalidTimeException
    {
        String[] parts = timeString.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        if (hours < 0 || hours > 23)
            throw new InvalidHourException(hours);
        this.hours = hours;

        if (minutes < 0 || minutes > 59)
            throw new InvalidMinuteException(minutes);
        this.minutes = minutes;
    }
}
