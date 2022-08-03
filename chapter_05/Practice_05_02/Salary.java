package chapter_05;

public class Salary
{
    private static double basicSalary = 0;
    private double salary = basicSalary;

    public void setBasicSalary(double amount)
    {
        basicSalary = amount;
        salary = basicSalary;
    }

    public void increaseSalary()
    {
        salary = salary * 1.1;
    }

    public void decreaseSalary()
    {
        double newSalary = salary * 0.9;
        if (newSalary >= basicSalary)
            salary = newSalary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void displaySalary()
    {
        System.out.println("Salary: $" + salary);
    }
}
