package chapter_06;

public class Time
{
    private int hours, minutes;

    public Time() { }

    private boolean isValid(int hour, int minute)
    {
        return hour > -1 && hour < 24 && minute > -1 && minute < 60;
    }

    public void setTime(int hours, int minutes)
    {
        if (isValid(hours, minutes))
        {
            this.hours = hours;
            this.minutes = minutes;
        }
    }


    public void setTime(int hours, int minutes, boolean isAM)
    {
        if (isValid(hours, minutes))
        {
            if (isAM)
            {
                if (hours > 1 && hours < 13)
                    setTime(hours, minutes);
            }
            else
                setTime(hours, minutes);
        }
    }


    public String getTime24()
    {
        return format(hours) + format(minutes);
    }

    public String getTime12()
    {
        if (hours < 12)
        {
            if (hours == 0)
                return 12 + ":" + minutes + " am";
            return hours + ":" + minutes + " am";
        }
        return (hours-12) + ":" + minutes + " pm";
    }

    private String format(int value)
    {
        if (value < 10)
            return "0" + value;
        return value + "";
    }
}
