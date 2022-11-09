package chapter_08;

public class Faculty extends Employee
{
    private String title;

    public Faculty(String initialName,
                   int employeeID,
                   String employeeDepartment)
    {
        super(initialName, employeeID, employeeDepartment);
    }


    public Faculty(String initialName,
                   int employeeID,
                   String employeeDepartment,
                   String title)
    {
        super(initialName, employeeID, employeeDepartment);
        this.title = title;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("\"Title\": " + title);
    }
}
