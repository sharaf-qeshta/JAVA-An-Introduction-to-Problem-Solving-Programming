package chapter_08;

public class Staff extends Employee
{
    private int payGrade; // 1..20

    public Staff(String initialName,
                 int employeeID,
                 String employeeDepartment)
    {
        super(initialName, employeeID, employeeDepartment);
    }

    public Staff(String initialName,
                 int employeeID,
                 String employeeDepartment,
                 int payGrade)
    {
        super(initialName, employeeID, employeeDepartment);
        this.payGrade = payGrade;
    }

    public int getPayGrade()
    {
        return payGrade;
    }

    public void setPayGrade(int payGrade)
    {
        this.payGrade = payGrade;
    }

    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("\"Pay Grade\": " + payGrade);
    }
}
