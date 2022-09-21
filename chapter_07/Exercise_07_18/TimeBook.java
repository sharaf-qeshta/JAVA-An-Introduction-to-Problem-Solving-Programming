package chapter_07;



enum DAY { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY }
/**
 Class that records the time worked by each of a
 company's employees during one five-day week.
 A sample application is in the main method.
 */
public class TimeBook
{
    private int numberOfEmployees;
    private int[][] hours; //hours[i][j] has the hours for
    //employee j on day i.
    private int[] weekHours; //weekHours[i] has the week's
    //hours worked for employee i + 1.
    private int[] dayHours; //dayHours[i] has the total hours
    //worked by all employees on day i.
    private static final int NUMBER_OF_WORKDAYS = 5;
    private static final int MON = 0;
    private static final int TUE = 1;
    private static final int WED = 2;
    private static final int THU = 3;
    private static final int FRI = 4;

    /**
     Reads hours worked for each employee on each day of the
     work week into the two-dimensional array hours. (The method
     for input is just a stub in this preliminary version.)
     Computes the total weekly hours for each employee and
     the total daily hours for all employees combined.
     */
    public static void main(String[] args)
    {
        TimeBook book = new TimeBook(3);
        book.setHours();
        book.update();
        book.showTable();
    }

    public TimeBook(int theNumberOfEmployees)
    {
        numberOfEmployees = theNumberOfEmployees;
        hours = new int[NUMBER_OF_WORKDAYS][numberOfEmployees];
        weekHours = new int[numberOfEmployees];
        dayHours = new int[NUMBER_OF_WORKDAYS];
    }

    public void setHours() //This is a stub.
    {
        hours[0][0] = 8; hours[0][1] = 0; hours[0][2] = 9;
        hours[1][0] = 8; hours[1][1] = 0; hours[1][2] = 9;
        hours[2][0] = 8; hours[2][1] = 8; hours[2][2] = 8;
        hours[3][0] = 8; hours[3][1] = 8; hours[3][2] = 4;
        hours[4][0] = 8; hours[4][1] = 8; hours[4][2] = 8;
    }

    public void update()
    {
        computeWeekHours();
        computeDayHours();
    }

    private void computeWeekHours()
    {
        for (int employeeNumber = 1; employeeNumber <=
                numberOfEmployees; employeeNumber++)
        {
            //Process one employee:
            int sum = 0;
            for (int day = MON; day <= FRI; day++)
                sum = sum + hours[day][employeeNumber - 1];
            //sum contains the sum of all the hours worked in
            //one
            //week by the employee with number employeeNumber.
            weekHours[employeeNumber - 1] = sum;
        }
    }

    private void computeDayHours()
    {
        for (int day = MON; day <= FRI; day++)
        {
            //Process one day (for all employees):
            int sum = 0;
            for (int employeeNumber = 1;
                 employeeNumber <= numberOfEmployees;
                 employeeNumber++)
                sum = sum + hours[day][employeeNumber - 1];
            //sum contains the sum of all hours worked by all
            //employees on one day.
            dayHours[day] = sum;
        }
    }

    public void showTable()
    {
        // heading
        System.out.print("Employee ");
        for (int employeeNumber = 1;
             employeeNumber <= numberOfEmployees;
             employeeNumber++)
            System.out.print(employeeNumber + " ");
        System.out.println("Totals");
        System.out.println( );
        // row entries

        int i = 0;
        for (DAY day : DAY.values())
        {
            System.out.print(getDayName(day) + " ");
            for (int column = 0; column < hours[i].length;
                 column++)
                System.out.print(hours[i][column] + " ");
            System.out.println(dayHours[i++]);
        }
        System.out.println( );
        System.out.print("Total = ");
        for (int column = 0; column < numberOfEmployees; column++)
            System.out.print(weekHours[column] + " ");
        System.out.println( );
    }

    //Converts 0 to “Monday”, 1 to “Tuesday”, etc.
    //Blanks are inserted to make all strings the same length.
    private String getDayName(DAY day)
    {
        String dayName = null;
        switch (day)
        {
            case MONDAY:
                dayName = "Monday ";
                break;
            case TUESDAY:
                dayName = "Tuesday ";
                break;
            case WEDNESDAY:
                dayName = "Wednesday";
                break;
            case THURSDAY:
                dayName = "Thursday ";
                break;
            case FRIDAY:
                dayName = "Friday ";
                break;
            default:
                System.out.println("Fatal Error.");
                System.exit(0);
                break;
        }
        return dayName;
    }
}
