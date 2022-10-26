package chapter_08;

public class Employee extends Person
{
    private double annualSalary;
    private int hiredYear;
    private String id;

    public Employee(String initialName,
                    double annualSalary, int hiredYear, String id)
    {
        super(initialName);
        this.annualSalary = annualSalary;
        this.hiredYear = hiredYear;
        this.id = id;
    }

    public Employee() { }

    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public int getHiredYear()
    {
        return hiredYear;
    }

    public String getId()
    {
        return id;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    public void setHiredYear(int hiredYear)
    {
        this.hiredYear = hiredYear;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public boolean equals(Employee employee)
    {
        // since the id is unique we can use it in comparison
        return employee.getId().equals(getId());
    }
}
