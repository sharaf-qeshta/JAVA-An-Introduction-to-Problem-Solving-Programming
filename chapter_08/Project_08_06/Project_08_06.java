package chapter_08;

/**
 * 6. For this Programming Project, start with implementations of the Person,
 * Student, and Undergraduate classes as depicted in Figure 8.4 and the
 * polymorphism demo in Listing 8.6. Define the Employee, Faculty, and
 * Staff classes as depicted in Figure 8.2. The Employee class should have
 * instance variables to store the employee ID as an int and the employee’s
 * department as a String. The Faculty class should have an instance
 * variable to store the faculty member’s title (e.g., “Professor of Computer
 * Science”) as a String. The Staff class should have an instance variable to
 * store the staff member’s pay grade (a number from 1 to 20) as an int.
 * Every class should have appropriate constructors, accessors, and mutators,
 * along with a writeOutput method that outputs all of the instance variable
 * values.
 * Modify the program in Listing 8.6 to include at least one Faculty object
 * and at least one Staff object in addition to the Undergraduate and
 * Student objects. Without modification to the for loop, the report should
 * output the name, employee ID, department, and title for the Faculty
 * objects, and the name, employee ID, department, and pay grade for the
 * Staff objects.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_06
{
    public static void main(String[] args)
    {
        Person[] people = new Person[6];
        people[0] = new Undergradute("Cotty, Manny", 4910, 1);
        people[1] = new Undergradute("Kick, Anita", 9931, 2);
        people[2] = new Student("DeBanque, Robin", 8812);
        people[3] = new Undergradute("Bugg, June", 9901, 4);
        people[4] = new Faculty("John Smith", 1,
                "Computer Science", "Professor of Computer Science");
        people[5] = new Staff("Sharaf Qeshta",
                2, "Computer Science", 10);

        for (Person p : people)
        {
            p.writeOutput();
            System.out.println();
        }
    }
}
