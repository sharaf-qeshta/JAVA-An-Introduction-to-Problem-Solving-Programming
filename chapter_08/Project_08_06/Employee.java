package chapter_08;

public class Employee extends Person
{
    private int employeeID;
    private String employeeDepartment;

    public Employee(String initialName,
                    int employeeID, String employeeDepartment)
    {
        super(initialName);
        this.employeeID = employeeID;
        this.employeeDepartment = employeeDepartment;
    }


    public int getEmployeeID()
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public String getEmployeeDepartment()
    {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment)
    {
        this.employeeDepartment = employeeDepartment;
    }

    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("\"Employee ID\": " + employeeID);
        System.out.println("\"Employee Department\": " + employeeDepartment);
    }
}
