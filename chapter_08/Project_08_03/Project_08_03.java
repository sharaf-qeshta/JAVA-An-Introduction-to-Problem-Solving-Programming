package chapter_08;

import javax.print.Doc;

/**
 * 3. Define two classes, Patient and Billing, whose objects are records for a
 * clinic. Derive Patient from the class Person given in Listing 8.1. A Patient
 * record has the patient’s name (defined in the class Person) and
 * identification number (use the type String). A Billing object will contain
 * a Patient object and a Doctor object (from Practice Program 2). Give
 * your classes a reasonable complement of constructors and accessor
 * methods, and an equals method as well. First write a driver program to
 * test all your methods, then write a test program that creates at least two
 * patients, at least two doctors, and at least two Billing records and then
 * displays the total income from the Billing records.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_03
{
    public static void main(String[] args)
    {
        Patient patient1 = new Patient("John Smith", "#1");
        Patient patient2 = new Patient("Smith John", "#2");

        System.out.println(patient1.getID()); // #1
        System.out.println(patient1.getName()); // John Smith
        System.out.println(patient1.equals(patient2)); // false


        Doctor doctor1 = new Doctor(10);
        Doctor doctor2 = new Doctor(20);

        Billing billing1 = new Billing(patient1, doctor2);
        Billing billing2 = new Billing(patient2, doctor2);

        System.out.println(billing1.getDoctor().getOfficeVisitFee()
                + billing2.getDoctor().getOfficeVisitFee()); // 40.0
    }
}
