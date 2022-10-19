package chapter_08;

public class SmartEmployee extends MncEmployee
{
    @Override
    public double getSalary()
    {
        return salary + 3_000;
    }

    @Override
    public String getManagerName()
    {
        return managerName + ", Mr .Pichhoy";
    }
}