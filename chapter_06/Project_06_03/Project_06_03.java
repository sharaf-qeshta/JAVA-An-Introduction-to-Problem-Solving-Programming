package chapter_06;

/**
 * 3. Complete and fully test the class Time that Exercise 2 describes. Add
 * two more constructors that are analogous to the setTime methods
 * described in Parts c and d of Exercise 2. Also include the following
 * methods:
 * • getTime24 returns a string that gives the time in 24-hour notation
 * hhmm. For example, if the hour value is 7 and the minute value is 25,
 * return "0725". If the hour value is 0 and the minute value is 5, return
 * "0005". If the hour value is 15 and the minute value is 30, return "1530".
 * • getTime12 returns a string that gives the time in 12-hour notation h:mm
 * xx. For example, if the hour value is 7 and the minute value is 25, return
 * "7:25 am". If the hour value is 0 and the minute value is 5, return "12:05
 * am". If the hour value is 15 and the minute value is 30, return "3:30 pm".
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_03
{
    public static void main(String[] args)
    {
        Time time = new Time();
        time.setTime(7, 25);
        /* 0725 */
        System.out.println(time.getTime24());
        time.setTime(0, 5);
        /* 0005 */
        System.out.println(time.getTime24());

        time.setTime(7, 25);
        /* 7:25 am */
        System.out.println(time.getTime12());
        time.setTime(0, 5);
        /* 12:5 am */
        System.out.println(time.getTime12());
        time.setTime(15, 30);
        /* 3:30 pm */
        System.out.println(time.getTime12());
    }
}
