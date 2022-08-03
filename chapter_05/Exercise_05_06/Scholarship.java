package chapter_05;

public class Scholarship
{
    public int numberOfStudents, scholarshipsAwarded
            , scholarshipPerStudent;
    public double totalScholarshipsAmount, donationsReceived, unutilizedBalance;

    public void registerScholarships(int n)
    {
        int studentsGetScholarship = (int) (numberOfStudents * (n/100.0));
        scholarshipsAwarded += studentsGetScholarship;
        scholarshipPerStudent = (int) (totalScholarshipsAmount/studentsGetScholarship);
    }

    public void displayUnutilizedDonations()
    {
        System.out.println("Amount Received $" + donationsReceived);
        System.out.println("Unutilized Balance $" + unutilizedBalance);
    }

}
