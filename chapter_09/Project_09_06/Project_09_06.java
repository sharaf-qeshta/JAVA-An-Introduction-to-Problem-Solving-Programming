package chapter_09;

import java.util.Scanner;

/**
 * 6. Write a program to enter employee data, including Social Security number
 * and salary, into an array. The maximum number of employees is 100, but
 * your program should also work for any number of employees less than
 * 100. Your program should use two exception classes, one called
 * SSNLengthException for when the Social Security number entered—
 * without dashes or spaces—is not exactly nine characters and the other
 * called SSNCharacterException for when any character in the Social
 * Security number is not a digit. When an exception is thrown, the user
 * should be reminded of what she or he entered, told why it is inappropriate,
 * and asked to reenter the data. After all data has been entered, your program
 * should display the records for all employees, with an annotation stating
 * whether the employee’s salary is above or below average. You will also
 * need to define the classes Employee, SSNLengthException, and
 * SSNCharacterException. Derive the class Employee from the class Person
 * in Listing 8.1 of Chapter 8. Among other things, the class Employee should
 * have input and output methods, as well as constructors, accessor methods,
 * and mutator methods. Every Employee object should record the employee’s
 * name (as defined in Person), salary, and Social Security number, as well
 * as any other data you need or think is appropriate.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_09_06
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[100];
        int index = 0;
        double salarySum = 0;

        Scanner scanner = new Scanner(System.in);
        while (index < 100)
        {
            System.out.println("Insert a record (y/n)? ");
            String answer = scanner.nextLine();
            if (answer.toLowerCase().trim().charAt(0) == 'y')
            {
                Employee employee = new Employee();
                employee.readRecord();
                salarySum += employee.getSalary();
                employees[index++] = employee;
            }
            else
                break;
        }

        double average = salarySum / index;
        for (int i = 0; i < index; i++)
        {
            if (employees[i].getSalary() < average)
                System.out.println(employees[i] + " salary is below average");
            else if (employees[i].getSalary() > average)
                System.out.println(employees[i] + " salary is above the average");
            else
                System.out.println(employees[i] + " salary is equal to average");
        }
    }
}
