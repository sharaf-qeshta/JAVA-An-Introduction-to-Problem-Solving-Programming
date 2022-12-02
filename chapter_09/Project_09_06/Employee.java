package chapter_09;

import java.util.Scanner;

public class Employee extends Person
{
    private double salary;
    private String ssn;

    public Employee()
    {
        super("No Name Yet");
    }

    public void readRecord()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = scanner.nextLine();
        setName(name);

        System.out.println("Enter salary");
        this.salary = scanner.nextDouble();
        scanner.nextLine();
        while (true)
        {
            try
            {
                System.out.println("Enter ssn");
                String ssn = scanner.nextLine();
                checkSSN(ssn);
                this.ssn = ssn;
                break;
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

    public String toString()
    {
        return "Employee: {name: " + getName()
                + ", salary: " + getSalary() + "$, ssn: " + getSsn() + "}";
    }

    public void checkSSN(String ssn)
            throws SSNLengthException, SSNCharacterException
    {
        int length = countDigits(ssn);
        if (length < 9)
            throw new SSNLengthException
                    (ssn + " ssn length less than the allowed length 9!");
        if (length > 9)
            throw new SSNLengthException
                    (ssn + " ssn length exceeds the allowed length 9!");

        if (!validSSN(ssn))
            throw new SSNCharacterException
                    ("you are not allowed to enter characters other than '-' in the ssn");

    }

    public int countDigits(String ssn)
    {
        int digitCount = 0;
        for (int i = 0; i < ssn.length(); i++)
            if (Character.isDigit(ssn.charAt(i)))
                digitCount++;
        return digitCount;
    }

    public boolean validSSN(String ssn)
    {
        for (int i = 0; i < ssn.length(); i++)
            if (!Character.isDigit(ssn.charAt(i)))
                if (ssn.charAt(i) != ' ' && ssn.charAt(i) != '-')
                    return false;
        return true;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getSsn()
    {
        return ssn;
    }
}
