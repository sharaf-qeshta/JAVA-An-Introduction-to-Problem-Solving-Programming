package chapter_08;

/**
 * 2. Define a class named Doctor whose objects are records for a clinic’s
 * doctors. Derive this class from the class Person given in Listing 8.1. A
 * Doctor record has the doctor’s name—defined in the class Person—a
 * specialty as a string (for example Pediatrician, Obstetrician, General
 * Practitioner, and so on), and an office-visit fee (use the type double). Give
 * your class a reasonable complement of constructors and accessor methods,
 * and an equals method as well. Write a driver program to test all your
 * methods.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_08_02
{
    public static void main(String[] args)
    {
        Doctor doctor1 = new Doctor("John Smith", 10);
        doctor1.setOfficeVisitFee(50);

        System.out.println(doctor1.getOfficeVisitFee()); // 50.0

        Doctor doctor2 = new Doctor(40);
        doctor2.setName("Someone");

        System.out.println(doctor1.equals(doctor2)); // false
    }
}
