package chapter_05;

/**
 * 2. Define a class called Salary. An object of this class is used to calculate
 * salaries, so it calculates a salary that is a whole number greater than basic
 * salary. Include methods to set the basic salary to 5000, to increase the
 * salary by 10%, and to decrease the salary by 10%. Be sure that no method
 * allows the value of the counter to become less than the basic salary. Also
 * include an accessor method that returns the current salary value, as well as
 * a method that displays the salary on the screen. Do not define an input
 * method. The only method that can set the basic salary is the one that sets
 * it to 5000. Write a program to test your class definition. (Hint: You need
 * only one instance variable.)
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_05_02
{
    public static void main(String[] args)
    {
        Salary salary = new Salary();
        salary.setBasicSalary(5000);
        salary.increaseSalary();
        System.out.println(salary.getSalary()); // 5500.0
        salary.decreaseSalary();
        System.out.println(salary.getSalary()); // 5500.0
        salary.displaySalary(); // Salary: $5500.0
    }
}
