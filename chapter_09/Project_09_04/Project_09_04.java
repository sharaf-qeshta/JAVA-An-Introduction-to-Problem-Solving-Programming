package chapter_09;

/**
 * 4. Modify the driver program from Practice Program 3 in Chapter 8 to use
 * three exception classes called CylinderException, LoadException, and
 * TowingException. The number of cylinders must be an integer from 1 to 12,
 * the load capacity must be a number from 1 to 10 (possibly with a fractional
 * part), and the towing capacity must be a number from 1 to 20 (possibly
 * with a fractional part). Anything other than numbers in these ranges should
 * cause your program to throw and catch the appropriate exception. You also
 * need to define the classes CylinderException, LoadException, and
 * TowingException.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_09_04
{
    public static void main(String[] args)
    {
        Person owner = new Person("John Smith");

        try
        {
            Vehicle vehicle = new Vehicle("Mercedes-Benz", 8, owner);
            Vehicle truck = new Truck("Mercedes-Benz", 6,
                    owner, 16, 18);
            System.out.println(vehicle.equals(truck)); // false
        }
        catch (CylinderException | LoadException | TowingException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
