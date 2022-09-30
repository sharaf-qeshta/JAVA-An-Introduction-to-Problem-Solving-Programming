package chapter_07;

import java.util.Scanner;

/**
 * Class that records the time worked by each of a
 * company's employees during one five-day week.
 * A sample application is in the main method.
 */
public class TimeBook
{
    private static final int NUMBER_OF_EMPLOYEES = 3;
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
     * Reads hours worked for each employee on each day of the
     * work week into the two-dimensional array hours. (The method
     * for input is just a stub in this preliminary version.)
     * Computes the total weekly hours for each employee and
     * the total daily hours for all employees combined.
     */
    public static void main(String[] args)
    {
        TimeBook book = new TimeBook(NUMBER_OF_EMPLOYEES);
        book.setHours();
        book.update();
        book.showTable();
    }

    public TimeBook()
    {
        numberOfEmployees = NUMBER_OF_EMPLOYEES;
        hours = new int[NUMBER_OF_WORKDAYS][numberOfEmployees];
        weekHours = new int[numberOfEmployees];
        dayHours = new int[NUMBER_OF_WORKDAYS];
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
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < hours.length; i++)
        {
            for (int j = 0; j < hours[i].length; j++)
            {
                System.out.print("Enter employee " + i + " work hours at " + getDayName(j) + ": ");
                hours[i][j] = scanner.nextInt();
            }
        }
    }

    public void display(int toBeDisplayed, int spaces)
    {
        String stringRepresentation = toBeDisplayed + "";
        String printed = "";
        for (int i = 0; i < spaces; i++)
        {
            if (i < stringRepresentation.length())
                printed += stringRepresentation.charAt(i);
            else
                printed += " ";
        }
        System.out.print(printed);
    }

    public int getNumberOfEmployees()
    {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees)
    {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getHours(int employee, int day)
    {
        return hours[employee][day];
    }

    public void setHours(int employee, int day, int workHours)
    {
        hours[employee][day] = workHours;
    }

    public int getWeekHours(int employee)
    {
        return weekHours[employee];
    }

    public void setWeekHours(int employee, int workHours)
    {
        weekHours[employee] = workHours;
    }

    public int getDayHours(int employee)
    {
        return dayHours[employee];
    }

    public void setDayHours(int employee, int workHours)
    {
        dayHours[employee] = workHours;
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
        System.out.println();
        // row entries
        for (int day = MON; day <= FRI; day++)
        {
            System.out.print(getDayName(day) + " ");
            for (int column = 0; column < hours[day].length; column++)
                display(hours[day][column], 4);
            display(dayHours[day], 12);
            System.out.println();
        }
        System.out.println();
        System.out.print("Total = ");
        for (int column = 0; column < numberOfEmployees; column++)
            display(weekHours[column], 4);
        System.out.println();
    }

    //Converts 0 to “Monday”, 1 to “Tuesday”, etc.
    //Blanks are inserted to make all strings the same length.
    private String getDayName(int day)
    {
        String dayName = null;
        switch (day)
        {
            case MON:
                dayName = "Monday ";
                break;
            case TUE:
                dayName = "Tuesday ";
                break;
            case WED:
                dayName = "Wednesday";
                break;
            case THU:
                dayName = "Thursday ";
                break;
            case FRI:
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
