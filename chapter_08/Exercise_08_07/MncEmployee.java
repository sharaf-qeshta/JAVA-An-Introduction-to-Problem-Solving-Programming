package chapter_08;

import java.util.Date;

public class MncEmployee
{
    protected String name;
    protected int departmentNumber;
    protected double salary;
    protected Date hiredDate;
    protected String managerName;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getDepartmentNumber()
    {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber)
    {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public Date getHiredDate()
    {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate)
    {
        this.hiredDate = hiredDate;
    }

    public String getManagerName()
    {
        return managerName;
    }

    public void setManagerName(String managerName)
    {
        this.managerName = managerName;
    }
}
