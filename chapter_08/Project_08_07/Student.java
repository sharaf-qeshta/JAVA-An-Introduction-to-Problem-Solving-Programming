package chapter_08;

public class Student extends Person implements Comparable<Student>
{
    private int studentNumber;

    public Student()
    {
        super();
        studentNumber = 0;//Indicating no number yet
    }

    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public void reset(String newName, int newStudentNumber)
    {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }

    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("\"Student Number\": " + studentNumber);
    }

    public boolean equals(Student otherStudent)
    {
        return this.hasSameName(otherStudent) &&
                (this.studentNumber == otherStudent.studentNumber);
    }

    @Override
    public int compareTo(Student o)
    {
        return getName().compareTo(o.getName());
    }
}
