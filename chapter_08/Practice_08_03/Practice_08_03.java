package chapter_08;

/**
 * 3. Create a base class called Vehicle that has the manufacturer’s name (type
 * String), number of cylinders in the engine (type int), and owner (type
 * Person given in Listing 8.1). Then create a class called Truck that is derived
 * from Vehicle and has additional properties: the load capacity in tons
 * (type double, since it may contain a fractional part) and towing capacity
 * in tons (type double). Give your classes a reasonable complement of
 * constructors and accessor methods, and an equals method as well. Write
 * a driver program (no pun intended) that tests all your methods.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_08_03
{
    public static void main(String[] args)
    {
        Person owner = new Person("John Smith");

        Vehicle vehicle = new Vehicle("Mercedes-Benz", 8, owner);
        Vehicle truck = new Truck("Mercedes-Benz", 6,
                owner, 16, 18);

        System.out.println(vehicle.equals(truck)); // false
    }
}

